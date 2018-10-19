package com.itmonkeys.dao;

import java.util.List;

import com.itmonkeys.bean.Student;

public interface StudentDao {

	List<Student> selectStudents();
}
