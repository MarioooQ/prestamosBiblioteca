package com.uisrael.prestamosBiblioteca.controller;

import java.util.List;

import com.uisrael.prestamosBiblioteca.model.entities.Prestamo;

public interface PrestamoController {
	
	public void insertarPrestamo(Prestamo nuevoPrestamo);
	
	public void actualizarPrestamo(Prestamo actualizarPrestamo);
	
	public void eliminarPrestamo(Prestamo eliminarPrestamo);
	
	public List<Prestamo> listarPrestamo();

}
