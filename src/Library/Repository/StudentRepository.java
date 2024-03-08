package Library.Repository;

import Library.Models.StudentModel;

public class StudentRepository extends DBConfig {
	
   public boolean isAddStudent(StudentModel smodel) {
	   try {
		   stmt=conn.prepareStatement("insert into student values(0,?,?,?)");
		   stmt.setString(1,smodel.getSname());
		   stmt.setString(2,smodel.getEmail());
		   stmt.setString(3,smodel.getContact());
		   return stmt.executeUpdate()>0?true:false;
	   }catch(Exception ex) {
		   System.out.println("Error is :"+ex);
		   return false;
	   }
	   
   }
}
