package org.ajgroup.studentDaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.ajgroup.dao.StudentDao;
import org.ajgroup.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentDaoImpl implements StudentDao{

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("db");
	EntityManager em = emf.createEntityManager();
	
	public void createStud(Student student) {
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
	}

	public void deleteStud(int id) {
		Student student = em.find(Student.class, id);
		em.getTransaction().begin();
		em.remove(student);
		em.getTransaction().commit();
	}

	public void editStud(Student student) {
		Student st = em.find(Student.class, student.getId());
		em.getTransaction().begin();
		st.setName(student.getName());
		st.setEmail(student.getEmail());
		st.setAge(student.getAge());
		st.setSex(student.getSex());
		em.getTransaction().commit();
	}

	public Student getStud(int id) {
		return em.find(Student.class, id);
	}

	public List<Student> allStud() {
		Query q = em.createNativeQuery("select * from student", Student.class);
//		Query q = (Query) em.createNativeQuery("select * from student", Student.class);
		List<Student> studs= q.getResultList();
		return studs;
	}

}
