package org.librairy.service.nlp.facade.utils;

import org.junit.Assert;
import org.junit.Test;
import org.librairy.service.nlp.facade.model.Annotation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class AnnotationUtilsTest {

    private static final Logger LOG = LoggerFactory.getLogger(AnnotationUtilsTest.class);

    @Test
    public void merge(){
        List<Annotation> a1l = new ArrayList<>();
        a1l.add(new Annotation(null,0l,"sent", Collections.EMPTY_LIST, null));
        a1l.add(new Annotation(null,2l,"sent", Collections.EMPTY_LIST, null));
        a1l.add(new Annotation(null,8l,"sent", Collections.EMPTY_LIST, null));


        List<Annotation> a2l = new ArrayList<>();
        a2l.add(new Annotation(null,1l,null, Collections.EMPTY_LIST, "uri"));
        a2l.add(new Annotation(null,2l,null, Collections.EMPTY_LIST, "uri"));
        a2l.add(new Annotation(null,8l,null, Collections.EMPTY_LIST, "uri"));
        a2l.add(new Annotation(null,10l,null, Collections.EMPTY_LIST, "uri"));


        List<Annotation> result = AnnotationUtils.merge(a1l, a2l);
        LOG.info("result: " + result);

        Assert.assertEquals(5, result.size());

        Assert.assertEquals("sent", result.get(0).getSentiment());
        Assert.assertEquals(null, result.get(0).getUri());

        Assert.assertEquals("sent", result.get(2).getSentiment());
        Assert.assertEquals("uri", result.get(2).getUri());
    }

}
