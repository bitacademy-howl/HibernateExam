package deprecated;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

@SuppressWarnings("deprecation")
public class SimpleTableAccess {
	static SessionFactory sf;
	static ServiceRegistry sr;
	
	static {
		try {
			////////////////4. x 대에서 사용하던 방법 /////////////////////
			// sessionFactory 초기화
			Configuration cf = new Configuration();
			
			sr = new ServiceRegistryBuilder().applySettings(cf.getProperties()).build();
			sf = cf.buildSessionFactory(sr);
		} catch(HibernateException e){
			e.printStackTrace();
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sf;
	}

}
