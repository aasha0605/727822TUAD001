package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounting") // Changed base mapping to '/api/accounting'
public class AccountingEntryController {

    @Autowired
    private AccountingEntryService accountingEntryService; // Changed service reference to AccountingEntryService

    @PostMapping("/add") // Changed endpoint to '/api/accounting/add'
    public ResponseEntity<AccountingEntry> addEntry(@RequestBody AccountingEntry entry) { // Changed method name to 'addEntry'
        AccountingEntry createdEntry = accountingEntryService.create(entry); // Changed 'js.create' to 'accountingEntryService.create'
        return new ResponseEntity<>(createdEntry, HttpStatus.CREATED);
    }

    @GetMapping("/all") // Changed endpoint to '/api/accounting/all'
    public List<AccountingEntry> getAllEntries() { // Changed method name to 'getAllEntries'
        return accountingEntryService.getAllEntries(); // Changed 'js.getAllJob' to 'accountingEntryService.getAllEntries'
    }

    @PutMapping("/{entryId}") // Changed endpoint to '/api/accounting/{entryId}'
    public ResponseEntity<AccountingEntry> updateEntry(@PathVariable("entryId") Long entryId, @RequestBody AccountingEntry entry) { // Changed method name to 'updateEntry'
        if (accountingEntryService.updateDetails(entryId, entry)) { // Changed 'js.updateDetails' to 'accountingEntryService.updateDetails'
            return new ResponseEntity<>(entry, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{entryId}") // Changed endpoint to '/api/accounting/{entryId}'
    public ResponseEntity<Boolean> deleteEntry(@PathVariable("entryId") Long entryId) { // Changed method name to 'deleteEntry'
        if (accountingEntryService.deleteEntry(entryId)) { // Changed 'js.deleteJob' to 'accountingEntryService.deleteEntry'
            return new ResponseEntity<>(true, HttpStatus.OK);
        }
        return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
    }
}
