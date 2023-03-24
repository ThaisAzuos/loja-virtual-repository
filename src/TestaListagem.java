import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory cf = new ConnectionFactory();
		Connection con = cf.recuperarConexao();
		
		PreparedStatement stm = con.prepareStatement("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
		stm.execute();
		
		ResultSet rst = stm.getResultSet();
		
		while(rst.next()) {
			int id = rst.getInt("id");
			System.out.println(id);
			String nome = rst.getString("nome");
			System.out.println(nome);
			String descricao = rst.getString("descricao");
			System.out.println(descricao);
		}
		
		
		con.close();

	}

}
