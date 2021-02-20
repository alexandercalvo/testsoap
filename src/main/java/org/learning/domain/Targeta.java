package org.learning.domain;

public class Targeta {

	private int id;
	private String banco;
	private String Cliente;
	private String numero;
	private String fechaVencimiento;
	
	public Targeta() {
		
	}
	public Targeta(int id, String banco, String cliente, String numero, String fechaVencimiento) {
		
		this.id = id;
		this.banco = banco;
		Cliente = cliente;
		this.numero = numero;
		this.fechaVencimiento = fechaVencimiento;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getCliente() {
		return Cliente;
	}
	public void setCliente(String cliente) {
		Cliente = cliente;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	@Override
	public String toString() {
		return "Targeta [id=" + id + ", banco=" + banco + ", Cliente=" + Cliente + ", numero=" + numero
				+ ", fechaVencimiento=" + fechaVencimiento + "]";
	}
	
	
}
