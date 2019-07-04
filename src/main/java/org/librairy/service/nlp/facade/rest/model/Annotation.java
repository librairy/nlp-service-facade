package org.librairy.service.nlp.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

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
    @ApiModelProperty(value = "Target term")
    public Token getToken() {
        return new Token(super.getToken());
    }

    @Override
    @ApiModelProperty(value = "Sentiment features (optional)")
    public String getSentiment() {
        return super.getSentiment();
    }

    @Override
    @ApiModelProperty(value = "The offset (in characters) of the original word form (required)")
    public Long getOffset() {
        return super.getOffset();
    }

    @Override
    @ApiModelProperty(value="Wordnet Synset")
    public List<String> getSynset() {
        return super.getSynset();
    }

    @Override
    @ApiModelProperty(value="Identifier and reference to an external resource (optional)")
    public String getUri() {
        return super.getUri();
    }

}
