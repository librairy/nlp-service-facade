package org.librairy.service.nlp.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Annotation extends org.librairy.service.nlp.facade.model.Annotation {

    public Annotation(org.librairy.service.nlp.facade.model.Annotation annotation){
        try {
            BeanUtils.copyProperties(this,annotation);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Annotation() {
    }

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }


    @Override
    @ApiModelProperty(value = "Morphosyntactic feature encoded as a single attribute")
    public String getMorphoFeat() {
        return super.getMorphoFeat();
    }

    @Override
    @ApiModelProperty(value = "Lemma of the term")
    public String getLemma() {
        return super.getLemma();
    }

    @Override
    @ApiModelProperty(value = "Type of the term (optional). Currently, 2 values are possible: open and close.")
    public String getType() {
        return super.getType();
    }

    @Override
    @ApiModelProperty(value = "Part of speech")
    public String getPos() {
        return super.getPos();
    }

    @Override
    @ApiModelProperty(value="Original form")
    public String getForm() {
        return super.getForm();
    }
}
