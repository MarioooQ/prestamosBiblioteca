package com.uisrael.prestamosBiblioteca.model.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRESTAMO")
public class Prestamo implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPrestamo;
	
	private int idLibro;
	private int idSolicitante;
	private String fechaSolicitud;
	private int diasPrestamo;
	private boolean estadoEntrega;
	
	
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public Prestamo() {
	}
	public int getIdPrestamo() {
		return idPrestamo;
	}
	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}
	public int getIdSolicitante() {
		return idSolicitante;
	}
	public void setIdSolicitante(int idSolicitante) {
		this.idSolicitante = idSolicitante;
	}
	public String getFechaSolicitud() {
		return fechaSolicitud;
	}
	public void setFechaSolicitud(String fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	public int getDiasPrestamo() {
		return diasPrestamo;
	}
	public void setDiasPrestamo(int diasPrestamo) {
		this.diasPrestamo = diasPrestamo;
	}
	public boolean isEstadoEntrega() {
		return estadoEntrega;
	}
	public void setEstadoEntrega(boolean estadoEntrega) {
		this.estadoEntrega = estadoEntrega;
	}
	@Override
	public String toString() {
		return "Prestamo [idPrestamo=" + idPrestamo + ", idLibro=" + idLibro + ", idSolicitante=" + idSolicitante
				+ ", fechaSolicitud=" + fechaSolicitud + ", diasPrestamo=" + diasPrestamo + ", estadoEntrega="
				+ estadoEntrega + "]";
	}
	
}
