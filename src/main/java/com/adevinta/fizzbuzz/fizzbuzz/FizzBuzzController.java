package com.adevinta.fizzbuzz.fizzbuzz;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/api/v0.1/fizzbuzz")
public class FizzBuzzController {
    //PostHandler
    @PostMapping(
            value = "/postbody",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<String>> postBody(@RequestBody FizzBuzz fizzBuzz) {
        //Instantiate FizzBuzzService
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        return ResponseEntity.ok(fizzBuzzService.fizzBuzzService(fizzBuzz));
    }
}
