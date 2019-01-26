package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface BuyService {
    boolean buy(User user , LocalDate buyDay , String product);
}
