package es.inetum.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import es.inetum.modelo.Alumno;
import es.inetum.modelo.Model;
import es.inetum.util.ConnectionManager;

public class AlumnoDAO implements DAO{

	@Override
	public void agregar(Model model) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		ConnectionManager.conectar();
		Connection con = ConnectionManager.getConnection();
		
		
		
	}

	@Override
	public void modificar(Model model) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Model model) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Model> leer(Model model) throws ClassNotFoundException, SQLException {
		
		List<Model> alumnoss = new ArrayList<Model>();
		ConnectionManager.conectar();
		Connection conn = ConnectionManager.getConnection();
		StringBuilder sql = new StringBuilder("SELECT alu_id, alu_nombre, alu_apellido, alu_conocimientos, alu_git FROM alumnos");

		Alumno alumno = (Alumno) model;
		if (alumno.getCodigo() > 0) {
			sql.append(" where alu_id=?");
		}

		PreparedStatement stm = conn.prepareStatement(sql.toString());

		if (alumno.getCodigo() > 0) {
			stm.setInt(1, alumno.getCodigo());
		}

		ResultSet rs = stm.executeQuery();
//		System.out.println(rs.getString("alu_nombre").toString());
		while (rs.next()) {
			alumno = new Alumno();
			alumno.setCodigo(rs.getInt("alu_id"));
			alumno.setNombre(rs.getString("alu_nombre"));
			alumno.setApellido(rs.getString("alu_apellido"));
			alumno.setEstudios(rs.getString("alu_conocimientos"));
			alumno.setLinkArepositorio(rs.getString("alu_git"));
			alumnoss.add(alumno);
		}
		return alumnoss;
	}


}
