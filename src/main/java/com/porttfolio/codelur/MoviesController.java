package com.porttfolio.codelur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MoviesController {
	@Autowired
    private MoviesRepository MoviesRepository;
	
	// Get all movies
    @GetMapping
    public List<Movies> getAllCustomers() {
        return MoviesRepository.findAll();
    }

    // Create a new customer
    @PostMapping
    public Movies createCustomer(@RequestBody Movies customer) {
        return MoviesRepository.save(customer);
    }

    // Get a customer by ID
    @GetMapping("/{id}")
    public Movies getCustomerById(@PathVariable String id) {
        return MoviesRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Movie not found with id " + id));
    }

}
