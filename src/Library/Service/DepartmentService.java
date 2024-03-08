package Library.Service;

import Library.Models.DepartmentModel;
import Library.Repository.DepartmentRepository;

public class DepartmentService {
	DepartmentRepository depRepo=new DepartmentRepository();
	
   public int isAddDepartment(DepartmentModel dmodel) {
	   return depRepo.isAddDepartment(dmodel)?1:0 ;
   }
   public boolean isViewDepartment(DepartmentModel dmodel) {
	   return depRepo.isViweDepartment(dmodel);
   }
   public boolean isUpdateDepartment(int did,String dname){
	   return depRepo.isUpdateDepartment(did, dname);
   }
   public boolean isDeleteDepartment(int id) {
	   
	   return depRepo.isDeleteDepartment(id);
   }
}
