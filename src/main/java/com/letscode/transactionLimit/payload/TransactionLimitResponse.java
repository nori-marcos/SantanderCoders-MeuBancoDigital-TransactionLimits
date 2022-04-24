package com.letscode.transactionLimit.payload;

import com.letscode.transactionLimit.model.TransactionLimit;
import com.letscode.transactionLimit.model.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class TransactionLimitResponse {
    private Integer id;
    private TransactionType transactionType;
    private BigDecimal transactionValueLimit;
    private LocalDateTime creationDate;
    private LocalDateTime updateDate;

    public TransactionLimitResponse(TransactionLimit transactionLimit) {
        this.id = transactionLimit.getId();
        this.transactionType = transactionLimit.getTransactionType();
        this.transactionValueLimit = transactionLimit.getTransactionValueLimit();
        this.creationDate = transactionLimit.getCreationDate();
        this.updateDate = transactionLimit.getUpdateDate();
    }

}
