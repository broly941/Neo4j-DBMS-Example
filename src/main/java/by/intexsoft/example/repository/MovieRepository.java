package by.intexsoft.example.repository;

import by.intexsoft.example.model.Movie;
import by.intexsoft.example.model.User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface MovieRepository extends Neo4jRepository<Movie, Long> {
    @Query("MATCH (m:Movie) return m")
    Collection<Movie> getAllMovies();
}
