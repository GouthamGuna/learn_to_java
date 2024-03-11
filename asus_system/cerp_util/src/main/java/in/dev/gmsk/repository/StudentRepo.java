package in.dev.gmsk.repository;

import in.dev.gmsk.model.Students;
import in.dev.gmsk.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.stream.Stream;

public class StudentRepo {

    public String saveStudents(Students student) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            // start a transaction
            transaction = session.beginTransaction();

            // save the student objects
            session.persist( student );

            // commit transaction
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace( System.out );
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return null;
    }

    public Stream<Students> getAllStudents() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            List<Students> students = session.createQuery( "from Students", Students.class ).list();

            return students.parallelStream();

        } catch (Exception e) {
            e.printStackTrace( System.out );
            return null;
        }
    }
}
