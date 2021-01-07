package com.uisrael.prestamosBiblioteca.model.dao;

import java.util.List;

import com.uisrael.prestamosBiblioteca.model.entities.Reporte;

public interface ReporteDao {
	
	public void insertarReporte(Reporte nuevoReporte);
	
	public void actualizarReporte(Reporte actualizarReporte);
	
	public void eliminarReporte(Reporte eliminarReporte);
	
	public List<Reporte> listarReporte();

}
