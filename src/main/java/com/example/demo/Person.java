package com.example.demo;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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

  @ManyToMany(cascade= {CascadeType.ALL})
  //@JoinColumn(name="persona_id")
  private Collection<CuentaCorriente> cuentaCorriente;

  @Column(name="CUIL")
  private String CUIL;
	public Person()
	{
		super();
	}

	public Person(Integer id)
	{
		super();
		this.id = id;
	}

	public Person(Integer id, Collection<CuentaCorriente> cuentaCorriente)
	{
		super();
		this.id = id;
		this.cuentaCorriente = cuentaCorriente;
	}  
	
	public String getCUIL() {
    return CUIL;
  }

  public void setCUIL(String CUIL) {
    this.CUIL = CUIL;
  }

public Collection<CuentaCorriente> getCuentaCorriente() {
	return cuentaCorriente;
}

public void setCuentaCorriente(Collection<CuentaCorriente> cuentaCorriente) {
	this.cuentaCorriente = cuentaCorriente;
}
}
