package com.raymond.entry.rest

import com.raymond.data.db.CustomerRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController(val repository: CustomerRepository) {

    /**
     * Methods in this class will override exposed function
     * in the Customer Repository class.
     */

    @GetMapping("/customer")
    fun findAll() = repository.findAll()

    @GetMapping("/customer/lastname/{lastName}")
    fun findByLastName(@PathVariable lastName: String) = repository.findByLastName(lastName)

}
