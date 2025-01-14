package edu.resoto.saz.Survey.domain.Authentication;

import edu.resoto.saz.Survey.domain.Authentication.Role;
import edu.resoto.saz.Survey.domain.Authentication.gen.PersonGen;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity()
public class Person implements PersonGen {

    public Person() {
    }

    @Id()
    @GeneratedValue
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

    @OneToMany
    private Set<Role> roles;

    @Override
    public Set<Role> getRoles() {
        return roles;
    }

    @Override
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Person(long id, String name, String guid, Set<Role> roles) {
        this.id = id;
        this.name = name;
        this.guid = guid;
        this.roles = roles;
    }
}
