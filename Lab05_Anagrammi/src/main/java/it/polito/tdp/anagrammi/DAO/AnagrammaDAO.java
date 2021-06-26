package it.polito.tdp.anagrammi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import it.polito.tdp.model.Parola;

public class AnagrammaDAO {
	
	public boolean isCorrect(String parolaNome) {
		 String sql = "SELECT * FROM parola WHERE nome = ?";
		   try {
			   Connection conn = DBConnect.getConnection();
				PreparedStatement st = conn.prepareStatement(sql);
				st.setString(1,parolaNome);
				ResultSet rs = st.executeQuery();
				if(rs.next()) {
					rs.close();
					st.close();
					conn.close();
					return true;
				}else {
					rs.close();
					st.close();
					conn.close();
					return false;
				}
		   }catch(SQLException e){
			   throw new RuntimeException(e);
		   }
				   
	}
	
	

}
