package com.adevinta.fizzbuzz.fizzbuzz;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FizzBuzzRepository extends JpaRepository<FizzBuzz, Long> {

    @Query(value = "SELECT int1 as Param1, int2 as Param2, str1 as Param3, str2 as Param4,count(*) AS numberHits FROM topfizz GROUP BY int1,int2,str1,str2 HAVING COUNT(*)>1 LIMIT 3", nativeQuery = true)
    List<FizzBuzz> findTopQueries();
}
