package modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;

import java.sql.Date;

public class Main {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());

		try {

			Fabricante fabricante = new Fabricante("pc gaming 100");
			Session session = context.currentSession();
			session.beginTransaction();
			session.save(fabricante);
			session.getTransaction().commit();

			Producto producto = new Producto("PORTATIL gaming 100", 3000.00, fabricante);
			Session session1 = context.currentSession();
			session1.beginTransaction();
			session1.save(producto);
			session1.getTransaction().commit();

			Compras compra = new Compras(Date.valueOf("2024-08-18"), 100, producto);
			Session session2 = context.currentSession();
			session2.beginTransaction();
			session2.save(compra);
			session2.getTransaction().commit();

			System.out.println(producto.toString());
			System.out.println(fabricante.toString());
			System.out.println(compra.toString());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			context.unbind(sessionFactory);
			sessionFactory.close();
		}

	}

}