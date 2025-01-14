package edu.resoto.saz.researcher.domain.Authentication;

import edu.resoto.saz.researcher.domain.Authentication.Role;
import edu.resoto.saz.researcher.domain.Authentication.gen.PersonGen;
import java.util.List;
import javax.persistence.Entity;

@Entity()
public class Person implements PersonGen {

    public Person() {
    }

    private long id;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
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

    private String guid;

    @Override
    public String getGuid() {
        return guid;
    }

    @Override
    public void setGuid(String guid) {
        this.guid = guid;
    }

    private List<Role> roles;

    @Override
    public List<Role> getRoles() {
        return roles;
    }

    @Override
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Person(long id, String name, String guid, List<Role> roles) {
        this.id = id;
        this.name = name;
        this.guid = guid;
        this.roles = roles;
    }
}
