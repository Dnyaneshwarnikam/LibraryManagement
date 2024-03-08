package Library.Models;

public class BookModel {
   private String bookname;
   private String adddate;
   private int    rakhno;

public BookModel() {
	   
   }
   public BookModel(String bookname,String adddate,int rakhno) {
	   this.bookname=bookname;
	   this.adddate=adddate;
	   this.rakhno=rakhno;
   }
   public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getAdddate() {
	return adddate;
}
public void setAdddate(String adddate) {
	this.adddate = adddate;
}
public int getRakhno() {
	return rakhno;
}
public void setRakhno(int rakhno) {
	this.rakhno = rakhno;
}

}
