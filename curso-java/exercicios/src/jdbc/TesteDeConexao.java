package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteDeConexao {

	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true"; // se n�o colocar a porta ele admite a padr�o
		final String usuario = "root";
		final String senha = "ess180187";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conex�o efetuada com sucesso!");
		conexao.close();
	}
}