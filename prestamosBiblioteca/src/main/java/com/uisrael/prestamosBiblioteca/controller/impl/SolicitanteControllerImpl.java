package com.uisrael.prestamosBiblioteca.controller.impl;

import java.util.List;

import com.uisrael.prestamosBiblioteca.controller.SolicitanteController;
import com.uisrael.prestamosBiblioteca.model.dao.SolicitanteDao;
import com.uisrael.prestamosBiblioteca.model.dao.impl.SolicitanteDaoImpl;
import com.uisrael.prestamosBiblioteca.model.entities.Solicitante;

public class SolicitanteControllerImpl implements SolicitanteController{

	private SolicitanteDao solicitanteDao;
	@Override
	public void insertarSolicitante(Solicitante nuevoSolicitante) {
		solicitanteDao=new SolicitanteDaoImpl();
		solicitanteDao.insertarSolicitante(nuevoSolicitante);		
	}

	@Override
	public void actualizarSolicitante(Solicitante actualizarSolicitante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarSolicitante(Solicitante eliminarSolicitante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Solicitante> listarSolicitante() {
		// TODO Auto-generated method stub
		return null;
	}

}
