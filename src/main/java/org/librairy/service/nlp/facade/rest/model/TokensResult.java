package org.librairy.service.nlp.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class TokensResult {

    private String tokens;

    public TokensResult(String tokens) {
        this.tokens = tokens;
    }

    public TokensResult(){}

    @JsonProperty(required = true)
    @ApiModelProperty(notes = "The text processed by the service", required = true)
    public String getTokens() {
        return tokens;
    }

    public void setTokens(String tokens) {
        this.tokens = tokens;
    }
}
