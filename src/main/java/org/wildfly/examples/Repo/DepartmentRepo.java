package org.wildfly.examples.Repo;


import com.apitest.test.Models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department, Long> {

}
