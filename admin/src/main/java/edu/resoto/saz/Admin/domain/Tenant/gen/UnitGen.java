package edu.resoto.saz.Admin.domain.Tenant.gen;

import edu.resoto.saz.Admin.domain.Authentication.Person;
import edu.resoto.saz.Admin.domain.Tenant.Organization;
import java.util.List;

public interface UnitGen {

    String getGuid();

    void setGuid(String guid);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    Organization getOrganization();

    List<Person> getMembers();

    void setMembers(List<Person> members);
}
