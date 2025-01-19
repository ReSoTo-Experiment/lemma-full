package edu.resoto.saz.Admin.interfaces;

import edu.resoto.saz.Admin.domain.Authentication.Person;
import edu.resoto.saz.Admin.interfaces.gen.AdminServiceGen;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Component()
@RestController()
public class AdminService implements AdminServiceGen {

    @GetMapping(value = "/admin/userId")
    protected Boolean getUser(@PathVariable() String userId) {
        checkRequiredParametersOfGetUser(userId);
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void checkRequiredParametersOfGetUser(String userId) {
        if (userId == null)
            throw new IllegalArgumentException("Required parameter \"userId\" must not be null");
    }

    @PostMapping(value = "/admin")
    protected Boolean createUser(@RequestBody() Person user) {
        checkRequiredParametersOfCreateUser(user);
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void checkRequiredParametersOfCreateUser(Person user) {
        if (user == null)
            throw new IllegalArgumentException("Required parameter \"user\" must not be null");
    }

    @PutMapping(value = "/admin")
    protected Boolean updateUser(@RequestBody() Person user) {
        checkRequiredParametersOfUpdateUser(user);
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void checkRequiredParametersOfUpdateUser(Person user) {
        if (user == null)
            throw new IllegalArgumentException("Required parameter \"user\" must not be null");
    }

    @DeleteMapping(value = "/survey/{userId}")
    protected Boolean deleteUser(@PathVariable() String userId) {
        checkRequiredParametersOfDeleteUser(userId);
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void checkRequiredParametersOfDeleteUser(String userId) {
        if (userId == null)
            throw new IllegalArgumentException("Required parameter \"userId\" must not be null");
    }
}
