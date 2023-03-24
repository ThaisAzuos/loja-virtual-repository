import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory cf = new ConnectionFactory();
		Connection con = cf.recuperarConexao();
		
		PreparedStatement stm = con.prepareStatement("DELETE FROM PRODUTO WHERE ID > ?");
		stm.setInt(1, 2);
		
		stm.execute();
		Integer linhasModificadas = stm.getUpdateCount();
		
		System.out.println("Quantidade de linhas que foram executadas: " + linhasModificadas);
		
		con.close();

	}

}
