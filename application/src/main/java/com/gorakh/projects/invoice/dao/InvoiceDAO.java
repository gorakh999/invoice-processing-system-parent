package com.gorakh.projects.invoice.dao;

import com.gorakh.projects.invoice.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceDAO extends JpaRepository<Invoice, Integer> {

}
