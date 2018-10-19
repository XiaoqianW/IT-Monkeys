package com.itmonkeys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itmonkeys.bean.Student;
import com.itmonkeys.service.StudentService;

@Controller
public class StudentController {
	
//	知道注入service对象
	@Autowired
	private StudentService service;
	
	@RequestMapping("students.do")
	public ModelAndView studentList	() {
		System.out.println("接收到请求");
//		调用service对象的方法
		List<Student> list = service.findStudents();
		System.out.println(list);
		return null;
	}
}
