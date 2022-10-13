package com.adevinta.fizzbuzz.fizzbuzz;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/api/v0.1/fizzbuzz")
public class FizzBuzzController {

    private final FizzBuzzService fizzBuzzService;
    private final FizzBuzzRepository fizzBuzzRepository;

    public FizzBuzzController(FizzBuzzService fizzBuzzService, FizzBuzzRepository fizzBuzzRepository){
        this.fizzBuzzService=fizzBuzzService;
        this.fizzBuzzRepository=fizzBuzzRepository;
    }

    @PostMapping(
            value = "/postbody",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<String>> postBody(@RequestBody FizzBuzz fizzBuzz) {
        fizzBuzzRepository.save(fizzBuzz);


        return ResponseEntity.ok(fizzBuzzService.fizzBuzzService(fizzBuzz));
    }
}
