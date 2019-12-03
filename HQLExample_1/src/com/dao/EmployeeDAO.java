package com.dao;

public interface EmployeeDAO {
	void getAllEmployess();

	void getEmployeeById(int id);
    void getNameAndSalary(int id);
    void getAllEmployessNameAndSalary();
    void getAllEmployessName();
    void updateEmployeeSalary(int id);
    void deleteEmployee(int id);
    void maxSalary();
    
    
}
