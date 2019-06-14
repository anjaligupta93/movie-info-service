package resources;

import java.util.Collections;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.movieinfoservice.model.Movie;

@RestController
@RequestMapping("/")
public class MovieResource {

	@RequestMapping("/movies/{movieId}")
	public Movie getMovie(@PathVariable String movieId)
	{
		return new Movie(movieId, "testMovieName");
	}
	
	
}
