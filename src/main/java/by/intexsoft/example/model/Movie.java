package by.intexsoft.example.model;

import lombok.Getter;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@Getter
@NodeEntity
public class Movie {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String director;

    public Movie() {
    }
}
