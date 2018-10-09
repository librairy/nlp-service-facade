package org.librairy.service.nlp.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class AnnotationsResult {

    private List<Annotation> annotations;

    public AnnotationsResult(List<Annotation> annotations) {
        this.annotations = annotations;
    }

    public AnnotationsResult(){}

    @JsonProperty(required = true)
    @ApiModelProperty(notes = "list of annotations created by the service", required = true)
    public List<Annotation> getAnnotatedText() {
        return annotations;
    }

    public void setAnnotations(List<Annotation> annotations) {
        this.annotations = annotations;
    }

    public void setAnnotatedText(List<Annotation> annotations) {
        this.annotations = annotations;
    }
}
