package Library.Service;

import Library.Models.BookModel;
import Library.Repository.BookRepository;

public class BookService {
	BookRepository bookRepo=new BookRepository();
  public boolean isAddBooks(BookModel model,String catname,String dname) {
	  return bookRepo.isAddBooks(model, catname,dname); 
  }
}
