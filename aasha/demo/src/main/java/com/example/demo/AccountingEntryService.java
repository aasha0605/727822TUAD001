package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountingEntryService {
    @Autowired
    private AccountingEntryRepository accountingEntryRepository; // Changed repository reference to AccountingEntryRepository

    public AccountingEntry create(AccountingEntry entry) {
        return accountingEntryRepository.save(entry); // Changed 'jr.save' to 'accountingEntryRepository.save'
    }

    public AccountingEntry getById(Long entryId) { // Changed method name to 'getById' and parameter type to Long
        return accountingEntryRepository.findById(entryId).orElse(null); // Changed 'jr.findById' to 'accountingEntryRepository.findById'
    }

    public List<AccountingEntry> getAllEntries() { // Changed method name to 'getAllEntries'
        return accountingEntryRepository.findAll(); // Changed 'jr.findAll' to 'accountingEntryRepository.findAll'
    }

    public boolean updateDetails(Long entryId, AccountingEntry entry) { // Changed method name to 'updateDetails' and parameter type to Long
        if (!accountingEntryRepository.existsById(entryId)) { // Changed 'jr.findById' to 'accountingEntryRepository.existsById'
            return false;
        }
        try {
            accountingEntryRepository.save(entry); // Changed 'jr.save' to 'accountingEntryRepository.save'
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean deleteEntry(Long entryId) { // Changed method name to 'deleteEntry' and parameter type to Long
        if (!accountingEntryRepository.existsById(entryId)) { // Changed 'this.getById' to 'accountingEntryRepository.existsById'
            return false;
        }
        accountingEntryRepository.deleteById(entryId); // Changed 'jr.deleteById' to 'accountingEntryRepository.deleteById'
        return true;
    }
}
