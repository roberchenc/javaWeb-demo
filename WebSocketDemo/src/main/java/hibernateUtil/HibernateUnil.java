package hibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


/*
 * 静态实现，相当于全局变量
 * 
 */

public class HibernateUnil {
	/*
	@Bean
	public HibernateSessionFactory sessionFactory(){
		
	}
*/
	private static StandardServiceRegistry registry = null;
	private static SessionFactory sessionFactory = null;
	//获取SessionFactory
	    public static SessionFactory getSessionFactory(){
	        
	        try{
	            registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	            //不指定文件名默认是找hibernate.cfg.xml文件
	            //registry = new StandardServiceRegistryBuilder().configure().build(); 
	            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
	        }catch(Exception ex){
	            ex.printStackTrace();
	            StandardServiceRegistryBuilder.destroy(registry);
	        }
	        return sessionFactory;
	    }
	     
	    //打开并返回一个Session 
	    public static Session openSession(){
	        return sessionFactory.openSession();
	    }
	    
	    //关闭Session
	    public static void closeSession(Session session){
	        if(null != session){
	            session.close();
	        }
	    }   
	      
	    public static Session getCurrentSession()  
	    {  
	        return sessionFactory.getCurrentSession();  
	    }  
	
}
