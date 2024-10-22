package com.gorakh.projects.invoice.service;

import com.gorakh.projects.invoice.model.Invoice;
import org.springframework.stereotype.Service;


public interface InvoiceService {
    public Invoice getInvoice(int id);
}
