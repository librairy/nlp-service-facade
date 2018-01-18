package org.librairy.service.nlp.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class AnnotationResult {

    private final List<Annotation> annotations;

    public AnnotationResult(List<Annotation> annotations) {
        this.annotations = annotations;
    }

    @JsonProperty(required = true)
    @ApiModelProperty(notes = "list of annotations created by the service", required = true)
    public List<Annotation> getAnnotatedText() {
        return annotations;
    }
}
