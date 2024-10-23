package com.gorakh.projects.invoice.model;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Entity
@Component
@Table(name = "invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String vendor;
    private String product;
    private Integer amount;
    private Date date;
    private String status;

    public Invoice(int id, String vendor, String product, Integer amount, Date date, String status) {
        this.id = id;
        this.vendor = vendor;
        this.product = product;
        this.amount = amount;
        this.date = date;
        this.status = status;
    }

    public Invoice(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", vendor='" + vendor + '\'' +
                ", product='" + product + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                ", status='" + status + '\'' +
                '}';
    }
}
