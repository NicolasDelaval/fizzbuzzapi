package com.adevinta.fizzbuzz.fizzbuzz;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class FizzBuzzService {
    //This service is used by a restController to calculate modulo for integers provided through a POST request
    private FizzBuzz fizzBuzz = new FizzBuzz();

    public List<String> fizzBuzzService(FizzBuzz fizzBuzz) {

        int finalInt1 = fizzBuzz.getInt1();
        int finalInt2 = fizzBuzz.getInt2();
        int limitInt = fizzBuzz.getIntLimit();
        String finalStr1 = fizzBuzz.getStr1();
        String finalStr2 = fizzBuzz.getStr2();

        List<String> fizzResponse = IntStream.rangeClosed(1, limitInt).mapToObj(i -> i % finalInt1 == 0 ? (i % finalInt2 == 0 ? finalStr1 + finalStr2 : finalStr1) : (i % finalInt2 == 0 ? finalStr2 : i)).map(Objects::toString).collect(Collectors.toList());
        return fizzResponse;
    }
}
