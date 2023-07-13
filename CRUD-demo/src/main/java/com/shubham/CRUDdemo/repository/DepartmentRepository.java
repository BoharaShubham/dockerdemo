//package com.shubham.CRUDdemo.repository;
//
//public interface DepartmentRepository {
//}
package com.shubham.CRUDdemo.repository;

import com.shubham.CRUDdemo.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {

}