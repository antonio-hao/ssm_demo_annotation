package com.ssm.service;



import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssm.beans.Student;
import com.ssm.dao.IStudentDao;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {
	
	@Resource(name="IStudentDao")
	private IStudentDao dao;
	
	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}
	
	@Override
	@Transactional
	public void addStudent(Student student) {
		dao.inserStudent(student);
	}



}
