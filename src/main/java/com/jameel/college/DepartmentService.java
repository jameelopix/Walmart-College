package com.jameel.college;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

	List<Department> departments = new LinkedList<>();

	public DepartmentService() {
		Department finance = new Department(1, "Finance", "Finance Sector");
		Department hostel = new Department(2, "Hostel", "Hostel inventory");
		Department computer = new Department(3, "Computer Science", "Computer Engineering");

		departments.add(finance);
		departments.add(hostel);
		departments.add(computer);
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public Department getDepartments(int id) {
		for (Department department : departments) {
			if (department.getId() == (id)) {
				return department;
			}
		}
		return null;
	}

	public String addDepartment(Department department) {
		department.setId(departments.size() + 1);
		departments.add(department);
		return "SUCCESS";
	}
}