package org.wildfly.examples.Repo;

import com.apitest.test.Models.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customers, Long> {
    // additional query methods if needed
}
