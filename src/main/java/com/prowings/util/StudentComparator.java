package com.prowings.util;

import java.util.Comparator;

import com.prowings.entity.Student;

public class StudentComparator implements Comparator<Student> {

	//for Ascending
//	@Override
//	public int compare(Student s1, Student s2) {
//		return s1.getName().compareTo(s2.getName());
//	}

	//for Descending
	@Override
	public int compare(Student s1, Student s2) {
		return -s1.getName().compareTo(s2.getName());
	}
}
