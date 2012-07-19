package com.codegoop.model;

import com.google.common.base.Objects;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import javax.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Person {

  @NotNull(message = "firstName can not be null")
  private String firstName;

  @NotNull(message = "lastName can not be null")
  private String lastName;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return Objects.toStringHelper(this)
        .add("firstName", firstName)
        .add("lastName", lastName)
        .toString();
  }
}