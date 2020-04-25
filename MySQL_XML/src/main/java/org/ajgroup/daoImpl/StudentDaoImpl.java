package org.ajgroup.daoImpl;

import java.util.List;

import javax.sql.DataSource;

import org.ajgroup.dao.StudentDao;
import org.ajgroup.db.DB;
import org.ajgroup.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao {

	@Autowired
	DB db;
	
	private JdbcTemplate jt = new JdbcTemplate(db.getDataSource());

	public void createStud(Student student) {
		// TODO Auto-generated method stub
		
	}

	public void deleteStud(int id) {
		// TODO Auto-generated method stub
		
	}

	public void editStud(Student student) {
		// TODO Auto-generated method stub
		
	}

	public Student getStud(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> allStud() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
