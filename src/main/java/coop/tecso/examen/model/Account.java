package coop.tecso.examen.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Account extends AbstractPersistentObject {

	private static final long serialVersionUID = 1L;
	private String numero_cuenta;
	private String moneda;
	private Double saldo;
	private List<Movement> movimientos;

	public String getNumero_cuenta() {
		return numero_cuenta;
	}

	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public List<Movement> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<Movement> movimientos) {
		this.movimientos = movimientos;
	}
}