package com.uisrael.prestamosBiblioteca.model.dao;

import java.util.List;

import com.uisrael.prestamosBiblioteca.model.entities.Solicitante;

public interface SolicitanteDao {
	
	public void insertarSolicitante(Solicitante nuevoSolicitante);
	
	public void actualizarSolicitante(Solicitante actualizarSolicitante);
	
	public void eliminarSolicitante(Solicitante eliminarSolicitante);
	
	public List<Solicitante> listarSolicitante();
}
