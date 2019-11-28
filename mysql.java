package javasql;
import java.sql.*;
public class Con {
	
	static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost/jswing?autoReconnect=true&useSSL=false";
	static final String USER="root";
	static final String PASS="";
	static Connection conn=null;
	static PreparedStatement statement=null;
	static ResultSet rs=null;
	static String sql;
	
	public static void main(String[] ags) {
		
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting to database!!");
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			System.out.println("CONNECTED!!");
			sql="SELECT * FROM details";
			statement=conn.prepareStatement(sql);
			rs=statement.executeQuery(sql);
			
			while(rs.next()) {
				int id=rs.getInt("ID");
				System.out.println("id:"+id);
				
			}
			rs.close();
		    statement.close();
		    conn.close();
			
		}
		catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(statement!=null)
					statement.close();
			}catch(SQLException se2) {	
			}
			try{
				if(conn!=null)
				conn.close();
			}catch(SQLException se){
				se.printStackTrace();
				
			}
		}
		System.out.println("Thank you!");
	}

}
