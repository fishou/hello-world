package com.alipay.ibatis;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class IStudentDAOImpl implements IStudentDAO{
	private static SqlMapClient sqlMapClient;
	static Reader reader = null;
	static {
		try {
			reader = Resources.getResourceAsReader("com/alipay/ibatis/SqlMapConfig.xml");
			sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(reader);			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void addStudent(Student student) {
		
	}

	public void addStudentBySequece(Student student) {
		// TODO Auto-generated method stub
		
	}

	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub
		
	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	public List<Student> queryAllStudent() {
		List<Student> studentList = null;
		try {
			studentList = sqlMapClient.queryForList("selectAllStudent");
			for(Student student : studentList){
				System.out.println(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Student queryStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> queryStudentByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String args[]){
		IStudentDAOImpl studentDAOImpl = new IStudentDAOImpl();
		studentDAOImpl.queryAllStudent();
	}

}
