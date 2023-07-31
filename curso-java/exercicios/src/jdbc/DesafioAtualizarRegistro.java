package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioAtualizarRegistro {

	public static void main(String[] args) throws SQLException{
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome que est� procurando: ");
		String pesquisa = entrada.nextLine();

		Connection conexao = FabricaConexao.getConexao();		
		String selectSQL = "SELECT codigo, nome FROM pessoas WHERE nome LIKE ? ";
		String updateSQL = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(selectSQL);
		stmt.setString(1, "%" + pesquisa + "%");
		
		ResultSet resultado = stmt.executeQuery();
		
		List<Pessoa> pessoas= new ArrayList<>();
		
		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}

		for (Pessoa p : pessoas) {
			System.out.println(p.getCodigo() + " ==> " + p.getNome());
		}
		
		stmt.close();
		System.out.println("Deseja fazer alguma altera��o? Sim ou N�o");
		String resposta = entrada.next();
		
		while(!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("n�o")) {
			System.out.println("Resposta desconhecida!");			
			System.out.println("Deseja fazer alguma altera��o? Sim ou N�o");
			resposta = entrada.next();
		}
		
		if(resposta.equalsIgnoreCase("sim")) {
			
			System.out.println("Digite o c�digo: ");
			int codigo = entrada.nextInt();
			entrada.nextLine();
			
			System.out.println("Digite o novo nome: ");
			String atualizarPessoa = entrada.nextLine();
			
			stmt = conexao.prepareStatement(updateSQL);
			stmt.setString(1, atualizarPessoa);
			stmt.setInt(2, codigo);
			stmt.execute();
			System.out.println("Altera��o efetuada com sucesso!");
		} else if (resposta.equalsIgnoreCase("n�o")){
			System.out.println("Nenhuma altera��o!");
		}
		System.out.println("Fim da Aplica��o");
		
		stmt.close();
		conexao.close();
		entrada.close();
		
	}
}
