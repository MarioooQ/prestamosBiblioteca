package com.uisrael.prestamosBiblioteca.controller;

import java.util.List;

import com.uisrael.prestamosBiblioteca.model.entities.PrestamoDetalle;

public interface PrestamoDetalleController {
	
	public void insertarPrestamoDetalle(PrestamoDetalle nuevoPrestamoDetalle);
	
	public void actualizarPrestamoDetalle(PrestamoDetalle actualizarPrestamoDetalle);
	
	public void eliminarPrestamoDetalle(PrestamoDetalle eliminarPrestamoDetalle);
	
	public List<PrestamoDetalle> listarPrestamoDetalle();

}
