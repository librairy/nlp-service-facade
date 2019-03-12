package org.librairy.service.nlp.facade.rest.model;

import io.swagger.annotations.ApiModelProperty;
import org.librairy.service.nlp.facade.model.Form;
import org.librairy.service.nlp.facade.model.PoS;

import java.util.Collections;
import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class TokensRequest {

    @ApiModelProperty(notes="multi-gram")
    private Boolean multigrams = false;

    @ApiModelProperty(notes="language ISO 639-1 Code")
    private String lang = null;

    @ApiModelProperty(notes="Unstructured text")
    private String text = "";

    @ApiModelProperty(notes="List of PoS to be considered. All when empty")
    private List<PoS> filter = Collections.emptyList();

    @ApiModelProperty(notes="Output form of tokens (LEMMA or RAW")
    private Form form;

    public TokensRequest(String text, List<PoS> filter, Form form, Boolean multigrams, String lang) {
        this.text = text;
        this.filter = filter;
        this.form = form;
        this.multigrams = multigrams;
        this.lang = lang;
    }

    public TokensRequest(){};

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

    public Form getForm() {
        return form;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setFilter(List<PoS> filter) {
        this.filter = filter;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public Boolean getMultigrams() {
        return multigrams;
    }

    public void setMultigrams(Boolean multigrams) {
        this.multigrams = multigrams;
    }

}
