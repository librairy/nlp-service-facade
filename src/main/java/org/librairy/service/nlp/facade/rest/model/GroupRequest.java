package org.librairy.service.nlp.facade.rest.model;

import io.swagger.annotations.ApiModelProperty;
import org.librairy.service.nlp.facade.model.Form;
import org.librairy.service.nlp.facade.model.PoS;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class GroupRequest {

    @ApiModelProperty(notes="Unstructured text")
    private String text;

    @ApiModelProperty(notes="List of PoS to be considered. All when empty")
    private List<PoS> filter;

    @ApiModelProperty(notes="Output form of tokens")
    private Form form;

    public GroupRequest(String text, List<PoS> filter, Form form) {
        this.text = text;
        this.filter = filter;
        this.form = form;
    }

    public GroupRequest(){};

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
}
