package Library.Repository;

import Library.Models.BookModel;

public class BookRepository extends DBConfig{
  private int bookId;
  private int getBookId() {
	  try {
		  stmt=conn.prepareStatement("select max(bid) from books");
		  rs=stmt.executeQuery();
		  if(rs.next()) {
			  bookId=rs.getInt(1);
		  }
		  bookId++;
	  }catch(Exception ex) {
		  System.out.println("Error is"+ex);
		  
	  }
	  return bookId;
  }
  public int getDepartmentIdByName(String dname) {
	  try {
		  stmt=conn.prepareStatement("select did from department where dname=?");
		  stmt.setString(1, dname);
		  rs=stmt.executeQuery();
		  if(rs.next()) {
			  return rs.getInt(1);
		  }else {
			  return -1;
		  }  
	  }catch(Exception ex) {
		  System.out.println("Error is>>"+ex);
		  return 0;
	  }
  }
  public int getCategoryIdByName(String name) {
	  try {
		  stmt=conn.prepareStatement("select catid from category where catname=?");
		  stmt.setString(1, name);
		  rs=stmt.executeQuery();
		  if(rs.next()) {
			  return rs.getInt(1);
		  }else {
			  return -1;
		  }  
	  }catch(Exception ex) {
		  System.out.println("Error is>>"+ex);
		  return 0;
	  }
  }
  public boolean isAddBooks(BookModel model,String catname,String dname) {
	  try {
		  int bid=this.getBookId();
		  if(bid!=0) {
		     stmt=conn.prepareStatement("insert into books values(?,?,?,?)");
		     stmt.setInt(1, bid);
		     stmt.setString(2,model.getBookname());
		     stmt.setString(3,model.getAdddate());
		     stmt.setInt(4,model.getRakhno());
		     int value=stmt.executeUpdate();
		     if(value>0)
		     {
		    	 int catid=this.getCategoryIdByName(catname);
		    	 int did=this.getDepartmentIdByName(dname);
//               System.out.println(did+"\t"+catid+"\t"+bid);
		    	 if(catid!=-1 && catid!=0 || did!=-1 && did!=0) {
		    		stmt=conn.prepareStatement("insert into alljoin values(?,?,?)");
		    		stmt.setInt(1, did);
		    		stmt.setInt(2, catid);
		    		stmt.setInt(3, bid);
		    		
		    		return stmt.executeUpdate()> 0 ? true:false;
		         }else if(catid==-1) {
		    	    System.out.println("Category Not Found...!");
		         }else {
		        	 System.out.println("Some Problems There...");
		         }
		    	 
		    	 
		     }else {
			    System.out.println("Some problem there....!!");
		     }
	    }
		  return true;
	  }catch(Exception ex) {
		  System.out.println("Error is >"+ex);
		  return false;
	  }
	  
  }
}
