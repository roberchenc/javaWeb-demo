package hibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/*
 * 完全非静态实现，就是一个工具类，即开即用，用完要自己关
 * 
 */


public class HibernateUtil2 {
	
	private  StandardServiceRegistry registry = null;
	private  SessionFactory sessionFactory = null;
	private Session session = null;
	
	
	public HibernateUtil2() {
		// TODO Auto-generated constructor stub
	
		 try{
	            registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	            //不指定文件名默认是找hibernate.cfg.xml文件
	            //registry = new StandardServiceRegistryBuilder().configure().build(); 
	            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
	        }catch(Exception ex){
	            ex.printStackTrace();
	            StandardServiceRegistryBuilder.destroy(registry);
	        }
	}
	/*Configuration configuration=new Configuration().configure();
	ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().
			applySettings(configuration.getProperties()).buildServiceRegistry();
	sessionFactory=configuration.buildSessionFactory(serviceRegistry);
	session=sessionFactory.openSession();*/
	
	public  SessionFactory getSessionFactory(){
		return 	sessionFactory;
	}
	
	public  Session getSession(){
		session=sessionFactory.openSession();
		return session;
	}
	
	public  void closeSession(){
		if(session!=null)
			session.close();	
	}
	
	public  void closeSessionFactory(){
		if(sessionFactory!=null)
			sessionFactory.close();	
	}
	
	public  void close(){
		if(session!=null)
			session.close();
		if(sessionFactory!=null)
			sessionFactory.close();	
	}

}
