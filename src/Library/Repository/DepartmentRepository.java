package Library.Repository;

import Library.Models.DepartmentModel;

public class DepartmentRepository extends DBConfig{ 
    public boolean isAddDepartment(DepartmentModel dmodel) {
    	try {
    	stmt=conn.prepareStatement("insert into department values(0,?)");
    	stmt.setString(1,dmodel.getDname());
    	return stmt.executeUpdate()>0?true:false;
    	}catch(Exception ex) {
    		System.out.println("Error is>>?"+ex);
    		return false;
    	}
    	
    }
    public boolean isViweDepartment(DepartmentModel dmodel) {
    	try {
    		stmt=conn.prepareStatement("select *from department");
 		    rs=stmt.executeQuery();
 		   while(rs.next())
 		   {
 			    System.out.println(rs.getInt("did")+"\t"+rs.getString("dname"));
 		   }
    	}catch(Exception ex) {
    		System.out.println("Error:"+ex);
    		
    	}
    	return false;
    }
    public boolean isUpdateDepartment(int did,String dname) {
    	try {
 		   stmt=conn.prepareStatement("update department set dname=? where did=?");
 		   stmt.setString(1, dname);
 		   stmt.setInt(2, did);
 		   int value=stmt.executeUpdate();
 		   if(value>0)
 		   {
 			   System.out.println("Department updated successfull......");
 		   }
 		   else {
 			   System.out.println("Some problem There.....!");
 		   }
 			   
 	   }catch(Exception ex) {
 		   System.out.println("Error is >>"+ex);
 		   
 	   }
 	   return false;
    }
    public boolean isDeleteDepartment(int id) {
    	try {
			  stmt=conn.prepareStatement("delete from Department where did=?");
			  stmt.setInt(1, id);
			  int val=stmt.executeUpdate();
			  if(val>0) {
				  System.out.println("Department Deleted Successfully.....");
			  }else {
				  System.out.println("Some Problems There....!");
			  }
		  }catch(Exception e) {
			  System.out.println("Error is>>>"+e);
		  }
    	return true;
    }
    
}
