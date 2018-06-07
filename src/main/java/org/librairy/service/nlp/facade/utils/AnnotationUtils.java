package org.librairy.service.nlp.facade.utils;

import com.google.common.base.Strings;
import org.librairy.service.nlp.facade.model.Annotation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class AnnotationUtils {

    private static final Logger LOG = LoggerFactory.getLogger(AnnotationUtils.class);


    public static List<Annotation> merge(List<Annotation> al1, List<Annotation> al2){

        List<Annotation> annotations = new ArrayList<>();

        List<Annotation> a1s = al1.stream().sorted((a, b) -> a.getOffset().compareTo(b.getOffset())).collect(Collectors.toList());
        List<Annotation> a2s = al2.stream().sorted((a, b) -> a.getOffset().compareTo(b.getOffset())).collect(Collectors.toList());


        Long index = 0l;
        while(!a1s.isEmpty() || !a2s.isEmpty()){


            Annotation a1 = null;
            while(!a1s.isEmpty()){
                a1 = a1s.get(0);
                if (a1.getOffset() >= index) break;
                if (a1.getOffset() < index) {
                    a1s.remove(a1);
                    a1 =null;
                }
            }

            Annotation a2 = null;
            while(!a2s.isEmpty()){
                a2 = a2s.get(0);
                if (a2.getOffset() >= index) break;
                if (a2.getOffset() < index) {
                    a2s.remove(a2);
                    a2 =null;
                }
            }


            if (a1 == null){
                annotations.addAll(a2s);
                break;
            }

            if (a2 == null){
                annotations.addAll(a1s);
                break;
            }

            Annotation annotation;

            if (a1.getOffset() == a2.getOffset()){
                annotation = merge(a1, a2);
            }else if (a1.getOffset() < a2.getOffset()){
                annotation = a1;
            }else{
                annotation = a2;
            }
            annotations.add(annotation);
            index = annotation.getOffset() + increment(annotation);

        }

        return annotations;
    }


    private static Integer increment(Annotation a){
        if (a.getToken() == null) return 1;
        if (!Strings.isNullOrEmpty(a.getToken().getLemma())){
            return a.getToken().getLemma().length();
        }
        if (!Strings.isNullOrEmpty(a.getToken().getTarget())){
            return a.getToken().getTarget().length();
        }
        return 1;
    }

    public static Annotation merge(Annotation a1, Annotation a2){
        Annotation annotation = new Annotation();
        annotation.setToken(TokenUtils.merge(a1.getToken(), a2.getToken()));
        annotation.setOffset(a1.getOffset());
        if (!Strings.isNullOrEmpty(a1.getSentiment()))  annotation.setSentiment(a1.getSentiment());
        if (!Strings.isNullOrEmpty(a1.getUri()))  annotation.setUri(a1.getUri());
        // latest replace
        if (!Strings.isNullOrEmpty(a2.getSentiment()))  annotation.setSentiment(a2.getSentiment());
        if (!Strings.isNullOrEmpty(a2.getUri()))  annotation.setUri(a2.getUri());
        return annotation;
    }
}
