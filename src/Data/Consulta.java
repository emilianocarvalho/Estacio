package Data;

import java.io.IOException;
import java.sql.*;

//com.jnetdirect.jsql.JSQLDriver
//jdbc:JSQLConnect://serverName:portNumber/mydatabase
public class Consulta {

	public static void main(String[] args) throws IOException, SQLException {
		String comando = "Select * from cliente";
		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			String connString = "jdbc:jtds:sqlserver://localhost/SCP;user=sa;password=inttec01;instance=SQLSERVER2;";
	        String username = "sa";
	        String password = "inttec01";

	        Connection conn = DriverManager.getConnection(connString,username,password);			
			System.out.println("Conectado OK");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(comando);
			while (rs.next()) {
				System.out.println("Nome: " + rs.getString(1) +" Fone: " +
						rs.getString(2));
			}
			st.close();
			conn.close();
		} catch(SQLException e){
			System.out.println("Erro no SQL!");
			return;
		} catch(ClassNotFoundException e){
			System.out.println("Driver não Encontrada!");
			return;
		}
		System.in.read();

	}

}
