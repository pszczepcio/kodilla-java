package com.kodilla.good.patterns.challenges.airport;

import java.util.HashMap;
import java.util.Map;

public interface FlightSearch {
   void findFlights(Map<Integer, Flight> list , User user , String connectinCity);
}
