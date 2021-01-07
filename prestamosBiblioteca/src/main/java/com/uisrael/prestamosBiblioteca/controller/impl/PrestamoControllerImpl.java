 package com.uisrael.prestamosBiblioteca.controller.impl;

import java.util.List;

import com.uisrael.prestamosBiblioteca.controller.PrestamoController;
import com.uisrael.prestamosBiblioteca.model.dao.PrestamoDao;
import com.uisrael.prestamosBiblioteca.model.dao.impl.PrestamoDaoImpl;
import com.uisrael.prestamosBiblioteca.model.entities.Prestamo;

public class PrestamoControllerImpl implements PrestamoController {
	
	private PrestamoDao prestamoDao;
	
	@Override
	public void insertarPrestamo(Prestamo nuevoPrestamo) {
		
		prestamoDao=new PrestamoDaoImpl();
		prestamoDao.insertarPrestamo(nuevoPrestamo);
		
	}

	@Override
	public void actualizarPrestamo(Prestamo actualizarPrestamo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarPrestamo(Prestamo eliminarPrestamo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Prestamo> listarPrestamo() {
		// TODO Auto-generated method stub
		return null;
	}

}
