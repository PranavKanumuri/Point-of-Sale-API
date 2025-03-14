package org.wildfly.examples.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apitest.test.Models.Category;

public interface CategoryRepo extends JpaRepository<Category, Long> {

}
