package com.itmonkeys.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.itmonkeys.bean.Student;
import com.itmonkeys.dao.StudentDao;

//创建service对象
@Service
public class StudentServiceImpl implements StudentService {
	
//	自动注入Dao对象
	@Autowired
	private StudentDao dao;
	
	@Override
	public List<Student> findStudents() {
		return dao.selectStudents();
	}
	
}
