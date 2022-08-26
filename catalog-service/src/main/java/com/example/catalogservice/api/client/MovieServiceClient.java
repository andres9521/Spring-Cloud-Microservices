package com.example.catalogservice.api.client;

import com.example.catalogservice.domain.model.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient (name="movie-service")
public interface MovieServiceClient {

	@GetMapping("/movie/{genre}")
	ResponseEntity<List<Movie>> getMovieByGenre(@PathVariable (value = "genre") String genre);

}
