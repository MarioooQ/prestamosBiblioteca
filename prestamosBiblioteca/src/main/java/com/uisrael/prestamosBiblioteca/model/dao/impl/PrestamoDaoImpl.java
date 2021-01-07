package com.uisrael.prestamosBiblioteca.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.uisrael.prestamosBiblioteca.model.dao.PrestamoDao;
import com.uisrael.prestamosBiblioteca.model.entities.Prestamo;

public class PrestamoDaoImpl implements PrestamoDao {

	@Override
	public void insertarPrestamo(Prestamo nuevoPrestamo) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prestamosBiblioteca_PU");
		EntityManager em=emf.createEntityManager();
		try {
			
			em.getTransaction().begin();
			em.persist(nuevoPrestamo);
			em.getTransaction().commit();
			
		}catch(Exception e) {
			
		}
	
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
