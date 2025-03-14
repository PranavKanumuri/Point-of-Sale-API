package org.wildfly.examples.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apitest.test.Models.Invoice;

public interface InvoiceRepo extends JpaRepository<Invoice, Long> {

    List<Invoice> findByCustId(Long custId); // Adjust method name and parameter as per your entity mapping

}