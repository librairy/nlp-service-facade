package org.librairy.service.nlp.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class GroupResult {

    private List<Token> tokens;

    public GroupResult(List<Token> tokens) {
        this.tokens = tokens;
    }

    public GroupResult(){}

    @JsonProperty(required = true)
    @ApiModelProperty(notes = "list of tokens created by the service", required = true)
    public List<Token> getTokens() {
        return tokens;
    }

    public void setTokens(List<Token> tokens) {
        this.tokens = tokens;
    }
}
