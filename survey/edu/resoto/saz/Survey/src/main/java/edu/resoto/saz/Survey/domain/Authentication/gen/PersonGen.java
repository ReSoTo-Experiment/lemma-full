package edu.resoto.saz.Survey.domain.Authentication.gen;

import edu.resoto.saz.Survey.domain.Authentication.Role;
import java.util.List;
import java.util.Set;

public interface PersonGen {

    long getId();

    void setId(long id);

    String getName();

    void setName(String name);

    String getGuid();

    void setGuid(String guid);

    Set<Role> getRoles();

    void setRoles(Set<Role> roles);
}
