package com.jameel.college;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollegeController {

	@Autowired
	DepartmentService departmentService;

	@GetMapping("/department")
	public List<Department> getDepartments() {
		return departmentService.getDepartments();
	}

	@GetMapping("/department/{deptId}")
	public Department getDepartments(@PathVariable("deptId") String deptId) {
		int id = Integer.parseInt(deptId);
		return departmentService.getDepartments(id);
	}

	@PostMapping("/department")
	public String addDepartments(@RequestBody Department department) {
		return departmentService.addDepartment(department);
	}
}
