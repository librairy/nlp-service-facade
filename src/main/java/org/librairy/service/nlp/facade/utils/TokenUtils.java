package org.librairy.service.nlp.facade.utils;

import com.google.common.base.Strings;
import org.librairy.service.nlp.facade.model.Annotation;
import org.librairy.service.nlp.facade.model.Token;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class TokenUtils {

    private static final Logger LOG = LoggerFactory.getLogger(TokenUtils.class);


    public static Token merge(Token t1, Token t2){
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        Token token = t1;
        if (!Strings.isNullOrEmpty(t2.getTarget())) token.setTarget(t2.getTarget());
        if (!Strings.isNullOrEmpty(t2.getLemma())) token.setLemma(t2.getLemma());
        if (t2.getPos() != null) token.setPos(t2.getPos());
        if (!Strings.isNullOrEmpty(t2.getMorphoFeat())) token.setMorphoFeat(t2.getMorphoFeat());
        if (!Strings.isNullOrEmpty(t2.getType())) token.setType(t2.getType());

        return token;
    }
}
