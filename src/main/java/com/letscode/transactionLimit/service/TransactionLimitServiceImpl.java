package com.letscode.transactionLimit.service;

import com.letscode.transactionLimit.model.TransactionLimit;
import com.letscode.transactionLimit.model.TransactionType;
import com.letscode.transactionLimit.payload.TransactionLimitRequest;
import com.letscode.transactionLimit.payload.TransactionLimitResponse;
import com.letscode.transactionLimit.repository.TransactionLimitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionLimitServiceImpl implements TransactionLimitService {

    @Autowired
    TransactionLimitRepository transactionLimitRepository;

    @Override
    public TransactionLimitResponse create(TransactionLimitRequest transactionLimitRequest) {

        TransactionLimit transactionLimit = new TransactionLimit(transactionLimitRequest);

        transactionLimit = transactionLimitRepository.save(transactionLimit);

        return new TransactionLimitResponse(transactionLimit);
    }

    @Override
    public TransactionLimitResponse update(TransactionLimitRequest transactionLimitRequest, Integer id) {

        TransactionLimit transactionLimit = transactionLimitRepository.findById(id).orElseThrow();

        transactionLimit.setTransactionValueLimit(transactionLimitRequest.getTransactionValueLimit());
        transactionLimit.setTransactionType(transactionLimitRequest.getTransactionType());

        transactionLimit = transactionLimitRepository.save(transactionLimit);

        return new TransactionLimitResponse(transactionLimit);
    }

    @Override
    public void delete(Integer id) {

        TransactionLimit transactionLimit = transactionLimitRepository.findById(id).orElseThrow();
        transactionLimitRepository.delete(transactionLimit);
    }

    @Override
    public List<TransactionLimit> getAll() {
        return transactionLimitRepository.findAll();
    }

    @Override
    public TransactionLimitResponse getByTransactionType(TransactionType transactionType) {
        TransactionLimit transactionLimit = transactionLimitRepository.findByTransactionType(transactionType);
        return new TransactionLimitResponse(transactionLimit);
    }
}
