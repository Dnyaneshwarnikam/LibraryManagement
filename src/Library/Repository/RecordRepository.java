package Library.Repository;

import Library.Models.RecordModel;
import Library.Service.RecordService;

public class RecordRepository extends DBConfig{
  public boolean isAddRecord(RecordModel model) {
	  try {
		  stmt=conn.prepareStatement("insert into records values(?,?,?,?,?)");
		  stmt.setInt(1,model.getSid());
		  stmt.setInt(2,model.getCatid());
		  stmt.setInt(3,model.getBid());
		  stmt.setString(4,model.getIssuedate());
		  stmt.setString(5,model.getReturndate());
		  return stmt.executeUpdate()>0?true:false;
	  }catch(Exception ex) {
		  System.out.println("Error>>!"+ex);
	  }
	  return false;
  }
}
