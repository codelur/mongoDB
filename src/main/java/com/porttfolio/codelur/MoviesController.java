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
    public List<Movies> getAllMovies() {
        return MoviesRepository.findAll();
    }

    // Create a new movie
    @PostMapping
    public Movies createMovie(@RequestBody Movies movie) {
        return MoviesRepository.save(movie);
    }

    // Get a movie by ID
    @GetMapping("/{id}")
    public Movies getMovieById(@PathVariable String id) {
        return MoviesRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Movie not found with id " + id));
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteMovierById(@PathVariable String id) {
    	Movies movie = MoviesRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Movie not found with id " + id));
        MoviesRepository.delete(movie);
    }
    

}
