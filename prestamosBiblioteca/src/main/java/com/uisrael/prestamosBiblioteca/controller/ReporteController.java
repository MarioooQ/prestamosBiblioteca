package com.uisrael.prestamosBiblioteca.controller;

import java.util.List;

import com.uisrael.prestamosBiblioteca.model.entities.Reporte;

public interface ReporteController {
	
	public void insertarReporte(Reporte nuevoReporte);
	
	public void actualizarReporte(Reporte actualizarReporte);
	
	public void eliminarReporte(Reporte eliminarReporte);
	
	public List<Reporte> listarReporte();

}
