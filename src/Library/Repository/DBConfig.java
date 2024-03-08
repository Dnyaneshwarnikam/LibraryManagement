package Library.Repository;
import java.sql.*;

import Library.Helper.Helper;

public class DBConfig {
  protected Connection conn;
  protected PreparedStatement stmt;
  protected ResultSet rs;
  
  public DBConfig() {
	  try {
		  Helper phelp=new Helper();
		  Class.forName(Helper.p.getProperty("driver"));
		  conn=DriverManager.getConnection(Helper.p.getProperty("url"),Helper.p.getProperty("user"),Helper.p.getProperty("pass"));
	  }catch(Exception ex) {
		  System.out.println("Error is>>"+ex);
	  }
  }
}
