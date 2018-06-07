package org.librairy.service.nlp.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;
import org.librairy.service.nlp.facade.model.PoS;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Token extends org.librairy.service.nlp.facade.model.Token {

    public Token(org.librairy.service.nlp.facade.model.Token token){
        try {
            BeanUtils.copyProperties(this,token);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Token() {
    }

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(value="Original form")
    public String getTarget() {
        return super.getTarget();
    }


    @Override
    @ApiModelProperty(value = "Lemma of the term (optional)")
    public String getLemma() {
        return super.getLemma();
    }

    @Override
    @ApiModelProperty(value = "Morphosyntactic feature encoded as a single attribute (optional)")
    public String getMorphoFeat() {
        return super.getMorphoFeat();
    }

    @Override
    @ApiModelProperty(value = "Part of speech (optional)")
    public PoS getPos() {
        return super.getPos();
    }

    @Override
    @ApiModelProperty(value = "Category of the term (optional)")
    public String getType() {
        return super.getType();
    }

}
