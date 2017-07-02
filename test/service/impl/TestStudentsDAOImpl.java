package service.impl;

import java.util.List;

import org.junit.Test;

import entity.Students;
import service.StudentsDAO;

public class TestStudentsDAOImpl {
	@Test
	public void testQueryAllStudents(){
		StudentsDAO sdao=new StudentsDAOImpl();
		List<Students> list=sdao.queryAllStudents();
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	
	
	
	

}
