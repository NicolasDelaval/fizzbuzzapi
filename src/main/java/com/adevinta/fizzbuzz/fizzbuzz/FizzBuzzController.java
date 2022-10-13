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

    //POST int1,int2,intLimit,str1,str2 request
    @PostMapping(
            value = "/postbody",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<String>> postBody(@RequestBody FizzBuzz fizzBuzz) {
        //Persistence for API's input
        fizzBuzzRepository.save(fizzBuzz);
        return ResponseEntity.ok(fizzBuzzService.fizzBuzzService(fizzBuzz));
    }
    //GET all previous submitted request
    @GetMapping(value = "/getemall")
    List<FizzBuzz> all() {

        return fizzBuzzRepository.findAll();
    }

    @GetMapping(value = "/tops")
    List<FizzBuzz> tops() {

        return fizzBuzzRepository.findTopQueries();
    }

}
