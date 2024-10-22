package com.gorakh.projects.invoice.dao;

import com.gorakh.projects.invoice.model.Invoice;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
public class InvoiceDAOImpl implements InvoiceDAO{
    @Override
    public Invoice getInvoiceByID(int id) {
        return invoiceLists();
    }

    public Invoice invoiceLists(){
        List<Invoice> invoices = new ArrayList<>();
        invoices.add(new Invoice(1, "ola", "Scooter", 20000, new Date(), "pending"));
        invoices.add(new Invoice(2, "Hero", "Bike", 15000, new Date(), "pending"));
        invoices.add(new Invoice(3, "Uber", "Car", 22500, new Date(), "pending"));

        double randomIndex =  Math.random() * 10 % 3;

        return invoices.get((int) randomIndex);
    }
}
