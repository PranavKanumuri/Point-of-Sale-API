package org.wildfly.examples.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apitest.test.Models.Tax;

public interface TaxRepo extends JpaRepository<Tax, Long> {

}
