import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.model.Product;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration().configure("com/config/hibernate.cfg.xml");
		StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
		serviceRegistryBuilder.applySettings(configuration.getProperties());
		ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
		SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);
		Session session = factory.openSession();
		Product product = (Product) session.get(Product.class, 101);
		if (product==null) {
			System.out.println("object doe's not eixt");
		}
		/*else {
			System.out.println(product.getProductId());
			System.out.println(product.getProductName());
			System.out.println(product.getPrice());
		}*/
		
		session.close();
		factory.close();
	}

}
