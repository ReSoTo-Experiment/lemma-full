package edu.resoto.saz.researcher.domain.Authentication.gen;

import edu.resoto.saz.researcher.domain.Authentication.Person;
import java.util.List;

public interface RoleGen {

    String getName();

    void setName(String name);

    List<Person> getUsers();

    void setUsers(List<Person> users);
}
