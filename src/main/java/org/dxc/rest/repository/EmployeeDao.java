package org.dxc.rest.repository;
import org.dxc.rest.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
                                                  //entity class&PrimaryKey
public interface EmployeeDao extends JpaRepository<Employee,Integer> {

}
