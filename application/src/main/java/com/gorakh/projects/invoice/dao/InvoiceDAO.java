package com.gorakh.projects.invoice.dao;

import com.gorakh.projects.invoice.model.Invoice;
import org.springframework.stereotype.Service;

public interface InvoiceDAO {
    public Invoice getInvoiceByID(int id);
}
