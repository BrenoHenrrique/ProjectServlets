package br.com.caelum.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConectaBanco {

    public Statement stmt;// responsável por preparar e realizar pesquisas no banco de dados
    public ResultSet rs;//  responsável por armazenar o resultado de uma pesquisa passada para o Statement
    private final String driver = "com.mysql.jdbc.Driver";
<<<<<<< HEAD
    private final String url = "jdbc:mysql://localhost:3306/banda?useTimezone=true&serverTimezone=UTC";
=======
    private final String url = "jdbc:mysql://localhost:3306/agenda?useTimezone=true&serverTimezone=UTC";
>>>>>>> 2334c34467932a3ff45ff03329876f5f681e6c7d
    private final String user = "root";
    private final String pass = "Over@@lord13";
    public Connection conn;

    public void conecta() { //método para abrir a conexao
        try {
		System.setProperty("jdbc.Drivers", driver);
		conn = DriverManager.getConnection(url, user, pass);
		//System.out.println("banco conectado!");
		} catch(Exception e) {
			e.printStackTrace();
		}
    }

    public void executaSQL(String SQL) {
        try {
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(SQL);
        } catch (SQLException ex) {
            //ex.printStackTrace();
        }
    }

    public void desconecta() {//metodo para fechar a conexão com o banco de dados
        try {
            conn.close();
        } catch (SQLException ex) {
            //ex.printStackTrace();
        }
    }
    
    public static void main(String args[]) {
    	ConectaBanco conexao = new ConectaBanco();
    	conexao.conecta();
    }
}