package com.adevinta.fizzbuzz.fizzbuzz;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FizzBuzzRepository extends JpaRepository<FizzBuzz, Long>{
}
