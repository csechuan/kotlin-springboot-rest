package com.raymond.data.db

import com.raymond.core.entity.Customer
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
interface CustomerRepository : PagingAndSortingRepository<Customer, Long> {

    fun findByLastName(lastName: String): Iterable<Customer>

}
