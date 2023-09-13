package chap11;

import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class initialMember implements ServletContextListener {

    public initialMember() {
  
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("InitialMember Destroy!");
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	ServletContext application = sce.getServletContext();
    	ArrayList<Member> members = new ArrayList<Member>();

    	for(int i=0; i<8; i++){
    		members.add(new Member("김민재" + i, "mjkim" + i + "@gmail.com"));
    	}
    	
    	members.add(new Member("이강인", null));
    	members.add(new Member("정우영", null));
    	
    	application.setAttribute("members", members);
    	
    	System.out.println("InitialMember Start!");
    }
	
}
