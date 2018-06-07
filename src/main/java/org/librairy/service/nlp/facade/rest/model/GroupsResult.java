package org.librairy.service.nlp.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class GroupsResult {

    private List<Group> groups;

    public GroupsResult(List<Group> groups) {
        this.groups = groups;
    }

    public GroupsResult(){}

    @JsonProperty(required = true)
    @ApiModelProperty(notes = "list of annotation and frequency of each token", required = true)
    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
