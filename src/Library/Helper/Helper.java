package Library.Helper;

import java.io.FileInputStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Properties;

public class Helper {
	
	public static String completepath="";
	public static Properties p=new Properties();
	
	public Helper() {
		  try {
			  Path currentDirectoryPath= FileSystems.getDefault().getPath("");
			  String currentDirectoryName=currentDirectoryPath.toAbsolutePath().toString();
			  completepath=currentDirectoryName+"\\src\\Resource\\db.properties";
			  FileInputStream finf=new FileInputStream(completepath);
			  p.load(finf);
		  }catch(Exception ex) {
			  System.out.println("Error is-->"+ex);
		  }
	  }
}
