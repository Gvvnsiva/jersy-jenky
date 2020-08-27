package org.dxc.rest;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.dxc.rest.Entity.Employee;
import org.dxc.rest.repository.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootRestJerseyApplication {
	@Autowired
	private EmployeeDao employeeDao;
	@PostConstruct
	public void initDB() {
		employeeDao.saveAll(Stream.of(new Employee(1,"uday","mech"),new Employee(2,"yashuu","cse"),new Employee(3,"tanmay","cse")).collect(Collectors.toList()));
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestJerseyApplication.class, args);
		System.out.println("go to postman");
	}

}
