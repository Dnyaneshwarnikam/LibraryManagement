package Library.Repository;

import Library.Models.CategoryModel;

public class CategoryRepository extends DBConfig {
   public boolean isAddCategory(CategoryModel catModel) {
	   try {
		   stmt=conn.prepareStatement("insert into category values(0,?)");
		   stmt.setString(1,catModel.getName());
		   return stmt.executeUpdate()>0?true:false;
		   
	   }catch(Exception ex) {
		   System.out.println("Error is>>"+ex);
		   return false;
	   } 
   }
   public boolean isViewCategory(CategoryModel catModel) {
	   try {
		   stmt=conn.prepareStatement("select *from category");
		   rs=stmt.executeQuery();
		   while(rs.next())
		   {
			    System.out.println(rs.getInt("catid")+"\t"+rs.getString("catname"));
		   }
	   }catch(Exception ex) {
		   System.out.println("Error Is>"+ex);
		   
	   }
	   return false;
   }
   public boolean isUpdateCategory(String name,int id) {
	   try {
		   stmt=conn.prepareStatement("update category set catname=? where catid=?");
		   stmt.setString(1, name);
		   stmt.setInt(2, id);
		   int value=stmt.executeUpdate();
		   if(value>0)
		   {
			   System.out.println("Category updated successfull......");
		   }
		   else {
			   System.out.println("Some problem There.....!");
		   }
			   
	   }catch(Exception ex) {
		   System.out.println("Error is >>"+ex);
		   
	   }
	   return false;
   }
   public boolean isDeleteCategory(int cid) {
		  try {
			  stmt=conn.prepareStatement("delete from category where catid=?");
			  stmt.setInt(1, cid);
			  int val=stmt.executeUpdate();
			  if(val>0) {
				  System.out.println("Category Deleted Successfully.....");
			  }else {
				  System.out.println("Some Problems There....!");
			  }
		  }catch(Exception e) {
			  System.out.println("Error is>>>"+e);
		  }
	   return false;
   }
   
   
   
   
   
   
   
   
   
   
}
