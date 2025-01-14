package edu.resoto.saz.Admin.domain.Authentication.gen;

import edu.resoto.saz.Admin.domain.Authentication.Person;
import java.util.List;

public interface PersonRepositoryGen {

    List<Person> getPersonCollection();

    void setPersonCollection(List<Person> personCollection);

    Person findByGuid(String guid);
}
