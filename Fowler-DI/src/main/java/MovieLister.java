import java.util.Iterator;
import java.util.List;

// Component
public class MovieLister {

	private MovieFinder finder; // interface
	
	public MovieLister() {
		// ColonDelimetedMovieFinder is realization of IF MovieFinder
		// so it is dependency on realization
		finder = new ColonDelimetedMovieFinder("movies1.txt");
	}
	
	public Movie[] moviesDirectedBy(String arg) {
		
		// dependency on IF
		List allMovies = finder.findAll(); // search object - returns all movies
		
		// filtering by director
		for (Iterator it = allMovies.iterator(); it.hasNext();) {
			
			Movie movie = (Movie) it.next();
			if (!movie.getDirector().equals(arg)) it.remove();
			
		}
		
		return (Movie[]) allMovies.toArray(new Movie[allMovies.size()]);
		
	}
}
