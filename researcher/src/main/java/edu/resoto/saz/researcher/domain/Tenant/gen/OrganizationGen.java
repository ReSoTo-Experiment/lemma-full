package edu.resoto.saz.researcher.domain.Tenant.gen;

import edu.resoto.saz.researcher.domain.Tenant.Unit;
import java.util.List;

public interface OrganizationGen {

    String getGuid();

    void setGuid(String guid);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    List<Unit> getUnits();

    void setUnits(List<Unit> units);
}
