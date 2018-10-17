package deprecated;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = SimpleTableAccess.getSessionFactory();
		MusicVO mvo = new MusicVO();
		
		mvo.setMusicID(1000000000);
		mvo.setMusicTitle("test title");
		mvo.setHash_tags("{str:tojson}");
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(mvo);
		
		session.getTransaction().commit();
		System.out.println("insert Complete");
	}
}
