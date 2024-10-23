package com.gorakh.projects.invoice.controller;

import com.gorakh.projects.invoice.model.Invoice;
import com.gorakh.projects.invoice.service.InvoiceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
public class InvoiceProcessorController {

    private static final Logger log = LoggerFactory.getLogger(InvoiceProcessorController.class);
    @Autowired
    public InvoiceService invoiceService;

    @GetMapping("/")
    public String hello(){
        return "Hello from Intellij using Spring JPA";
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

}
