package edu.resoto.saz.Admin.domain.Authentication;

import edu.resoto.saz.Admin.domain.Authentication.Person;
import edu.resoto.saz.Admin.domain.Authentication.gen.PersonRepositoryGen;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository()
public class PersonRepository implements PersonRepositoryGen {

    public PersonRepository() {
    }

    private List<Person> personCollection;

    @Override
    public List<Person> getPersonCollection() {
        return personCollection;
    }

    @Override
    public void setPersonCollection(List<Person> personCollection) {
        this.personCollection = personCollection;
    }

    public PersonRepository(List<Person> personCollection) {
        this.personCollection = personCollection;
    }

    @Override
    public Person findByGuid(String guid) {
        /* FIXME If you safely want to implement this method, create an extension interface called 
PersonRepositoryExt in the same folder as this class file and run the code 
generator again. Otherwise, this file and all your changes to it will probably get overwritten 
the next time the code generator is executed. */
        throw new UnsupportedOperationException("Not implemented");
    }
}
