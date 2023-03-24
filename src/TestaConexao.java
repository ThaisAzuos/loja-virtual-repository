import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory cf = new ConnectionFactory();
		Connection con = cf.recuperarConexao();
		System.out.println("Testando conexao");
		con.close();
	}

}
