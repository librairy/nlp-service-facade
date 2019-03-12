package org.librairy.service.nlp.facade.rest.model;

import io.swagger.annotations.ApiModelProperty;
import org.librairy.service.nlp.facade.model.PoS;

import java.util.Collections;
import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class GroupsRequest {

    @ApiModelProperty(notes="multi-gram")
    private Boolean multigrams = false;

    @ApiModelProperty(notes="language ISO 639-1 Code")
    private String lang = null;

    @ApiModelProperty(notes="external references")
    private Boolean references = false;

    @ApiModelProperty(notes="Unstructured text")
    private String text = "";

    @ApiModelProperty(notes="List of PoS to be considered. All when empty")
    private List<PoS> filter = Collections.emptyList();

    public GroupsRequest(String text, List<PoS> filter, Boolean multigrams, Boolean references, String lang) {
        this.text = text;
        this.filter = filter;
        this.multigrams = multigrams;
        this.references = references;
        this.lang = lang;
    }

    public GroupsRequest(){};

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getText() {
        return text;
    }

    public List<PoS> getFilter() {
        return filter;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setFilter(List<PoS> filter) {
        this.filter = filter;
    }

    public Boolean getMultigrams() {
        return multigrams;
    }

    public void setMultigrams(Boolean multigrams) {
        this.multigrams = multigrams;
    }

    public Boolean getReferences() {
        return references;
    }

    public void setReferences(Boolean references) {
        this.references = references;
    }
}
