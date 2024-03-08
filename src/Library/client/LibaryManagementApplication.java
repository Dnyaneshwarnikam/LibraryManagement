package Library.client;
import java.util.*;

import Library.Models.BookModel;
import Library.Models.CategoryModel;
import Library.Models.DepartmentModel;
import Library.Models.ManagerModel;
import Library.Models.RecordModel;
import Library.Models.StudentModel;
import Library.Service.BookService;
import Library.Service.CategoryService;
import Library.Service.DepartmentService;
import Library.Service.ManagerService;
import Library.Service.RecordService;
import Library.Service.StudentService;
public class LibaryManagementApplication {
public static void main(String[] args) {
    CategoryService cv=new CategoryService();
    CategoryModel model=new CategoryModel();
    BookService bs = new BookService();
    ManagerService ms=new ManagerService();
    Scanner sc=new Scanner(System.in);
    int choicee;
    do {
    	System.out.println("1:Enter Manager Login:");
    	 choicee=sc.nextInt();
    	 switch(choicee){
    	 case 1:
    		 int choice;
    		 sc.nextLine();
    		 System.out.println("Enter Username:");
    		 String username=sc.nextLine();
    		 System.out.println("Enter Password:");
    		 String password=sc.nextLine();
    		 String user="Manager";
    		 String pass="Manager";
    		 if(user.equals(username) && pass.equals(password)){
    		   
	   do {
System.out.println("-----------------------------------------------------------------------------");

		System.out.println("<<HOMEPAGE>>");
		System.out.println("1:Departments:");
		System.out.println("2:Category Of Books:");
		System.out.println("3:Add Books:");
		System.out.println("4:Add Student:");
		System.out.println("5:Issue Book to Student:");
		System.out.println("Enter Your Choice:");
		 choice=sc.nextInt();
		
		switch(choice) {
		case 1:
//---------------------------------------------: Case 1 :----------------------------------------------------------------------			
			int choice1;
			DepartmentModel dmodel=new DepartmentModel();
			DepartmentService ds=new DepartmentService();
			do {
				System.out.println("<----------------------------------------------------------------->");
				System.out.println("1:Add New Department:");
				System.out.println("2:View Departments:");
				System.out.println("3:Update Department:");
				System.out.println("4:Delete Department");
				System.out.println("> Press Zero For Back Homepage <");
				System.out.println("Enter Your Choice:");
				choice1=sc.nextInt();
				switch(choice1) {
				case 1:
					sc.nextLine();
					System.out.println("Enter New Dapartment Name For Add:");
					String dep=sc.nextLine();
					dmodel.setDname(dep);
					int d=ds.isAddDepartment(dmodel);
					if(d==1)
					{
						System.out.println("Department Added Successfully....!!");
					}else {
						System.out.println("Some Problem There.....!");
					}
					break;
				case 2:
					ds.isViewDepartment(dmodel);
					break;
				case 3:
					System.out.println("Enter Department Id or Name For Update:");
					int did=sc.nextInt();
					sc.nextLine();
					String dname=sc.nextLine();
					ds.isUpdateDepartment(did,dname);
					break;
				case 4:
					System.out.println("Enter id For Delete:");
					int id=sc.nextInt();
					ds.isDeleteDepartment(id);
					break;
					default:
						//System.out.println("Wrong Choice...!!");
				}
				
			}while(choice1!=0);
			break;
//----------------------------------------------: End Case 1:-------------------------------------------------------------------------			
		case 2:
//-----------------------------------------------: Case 2 :---------------------------------------------------------------------------			
			int ch;
			do{
				System.out.println("<---------------------------------------------------------------->");
				System.out.println("1:Add New Category:");
				System.out.println("2:View Category:");
				System.out.println("3:Update Category:");
				System.out.println("4:Delete Category:");
				System.out.println("> Press Zero For Back Homepage <");
				System.out.println("Enter Your Choice:");
				System.out.println("<---------------------------------------------------------------->");
				ch=sc.nextInt();
				switch(ch){
				case 1:
					sc.nextLine();
					System.out.println("Enter Category Name:");
					String category=sc.nextLine();
					model.setName(category);
					int res=cv.addCategory(model);
					if(res==1) {
						System.out.println("Category Added Successfull......");
					}
					else
					{
						System.out.println("Some problems there...");
					}
					break;
				case 2:
					cv.viewCategory(model);
					break;
				case 3:
					System.out.println("Enter Category Id or Name For Update:");
					int id=sc.nextInt();
					sc.nextLine();
					String name=sc.nextLine();
					cv.updateCategory(id,name);
					break;
				case 4:
					System.out.println("Enter id For Delete:");
					int cid=sc.nextInt();
		            cv.deleteCategory(cid);
					break;
					default:
						//System.out.println("Wrong Choice..");
				}
			}while(ch!=0);
			break;
//--------------------------------------------------: End Case 2:-------------------------------------------------------------------			
		case 3:
//-------------------------------------------------: Case 3:------------------------------------------------------------------------			
			sc.nextLine();
			System.out.println("Enter Book Name:");
			String bname=sc.nextLine();
			System.out.println("Enter Book Store Date:");
			String date=sc.nextLine();//05-Feb-2024
			Date d1=new Date(date);
			String dateArr[]=d1.toLocaleString().split(",");
			System.out.println("Enter Rackh No:");
			int rakhno=sc.nextInt();
			sc.nextLine();
			System.out.println("Eneter Department name:");
			
			String dname=sc.nextLine();
			System.out.println("Enter Category Name For Store Book:");
			String catName=sc.nextLine();
			BookModel bmodel=new BookModel(bname,dateArr[0],rakhno);
			boolean b=bs.isAddBooks(bmodel, catName,dname);
			if(b)
			{
				System.out.println("Book is Added Successfully......");
			}else {
				System.out.println("Some problem There...*!*****");
			}
			break;
//----------------------------------------------:End Case 3:--------------------------------------------------------------------			
		case 4:
			sc.nextLine();
			StudentService ss=new StudentService();
			System.out.println("Enter Student Name:");
			String sname=sc.nextLine();
			System.out.println("Enter Student Email:");
			String email=sc.nextLine();
			System.out.println("Enter Student Contact:");
			String contact=sc.nextLine();
			StudentModel smodel=new StudentModel(sname,email,contact);
			boolean s=ss.isAddStudent(smodel);
			if(s) {
				System.out.println("Student Added Successfully.....");
			}else {
				System.out.println("Student Not Added:");
			}
			break;
		case 5:
			RecordService rs=new RecordService();
			System.out.println("Enter Student Id:");
			int sid=sc.nextInt();
			System.out.println("Enter Category Id:");
			int catid=sc.nextInt();
			System.out.println("Enter BookId");
			int bid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter issue Date:");
			String issuedate=sc.nextLine();
			Date d2=new Date(issuedate);
			String dateArr1[]=d2.toLocaleString().split(",");
			System.out.println("Enter return Date:");
			String returndate=sc.nextLine();
			Date d3=new Date(returndate);
			String dateArr2[]=d3.toLocaleString().split(",");
			System.out.println(dateArr2[0]);
			RecordModel rmodel=new RecordModel(sid,catid,bid,dateArr1[0],dateArr2[0]);
			boolean r=rs.isAddRecord(rmodel);
			if(r) {
				System.out.println("Record Added Successfully.....");
			}else {
				System.out.println("Record Not Added:");
			}
			break;
		case 6:
			
			break;
		default:
				System.out.println("Wrong Choice....");
		}
	}while(choice<6);
    		 }else {
    			 System.out.println("Incorrect Username And Password...!!");
    		 }
   break;
  }
}while(choicee<=2);
}
}

