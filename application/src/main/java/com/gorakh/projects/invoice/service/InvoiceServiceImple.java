package com.gorakh.projects.invoice.service;

import com.gorakh.projects.invoice.dao.InvoiceDAO;
import com.gorakh.projects.invoice.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceImple implements InvoiceService{

    @Autowired
    public InvoiceDAO invoiceDAO;
    @Override
    public Invoice getInvoice(int id) {
        return invoiceDAO.getInvoiceByID(id);
    }
}
