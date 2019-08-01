package testindb;


	
	
	
	
	


	import java.sql.ResultSet;

	public class purvadb {


		public static void main (String[] args)throws Exception{
		
		int x = DBconfig.executeupdate("insert into departments(dept_name,dept_location)"
		                               +"values ('HR','ABC')");
		int y = DBconfig.executeupdate("insert into employees(emp_name,emp_phone,emp_username,emp_password,dept_id)"+
	            "values ('PURVA','12345','PURVA1','9876',1)");
	           ResultSet dept=DBconfig.executeQuery("Select * from departments");
	           ResultSet emp=DBconfig.executeQuery("Select * from employees");
	   if (x>0 && y>0 && dept.getFetchSize()>0 && emp.getFetchSize()>0) {
		   System.out.println("Test Successful");
	   }
		   else
		   { System.out.println("Test fail");}
	   }
		   
	}
		
		
		
		
		
		
		




}
