package edu.resoto.saz.Survey.domain.Tenant.gen;

import edu.resoto.saz.Survey.domain.Tenant.Unit;
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
