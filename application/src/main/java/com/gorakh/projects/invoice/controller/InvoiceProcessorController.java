package com.gorakh.projects.invoice.controller;

import com.gorakh.projects.invoice.model.Invoice;
import com.gorakh.projects.invoice.service.InvoiceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class InvoiceProcessorController {

    private static final Logger log = LoggerFactory.getLogger(InvoiceProcessorController.class);
    @Autowired
    public InvoiceService invoiceService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello from Intellij using Spring JPA";
    }
    @GetMapping("/")
    public List<Invoice> getAll(){
        return invoiceService.getAllInvoices();
    }

    @GetMapping("/{id}")
    public Invoice getInvoice(@PathVariable Integer id){
        log.info("Incoming ID is: " + id);

        Optional<Invoice> result = invoiceService.getInvoice(id);

        log.info("Result ID is: " + result.get().getId());

        return result.orElseThrow();
    }

    @PostMapping("/")
    public Invoice saveInvoice(@RequestBody Invoice invoice){
        invoice.setDate(new Date());
        return invoiceService.saveInvoice(invoice);
    }

    @PutMapping("/")
    public Invoice UpdateInvoice(@RequestBody Invoice invoice){
        return invoiceService.saveInvoice(invoice);
    }
    @PutMapping("/updateStatus")
    public Invoice updateStatus(@RequestBody Invoice invoice){
        int id = invoice.getId();
        Optional<Invoice> findInvoice = invoiceService.getInvoice(id);

        if (findInvoice == null){
            return null;
        }

        findInvoice.get().setStatus(invoice.getStatus());
        return invoiceService.saveInvoice(findInvoice.get());
    }

}
