package edu.resoto.saz.Admin.domain.Tenant;

import edu.resoto.saz.Admin.domain.Tenant.Unit;
import edu.resoto.saz.Admin.domain.Tenant.gen.OrganizationGen;
import java.util.List;

public class Organization implements OrganizationGen {

    public Organization() {
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

    private List<Unit> units;

    @Override
    public List<Unit> getUnits() {
        return units;
    }

    @Override
    public void setUnits(List<Unit> units) {
        this.units = units;
    }

    public Organization(String guid, String name, String description, List<Unit> units) {
        this.guid = guid;
        this.name = name;
        this.description = description;
        this.units = units;
    }
}
