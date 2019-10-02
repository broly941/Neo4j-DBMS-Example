package by.intexsoft.example.repository;

import by.intexsoft.example.model.User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UserRepository extends Neo4jRepository<User, Long> {
    @Query("MATCH (u:User)<-[r:RATED]-(m:Movie) RETURN u,r,m")
    Collection<User> getAllUsers();

    @Query("Match (u:User {name: {value} })<-[r:RATED]-(m:Movie) RETURN u,r,m")
    User findByName(@Param("value") String name);
}
