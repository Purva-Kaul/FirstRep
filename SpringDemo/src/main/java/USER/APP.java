package USER;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.purva.SpringDemo.DAO.UserDAO;

public class APP {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ApplicationContext context = new ClassPathXmlApplicationContext("USER/Bean.xml");
		//USER1 ob=(USER1)context.getBean("USER");
		
		UserDAO userDAO = (UserDAO)context.getBean("userDAO");
		
		
		String ch = "";
		do {
			USER1 ob=(USER1)context.getBean("USER");
			System.out.println("enter username :-");
		
			ob.setUsername(br.readLine())	;
			System.out.println("enter password");
			
			ob.setUsername(br.readLine())	;
			System.out.println("enter phone :-");
			
			ob.setUsername(br.readLine());
			
			userDAO.adduser(ob);
			System.out.println("\n\n do u want to continue ? y/n");
			ch= br.readLine();
		}
		while (ch.equalsIgnoreCase("y"));
		System.out.println(userDAO.getAllUSER1());
		
		
		

	}

 }