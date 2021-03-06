/*
 * Source code generated by Celerio, a Jaxio product.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Follow us on twitter: @jaxiosoft
 * Need commercial support ? Contact us: info@jaxio.com
 * Template pack-angular:src/main/java/dto/EntityDTO.java.e.vm
 */
package com.mycompany.myapp.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mycompany.myapp.domain.Civility;
import com.mycompany.myapp.domain.CountryCode;

/**
 * Simple DTO for User.
 */
public class UserDTO {
    public Integer id;
    public String login;
    public String password;
    public String email;
    public Boolean isEnabled;
    public Civility civility;
    public CountryCode countryCode;
    public String firstName;
    public String lastName;
    public LocalDateTime creationDate;
    public String creationAuthor;
    public LocalDateTime lastModificationDate;
    public String lastModificationAuthor;
    public Integer version;;
    public List<RoleDTO> roles;

    @JsonIgnore
    public boolean isIdSet() {
        return id != null;
    }
}