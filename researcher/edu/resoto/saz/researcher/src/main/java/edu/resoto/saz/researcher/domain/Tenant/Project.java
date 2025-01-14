package edu.resoto.saz.researcher.domain.Tenant;

import edu.resoto.saz.researcher.domain.Tenant.gen.ProjectGen;

public class Project implements ProjectGen {

    public Project() {
    }

    private String guid;

    @Override
    public String getGuid() {
        return guid;
    }

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    private String description;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    public Project(String guid, String name, String description) {
        this.guid = guid;
        this.name = name;
        this.description = description;
    }
}
