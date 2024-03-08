package Library.Models;

public class RecordModel {
 private int sid,catid,bid;
 private String issuedate;
 private String returndate;
 
 public RecordModel() {
	 
 }
 public RecordModel(int sid,int catid,int bid,String issuedate,String returndate) {
	 this.sid=sid;
	 this.catid=catid;
	 this.bid=bid;
	 this.issuedate=issuedate;
	 this.returndate=returndate;
 }
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public int getCatid() {
	return catid;
}
public void setCatid(int catid) {
	this.catid = catid;
}
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getIssuedate() {
	return issuedate;
}
public void setIssuedate(String issuedate) {
	this.issuedate = issuedate;
}
public String getReturndate() {
	return returndate;
}
public void setReturndate(String returndate) {
	this.returndate = returndate;
}

}
