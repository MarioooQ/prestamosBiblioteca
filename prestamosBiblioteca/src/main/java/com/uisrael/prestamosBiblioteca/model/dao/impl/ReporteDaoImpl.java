package com.uisrael.prestamosBiblioteca.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.uisrael.prestamosBiblioteca.model.dao.ReporteDao;
import com.uisrael.prestamosBiblioteca.model.entities.Reporte;

public class ReporteDaoImpl implements ReporteDao{

	@Override
	public void insertarReporte(Reporte nuevoReporte) {
		
		EntityManagerFactory emf=new Persistence().createEntityManagerFactory("prestamosBiblioteca_PU");
		EntityManager em=emf.createEntityManager();
		
		try {
			
			em.getTransaction().begin();
			em.persist(nuevoReporte);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void actualizarReporte(Reporte actualizarReporte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarReporte(Reporte eliminarReporte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Reporte> listarReporte() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
