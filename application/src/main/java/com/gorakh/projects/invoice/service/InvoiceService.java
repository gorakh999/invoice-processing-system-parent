package com.gorakh.projects.invoice.service;

import com.gorakh.projects.invoice.model.Invoice;

import java.util.List;
import java.util.Optional;


public interface InvoiceService {
    public Optional<Invoice> getInvoice(int id);
    public Invoice saveInvoice(Invoice invoice);
    public List<Invoice> getAllInvoices();
}
