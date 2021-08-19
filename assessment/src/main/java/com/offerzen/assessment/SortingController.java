package com.offerzen.assessment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SortingController {

   @Autowired
    private SortingService sortingService;

    @PostMapping("/sort-data")
    public ResponseEntity<List<Data>> getData(@RequestBody SortData arr){
        return ResponseEntity.ok().body(this.sortingService.getData(arr));
    }
       // int arr[] = {3, 60, 35, 2, 45, 320, 5};

}
