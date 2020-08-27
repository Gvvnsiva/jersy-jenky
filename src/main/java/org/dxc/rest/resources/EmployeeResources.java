package org.dxc.rest.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.dxc.rest.Entity.Employee;
import org.dxc.rest.repository.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;

@Path("/employeeResource")
public class EmployeeResources {
	@Autowired
	private EmployeeDao  employeeDao; 
	@POST 
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/save")
	public Employee saveEmployee(Employee employee) {
		return employeeDao.save(employee);
		
	}
	//get all employee
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/getAllEmployee")
	public List<Employee> getAllEmployee(){
		return employeeDao.findAll();
		
	}
	
	

}
