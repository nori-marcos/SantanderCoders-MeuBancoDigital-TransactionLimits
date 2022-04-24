package com.letscode.transactionLimit.model;

import com.letscode.transactionLimit.payload.TransactionLimitRequest;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table(name = "transaction_limit")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class TransactionLimit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "transaction_type_name")
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @Column(name = "transaction_value_limit")
    private BigDecimal transactionValueLimit;

    @Column(name = "creation_date")
    @CreatedDate
    private LocalDateTime creationDate;

    @Column(name = "update_date")
    @CreatedDate
    private LocalDateTime updateDate;

    public TransactionLimit(TransactionLimitRequest transactionLimitRequest){
        this.transactionType = transactionLimitRequest.getTransactionType();
        this.transactionValueLimit = transactionLimitRequest.getTransactionValueLimit();
    }
}
