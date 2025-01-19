package edu.resoto.saz.Survey.domain.Authentication;

import edu.resoto.saz.Survey.domain.Authentication.gen.RoleGen;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Role implements RoleGen {

    public Role() {
    }
    @Id()
    @GeneratedValue
    private long id;

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

//    private List<Person> users;
//
//    @Override
//    public List<Person> getUsers() {
//        return users;
//    }
//
//    @Override
//    public void setUsers(List<Person> users) {
//        this.users = users;
//    }

    public Role(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
