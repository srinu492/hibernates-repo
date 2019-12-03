package com.dao;

public interface EmployeeDAO {
	void saveEmployee();

	void fetchData(int id);

	void removeChild(int id);
	void readData();
	void addChild(int id);

}
