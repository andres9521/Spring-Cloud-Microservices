package com.dh.movieservice.api.service;

import com.dh.movieservice.domain.repository.MovieRepository;
import com.dh.movieservice.domain.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

	@Autowired
    MovieRepository repository;

	public List<Movie> findByGenre(String genre) {
		return repository.findByGenre(genre);
	}

	public Movie save(Movie movie) {
		return repository.save(movie);
	}
}
