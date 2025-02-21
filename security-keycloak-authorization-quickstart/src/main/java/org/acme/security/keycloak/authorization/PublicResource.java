package org.acme.security.keycloak.authorization;

import java.util.List;

import org.acme.security.keycloak.authorization.AdminResource.Person;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/api/public")
public class PublicResource {

    @GET
    public Person serve() {
        return new Person("pubilc", "public");
    }

    @GET
    @Path("/list")
    public List<Person> list() {
        return List.of(
                new Person("p1", "public"),
                new Person("p2", "public"))

        ;
    }
}
