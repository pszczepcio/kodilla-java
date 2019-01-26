package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface BuyRepository {
    boolean createBuy(User user , LocalDate localDate, String product);
}
