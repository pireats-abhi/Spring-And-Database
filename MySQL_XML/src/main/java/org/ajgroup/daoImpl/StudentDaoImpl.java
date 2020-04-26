package org.ajgroup.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.ajgroup.dao.StudentDao;
import org.ajgroup.entity.Student;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentDaoImpl implements StudentDao {

	private DataSource dataSource;
	private JdbcTemplate jt;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jt = new JdbcTemplate(dataSource);
	}

	public void createStud(Student s) {
		String SQL = "insert into student (name,email,age,sex) values (?,?,?,?)";
		jt.update(SQL, s.getName(), s.getEmail(), s.getAge(), s.getSex());
	}

	public void deleteStud(int id) {
		String SQL = "delete from student where id = ?";
		jt.update(SQL, id);
	}

	public void editStud(Student s) {
		String SQL = "update student set name = ? , email = ? , age = ? , sex = ? where id = ?";
		jt.update(SQL, s.getName(), s.getEmail(), s.getAge(), s.getSex(), s.getId());
	}

	public Student getStud(final int id) {
		String SQL = "select * from student where id = " + id;

		ResultSetExtractor<Student> extractor = new ResultSetExtractor<Student>() {

			public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					Student s = new Student();
					s.setId(rs.getInt(1));
					s.setName(rs.getString(2));
					s.setEmail(rs.getString(3));
					s.setAge(rs.getInt(4));
					s.setSex(rs.getString(5));
					return s;
				}
				return null;
			}

		};

		return jt.query(SQL, extractor);
	}

	public List<Student> allStud() {
		return jt.query("select * from student", new RowMapper<Student>() {
			public Student mapRow(ResultSet rs, int rownumber) throws SQLException {
				Student s = new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setEmail(rs.getString(3));
				s.setAge(rs.getInt(4));
				s.setSex(rs.getString(5));
				return s;
			}
		});
	}

}
