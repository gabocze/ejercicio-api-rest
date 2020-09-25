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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@RestResource
@Table(name="CUENTA_CORRIENTE")
public class CuentaCorriente {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="ID")
  private long id;

  @Column(name="NUMERO")
  private long numero;
  @Column(name="SALDO")
  private double saldo;
  @ManyToMany(cascade= {CascadeType.ALL}, mappedBy = "cuentaCorriente.id")
  //@JoinColumn(name="cuenta_id")
  private Collection<Person> titulares;
  
  public CuentaCorriente()
	{
		super();
	}

	public CuentaCorriente(Integer id, long numero, double saldo)
	{
		super();
		this.id = id;
		this.numero = numero;
		this.saldo = saldo;
	}
  public long getNumero() {
    return numero;
  }

  public void setNumero(long numero) {
    this.numero = numero;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

public Collection<Person> getTitulares() {
	return titulares;
}

public void setTitulares(Collection<Person> titulares) {
	this.titulares = titulares;
}
}
