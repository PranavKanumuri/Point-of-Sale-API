package org.wildfly.examples.Repo;

import com.apitest.test.Models.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Items, Long> {

}