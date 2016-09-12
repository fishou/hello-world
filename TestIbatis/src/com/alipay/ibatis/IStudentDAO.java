package com.alipay.ibatis;

import java.util.List;

public interface IStudentDAO {
	public void addStudent(Student student);
	public void addStudentBySequece(Student student);
	public void deleteStudentById(int id);
	public void updateStudent(Student student);
	public List<Student> queryAllStudent();
	public Student queryStudentById(int id);
	public List<Student> queryStudentByName(String name);
	//helloworld
}
