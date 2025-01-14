package edu.resoto.saz.Admin.domain.Tenant;

import edu.resoto.saz.Admin.domain.Authentication.Person;
import edu.resoto.saz.Admin.domain.Tenant.Organization;
import edu.resoto.saz.Admin.domain.Tenant.gen.UnitGen;
import java.util.List;

public class Unit implements UnitGen {

    public Unit() {
    }

    private String guid;

    @Override
    public String getGuid() {
        return guid;
    }

    @Override
    public void setGuid(String guid) {
        this.guid = guid;
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

    private Organization organization;

    @Override
    public Organization getOrganization() {
        return organization;
    }

    private List<Person> members;

    @Override
    public List<Person> getMembers() {
        return members;
    }

    @Override
    public void setMembers(List<Person> members) {
        this.members = members;
    }

    public Unit(String guid, String name, String description, Organization organization, List<Person> members) {
        this.guid = guid;
        this.name = name;
        this.description = description;
        this.organization = organization;
        this.members = members;
    }
}
