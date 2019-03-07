package coop.tecso.examen.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "TJ")
public class JuridicalOwner extends Owner {

	private static final long serialVersionUID = 1L;
	private String razon_social;
	private String anio_fundacion;

	public String getRazon_social() {
		return razon_social;
	}

	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}

	public String getAnio_fundacion() {
		return anio_fundacion;
	}

	public void setAnio_fundacion(String anio_fundacion) {
		this.anio_fundacion = anio_fundacion;
	}

}