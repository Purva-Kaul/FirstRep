

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBconfig {
	 
	private static final String DBDRIVER = "org.h2.Driver";
	private static final String DBURL	 = "jdbc:h2:tcp://localhost/~/EMP_M_S";
	private static final String DBUSERNAME  = "sa";
	private static final String DBPASSWORD = "";
	
	private static Connection conn = null ;
	private static Statement stmt = null;
	
	private static void openConnection() throws Exception{
		Class.forName(DBDRIVER);
		conn= DriverManager.getConnection(DBURL,DBUSERNAME,DBPASSWORD);
		stmt=conn.createStatement();
		
	}
public static int executeupdate (String sql)throws Exception{
	openConnection();
	return stmt.executeUpdate(sql);
}
public static ResultSet executeQuery (String sql)throws Exception{
	openConnection();
	return stmt.executeQuery(sql);
}
}


