package com.uisrael.prestamosBiblioteca.model.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DETALLE_PRESTAMO")
public class PrestamoDetalle implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPrestamoDetalle;
	
	private int idPrestamo;
	private int idLibro;
	
	public int getIdPrestamoDetalle() {
		return idPrestamoDetalle;
	}
	public void setIdPrestamoDetalle(int idPrestamoDetalle) {
		this.idPrestamoDetalle = idPrestamoDetalle;
	}
	public int getIdPrestamo() {
		return idPrestamo;
	}
	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public PrestamoDetalle() {
	}
	@Override
	public String toString() {
		return "PrestamoDetalle [idPrestamoDetalle=" + idPrestamoDetalle + ", idPrestamo=" + idPrestamo + ", idLibro="
				+ idLibro + "]";
	}
	
}
