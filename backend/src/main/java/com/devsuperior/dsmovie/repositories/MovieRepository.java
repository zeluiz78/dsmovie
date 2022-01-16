package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.entities.Score;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	Score saveAndFlush(Score score);
	
}


