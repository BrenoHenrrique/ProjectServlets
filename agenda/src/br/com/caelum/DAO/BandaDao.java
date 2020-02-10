package br.com.caelum.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
<<<<<<< HEAD
import java.text.ParseException;
import java.text.SimpleDateFormat;
=======
>>>>>>> 2334c34467932a3ff45ff03329876f5f681e6c7d

import br.com.caelum.JDBC.ConectaBanco;
import br.com.caelum.controller.Banda;

public class BandaDao {

	ConectaBanco conexao = new ConectaBanco();
	PreparedStatement stmt = null;
	
	public void insertBanda(Banda banda) {
		conexao.conecta();
		try {
<<<<<<< HEAD
			stmt = conexao.conn.prepareStatement("insert into agenda(nome, genero, lugar, capacidade, dataShow) values(?,?,?,?,?)");
			stmt.setString(1, banda.getNomeBanda());
			stmt.setString(2, banda.getGenero());
			stmt.setString(3, banda.getLugar());
			stmt.setString(4, banda.getCapacidade());
			//converte a data para formato date
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");  
	        java.sql.Date data = new java.sql.Date(format.parse(banda.getDataShow()).getTime());
	        stmt.setDate(5, data);
	        
			stmt.execute();
			stmt.close();
		}catch(SQLException | ParseException ex) {
=======
			stmt = conexao.conn.prepareStatement("insert into banda(nome, genero) values(?,?)");
			stmt.setString(1, banda.getNomeBanda());
			stmt.setString(2, banda.getGenero());
			stmt.execute();
			stmt.close();
		}catch(SQLException ex) {
>>>>>>> 2334c34467932a3ff45ff03329876f5f681e6c7d
			ex.printStackTrace();
		}
		conexao.desconecta();
	}
	
	public void deleteBanda(Banda banda) {
		conexao.conecta();
		try {
<<<<<<< HEAD
			stmt = conexao.conn.prepareStatement("delete from agenda where nome=?");
=======
			stmt = conexao.conn.prepareStatement("delete from banda where nome=?");
>>>>>>> 2334c34467932a3ff45ff03329876f5f681e6c7d
			stmt.setString(1, banda.getNomeBanda());
			stmt.execute();
			stmt.close();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		conexao.desconecta();
	}
<<<<<<< HEAD
	
	public void updateBanda(Banda banda) {
		conexao.conecta();
		try {
		stmt = conexao.conn.prepareStatement("update agenda set lugar=?, capacidade=?, dataShow=? where nome=?");	
		stmt.setString(1, banda.getLugar());
		stmt.setString(2, banda.getCapacidade());
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");  
        java.sql.Date data = new java.sql.Date(format.parse(banda.getDataShow()).getTime());
        stmt.setDate(3, data);
        
        stmt.setString(4, banda.getNomeBanda());
		stmt.execute();
		stmt.close();
		}catch(SQLException | ParseException ex) {
			ex.printStackTrace();
		}
		conexao.desconecta();
	}
	
	public static void main(String args[]) {
		
	}
=======
>>>>>>> 2334c34467932a3ff45ff03329876f5f681e6c7d
}
