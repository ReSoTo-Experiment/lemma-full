package edu.resoto.saz.researcher.domain.Tenant.gen;

import edu.resoto.saz.researcher.domain.Authentication.Person;
import edu.resoto.saz.researcher.domain.Tenant.Organization;
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
