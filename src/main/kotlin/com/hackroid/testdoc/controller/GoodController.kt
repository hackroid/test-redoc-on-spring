package com.hackroid.testdoc.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/good")
class GoodController {

    @PostMapping
    fun createGood(@RequestBody good: GoodRequest): ResponseEntity<GoodResponse> {
        // Logic to create a good
        return ResponseEntity.ok(GoodResponse("Good created successfully"))
    }

    @GetMapping("/{id}")
    fun getGood(@PathVariable id: String): ResponseEntity<GoodResponse> {
        // Logic to get a good
        return ResponseEntity.ok(GoodResponse("Good retrieved successfully"))
    }

    @PutMapping("/{id}")
    fun updateGood(@PathVariable id: String, @RequestBody good: GoodRequest): ResponseEntity<GoodResponse> {
        // Logic to update a good
        return ResponseEntity.ok(GoodResponse("Good updated successfully"))
    }

    @DeleteMapping("/{id}")
    fun deleteGood(@PathVariable id: String): ResponseEntity<GoodResponse> {
        // Logic to delete a good
        return ResponseEntity.ok(GoodResponse("Good deleted successfully"))
    }
}
