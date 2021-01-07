package com.uisrael.prestamosBiblioteca.controller.impl;

import java.util.List;

import com.uisrael.prestamosBiblioteca.controller.ReporteController;
import com.uisrael.prestamosBiblioteca.model.dao.ReporteDao;
import com.uisrael.prestamosBiblioteca.model.dao.impl.ReporteDaoImpl;
import com.uisrael.prestamosBiblioteca.model.entities.Reporte;

public class ReporteControllerImpl implements ReporteController{

	private ReporteDao reporteDao;
	
	@Override
	public void insertarReporte(Reporte nuevoReporte) {
		// TODO Auto-generated method stub
		
		reporteDao=new ReporteDaoImpl();
		reporteDao.insertarReporte(nuevoReporte);
		
	}

	@Override
	public void actualizarReporte(Reporte actualizarReporte) {
		// TODO Auto-generated method stub
		reporteDao=new ReporteDaoImpl();
		reporteDao.actualizarReporte(actualizarReporte);
		
	}

	@Override
	public void eliminarReporte(Reporte eliminarReporte) {
		// TODO Auto-generated method stub
		reporteDao=new ReporteDaoImpl();
		reporteDao.eliminarReporte(eliminarReporte);
		
	}

	@Override
	public List<Reporte> listarReporte() {
		// TODO Auto-generated method stub
		return null;
	}

}
