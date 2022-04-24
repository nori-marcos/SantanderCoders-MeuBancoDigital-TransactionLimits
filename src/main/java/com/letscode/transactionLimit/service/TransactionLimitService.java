package com.letscode.transactionLimit.service;

import com.letscode.transactionLimit.model.TransactionLimit;
import com.letscode.transactionLimit.model.TransactionType;
import com.letscode.transactionLimit.payload.TransactionLimitRequest;
import com.letscode.transactionLimit.payload.TransactionLimitResponse;

import java.util.List;

public interface TransactionLimitService {
    TransactionLimitResponse create(TransactionLimitRequest transactionLimitRequest);
    TransactionLimitResponse update (TransactionLimitRequest transactionLimitRequest, Integer id);
    void delete (Integer id);

    List<TransactionLimit> getAll();

    TransactionLimitResponse getByTransactionType(TransactionType transactionType);
}
