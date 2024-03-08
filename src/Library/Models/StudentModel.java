package Library.Models;

public class StudentModel {
  private String sname;
  private String email;
  private String contact;
  
   public StudentModel() {
	   
   }
   
   public StudentModel(String sname,String email,String contact) {
	   this.sname=sname;
	   this.email=email;
	   this.contact=contact;
	   
   }
  
   public String getSname() {
	return sname;
   }
   public void setSname(String sname) {
	this.sname = sname;
   }
   public String getEmail() {
	return email;
   }
   public void setEmail(String email) {
	this.email = email;
   }
   public String getContact() {
	return contact;
   }
   public void setContact(String contact) {
	this.contact = contact;
   }

}
