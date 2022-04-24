package com.letscode.transactionLimit.payload;

import com.letscode.transactionLimit.model.TransactionType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class TransactionLimitRequest {
    private TransactionType transactionType;
    private BigDecimal transactionValueLimit;
}
