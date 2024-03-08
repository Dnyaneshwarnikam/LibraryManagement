package Library.Service;

import Library.Models.CategoryModel;
import Library.Repository.CategoryRepository;

public class CategoryService {
	CategoryRepository catRepo=new CategoryRepository(); 
   public int addCategory(CategoryModel catModel) {
	   return catRepo.isAddCategory(catModel)?1:0;
   }
   public boolean viewCategory(CategoryModel catModel) {
	   return catRepo.isViewCategory(catModel);
	   
   }
   public boolean updateCategory(int id, String name) {
	   return catRepo.isUpdateCategory(name, id);
   }
   public boolean deleteCategory(int cid) {
	   return catRepo.isDeleteCategory(cid);
   }
}
