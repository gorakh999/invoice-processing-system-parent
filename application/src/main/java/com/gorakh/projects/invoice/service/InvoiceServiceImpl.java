package com.gorakh.projects.invoice.service;

import com.gorakh.projects.invoice.dao.InvoiceDAO;
import com.gorakh.projects.invoice.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceServiceImpl implements InvoiceService{

    @Autowired
    public InvoiceDAO invoiceDAO;

    @Override
    public Optional<Invoice> getInvoice(int id) {
        return invoiceDAO.findById(id);
    }

    @Override
    public Invoice saveInvoice(Invoice invoice) {
        return invoiceDAO.save(invoice);
    }

    @Override
    public List<Invoice> getAllInvoices() {
        return invoiceDAO.findAll();
    }
}
