package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AccountingEntry {
    @Id
    private Long entryId;
    private String entryName;
    private String description;
    private double amount;
    private int quantity;
    private String debitAccount;
    private String creditAccount;
    private String transactionType;
    private String date;

    public AccountingEntry() {
        // Default constructor
    }

    public AccountingEntry(Long entryId, String entryName, String description, double amount, int quantity,
                    String debitAccount, String creditAccount, String transactionType, String date) {
        this.entryId = entryId;
        this.entryName = entryName;
        this.description = description;
        this.amount = amount;
        this.quantity = quantity;
        this.debitAccount = debitAccount;
        this.creditAccount = creditAccount;
        this.transactionType = transactionType;
        this.date = date;
    }

    // Getters and setters for all attributes

    public Long getEntryId() {
        return entryId;
    }

    public void setEntryId(Long entryId) {
        this.entryId = entryId;
    }

    public String getEntryName() {
        return entryName;
    }

    public void setEntryName(String entryName) {
        this.entryName = entryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDebitAccount() {
        return debitAccount;
    }

    public void setDebitAccount(String debitAccount) {
        this.debitAccount = debitAccount;
    }

    public String getCreditAccount() {
        return creditAccount;
    }

    public void setCreditAccount(String creditAccount) {
        this.creditAccount = creditAccount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
