package Library.Service;

import Library.Models.StudentModel;
import Library.Repository.StudentRepository;

public class StudentService {
	StudentRepository stuRepo=new StudentRepository();
   public boolean isAddStudent(StudentModel smodel) {
	   return stuRepo.isAddStudent(smodel);
   }
}
