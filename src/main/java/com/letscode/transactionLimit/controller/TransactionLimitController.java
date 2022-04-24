package com.letscode.transactionLimit.controller;

import com.letscode.transactionLimit.model.TransactionLimit;
import com.letscode.transactionLimit.model.TransactionType;
import com.letscode.transactionLimit.payload.TransactionLimitRequest;
import com.letscode.transactionLimit.payload.TransactionLimitResponse;
import com.letscode.transactionLimit.service.TransactionLimitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactionLimit")
public class TransactionLimitController {

    @Autowired
    TransactionLimitService transactionLimitService;

    @PostMapping
    public TransactionLimitResponse create(
            @RequestBody TransactionLimitRequest transactionLimitRequest
    ) {
        return transactionLimitService.create(transactionLimitRequest);
    }

    @PutMapping("/{id}")
    public TransactionLimitResponse update(
            @RequestBody TransactionLimitRequest transactionLimitRequest,
            @PathVariable Integer id
    ) {
        return transactionLimitService.update(transactionLimitRequest, id);
    }

    @DeleteMapping("/{id}")
    public void delete(
            @PathVariable Integer id
    ) {
        transactionLimitService.delete(id);
    }

    @GetMapping
    public List<TransactionLimit> getAll(){
        return transactionLimitService.getAll();
    }

    @GetMapping("/{transactionType}")
    public TransactionLimitResponse getByTransactionType(
            @PathVariable TransactionType transactionType
            ){
        return transactionLimitService.getByTransactionType(transactionType);
    }

}
