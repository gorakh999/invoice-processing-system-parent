package com.gorakh.projects.invoice.controller;

import com.gorakh.projects.invoice.model.Invoice;
import com.gorakh.projects.invoice.service.InvoiceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceProcessorController {

    private static final Logger log = LoggerFactory.getLogger(InvoiceProcessorController.class);
    @Autowired
    public InvoiceService invoiceService;

    @GetMapping("/")
    public String hello(){
        return "<h1>Hello from Intellij.</h1>";
    }

    @GetMapping("/{id}")
    public Invoice getInvoice(@PathVariable Integer id){
        log.info("Incoming ID is: " + id);

        Invoice result = invoiceService.getInvoice(id);

        log.info("Result ID is: " + result.getId());

        return result;
    }

}
