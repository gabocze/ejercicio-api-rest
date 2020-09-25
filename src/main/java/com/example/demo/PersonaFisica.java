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
@Table(name="PERSONA_JURIDICA")
public class PersonaFisica extends Person {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="ID")
  private long id;

  @Column(name="FIRSTNAME")
  private String firstName;
  @Column(name="LASTNAME")
  private String lastName;
	public PersonaFisica()
	{
		super();
	}

	public PersonaFisica(Integer id, String firstname, String lastname)
	{
		super(id);
		this.id = id;
		this.firstName = firstname;
		this.lastName = lastname;
	}
	public PersonaFisica(Integer id, String firstname, String lastname, String CUIL, CuentaCorriente cuentaCorriente)
	{
		super(id, CUIL, cuentaCorriente);
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
}
