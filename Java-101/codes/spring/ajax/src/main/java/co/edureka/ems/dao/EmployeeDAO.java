package co.edureka.ems.dao;

import java.util.List;

import co.edureka.ems.dto.Employee;

public interface EmployeeDAO {

	Employee findEmployeeByNo(int eno);
}
