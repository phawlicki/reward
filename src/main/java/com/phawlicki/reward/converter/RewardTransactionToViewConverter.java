package com.phawlicki.reward.converter;

import com.phawlicki.reward.TransactionView;
import com.phawlicki.reward.model.Transaction;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RewardTransactionToViewConverter implements Converter<Transaction, TransactionView> {
    @Override
    public TransactionView convert(Transaction source) {
        return new TransactionView(source.getId().toHexString(),
                source.getAmount(),
                source.getCustomerId(),
                source.getCreatedDateTime(),
                source.getLastUpdateDateTime());
    }
}
