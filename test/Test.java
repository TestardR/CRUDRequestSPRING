package com.romain.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.romain.spring.springjdbc.employee.dao.EmployeeDao;
import com.romain.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/romain/spring/springjdbc/employee/test/config.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");
//		Employee employee = new Employee();
//		employee.setId(2);
//		employee.setFirstName("Bob");
//		employee.setLastName("Ferguson");
//		int result = dao.create(employee);
//		int result = dao.update(employee);
//		int result = dao.delete(2);
//		Employee employee = dao.read(1);
		List<Employee> result = dao.read();
		System.out.println("Employee Record: " + result);
	}

}
