package org.sz.homework.core;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created By: paullawler
 */
public class Student {

    private final Long id;
    private final String firstName;
    private final String lastName;

    public Student(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @JsonProperty
    public Long getId() {
        return id;
    }

    @JsonProperty
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty
    public String getLastName() {
        return lastName;
    }

}
