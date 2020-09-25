package com.example.demo;

import java.util.Date;

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
public class PersonaJuridica extends Person {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="ID")
  private long id;

  @Column(name="RAZON_SOCIAL")
  private String razonSocial;
  @Column(name="FECHA_CREACION")
  private Date fechaCreacion;
	public PersonaJuridica()
	{
		super();
	}

	public PersonaJuridica(Integer id, String razonSocial, Date fechaCreacion)
	{
		super(id);
		this.id = id;
		this.razonSocial = razonSocial;
		this.fechaCreacion = fechaCreacion;
	}
  public String getRazonSocial() {
    return razonSocial;
  }

  public void setRazonSocial(String razonSocial) {
    this.razonSocial = razonSocial;
  }

  public Date getFechaCreacion() {
    return fechaCreacion;
  }

  public void setFechaCreacion(Date fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
  }
}
