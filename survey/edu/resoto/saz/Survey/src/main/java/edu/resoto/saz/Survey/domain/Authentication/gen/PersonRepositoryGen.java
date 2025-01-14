package edu.resoto.saz.Survey.domain.Authentication.gen;

import edu.resoto.saz.Survey.domain.Authentication.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepositoryGen extends JpaRepository<Person, Long> {

    List<Person> getPersonCollection();

    void setPersonCollection(List<Person> personCollection);

    Person findByGuid(String guid);
}
