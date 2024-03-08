package Library.Models;

public class DepartmentModel {
   private int did;
   private String dname;
   
   public DepartmentModel() {
	   
   }
   public DepartmentModel(int did,String dname) {
	   this.did=did;
	   this.dname=dname;
   }
   
   public int getDid() {
	return did;
   }
   public void setDid(int did) {
	this.did = did;
   }
   public String getDname() {
	return dname;
   }
   public void setDname(String dname) {
	this.dname = dname;
   }
}
