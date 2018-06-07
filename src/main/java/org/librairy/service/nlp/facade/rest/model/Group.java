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
public class Group extends org.librairy.service.nlp.facade.model.Group {

    public Group(org.librairy.service.nlp.facade.model.Group group){
        try {
            BeanUtils.copyProperties(this,group);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Group() {
    }

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(value = "unified expression")
    public String getLemma() {
        return super.getLemma();
    }

    @Override
    @ApiModelProperty(value = "external reference")
    public String getUri() {
        return super.getUri();
    }

    @Override
    @ApiModelProperty(value = "Part of speech")
    public PoS getPos() {
        return super.getPos();
    }

    @Override
    @ApiModelProperty(value="Frequency")
    public Long getFreq() {
        return super.getFreq();
    }
}
