package dao;

import models.Department;

import java.util.List;

public interface DepartmentDao {

    //Create Department
    void addDepartment(Department department);

    //Read Department
    List<Department> getAllDepartments();

    //Update Department

    //Delete Department
    void deleteDepartmentById(int id);
    void deleteAllDepartments();
}
