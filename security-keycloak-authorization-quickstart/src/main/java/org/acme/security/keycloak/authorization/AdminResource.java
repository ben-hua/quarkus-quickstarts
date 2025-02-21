package org.acme.security.keycloak.authorization;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/api/admin")
public class AdminResource {

    @GET
    public Person manage() {
        return new Person("public", "admin");
    }

    public record Person(String name, String address) {
    }

}
