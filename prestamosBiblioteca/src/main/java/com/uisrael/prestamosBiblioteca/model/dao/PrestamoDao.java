package com.uisrael.prestamosBiblioteca.model.dao;

import java.util.List;

import com.uisrael.prestamosBiblioteca.model.entities.Prestamo;

public interface PrestamoDao {
	
	public void insertarPrestamo(Prestamo nuevoPrestamo);
	
	public void actualizarPrestamo(Prestamo actualizarPrestamo);
	
	public void eliminarPrestamo(Prestamo eliminarPrestamo);
	
	public List<Prestamo> listarPrestamo();

}
