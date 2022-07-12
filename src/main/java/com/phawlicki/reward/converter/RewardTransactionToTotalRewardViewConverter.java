package com.phawlicki.reward.converter;

import com.phawlicki.reward.TotalRewardView;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Component;

@Component
public class RewardTransactionToTotalRewardViewConverter implements Converter<Pair<String, Integer>, TotalRewardView> {
    @Override
    public TotalRewardView convert(Pair<String, Integer> source) {
        return new TotalRewardView(source.getFirst(), source.getSecond());
    }
}
