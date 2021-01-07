package com.uisrael.prestamosBiblioteca.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.uisrael.prestamosBiblioteca.model.dao.SolicitanteDao;
import com.uisrael.prestamosBiblioteca.model.entities.Solicitante;

public class SolicitanteDaoImpl implements SolicitanteDao {

	@Override
	public void insertarSolicitante(Solicitante nuevoSolicitante) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prestamosBiblioteca_PU");
		EntityManager em=emf.createEntityManager();
		
		try {
			
			em.getTransaction().begin();
			em.persist(nuevoSolicitante);
			em.getTransaction().commit();
			
		}catch(Exception e) {
			
		}
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
