package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@RestResource
@Table(name="PERSON")
public class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="ID")
  private long id;

  @Column(name="FIRSTNAME")
  private String firstName;
  @Column(name="LASTNAME")
  private String lastName;
  @Column(name="CUIL")
  private String CUIL;
	public Person()
	{
		super();
	}

	public Person(Integer id, String firstname, String lastname)
	{
		super();
		this.id = id;
		this.firstName = firstname;
		this.lastName = lastname;
	}
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

  public String getCUIL() {
    return CUIL;
  }

  public void setCUIL(String CUIL) {
    this.CUIL = CUIL;
  }
}
