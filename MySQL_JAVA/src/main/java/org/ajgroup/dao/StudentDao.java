package org.ajgroup.dao;

import java.util.List;

import org.ajgroup.entity.Student;

public interface StudentDao {

	public void createStud(Student student);

	public void deleteStud(int id);

	public void editStud(Student student);

	public Student getStud(int id);

	public List<Student> allStud();
}