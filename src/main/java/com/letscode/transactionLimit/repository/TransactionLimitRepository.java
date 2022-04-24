package com.letscode.transactionLimit.repository;

import com.letscode.transactionLimit.model.TransactionLimit;
import com.letscode.transactionLimit.model.TransactionType;
import com.letscode.transactionLimit.payload.TransactionLimitRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionLimitRepository extends JpaRepository<TransactionLimit, Integer> {

    TransactionLimit findByTransactionType(TransactionLimitRequest transactionLimitRequest);

    TransactionLimit findByTransactionType(TransactionType transactionType);

}
