//package com.shubham.CRUDdemo.service;
//
//public interface DepartmentService {
//}
// Java Program to Illustrate DepartmentService.java File

// Importing packages
package com.shubham.CRUDdemo.service;
import com.shubham.CRUDdemo.entity.Department;
// Importing required classes
import java.util.List;

// Class
public interface DepartmentService {

    // Save operation
    Department saveDepartment(Department department);

    // Read operation
    List<Department> fetchDepartmentList();

    // Update operation
    Department updateDepartment(Department department,
                                Long departmentId);

    // Delete operation
    void deleteDepartmentById(Long departmentId);
}