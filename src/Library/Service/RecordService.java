package Library.Service;

import Library.Models.RecordModel;
import Library.Repository.RecordRepository;

public class RecordService {
	
  RecordRepository recRepo=new RecordRepository();	
  public boolean isAddRecord(RecordModel model) {
	  return recRepo.isAddRecord(model) ;
  }
}
