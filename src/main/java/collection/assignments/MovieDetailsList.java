package collection.assignments;

import java.util.Set;
import java.util.TreeSet;

public class MovieDetailsList {
	private static Set<MovieDetails> movies;

	public MovieDetailsList() {
		MovieDetailsList.movies = new TreeSet<MovieDetails>();
	}

	public Set<MovieDetails> getMovies() {
		return movies;
	}
	
	public static void sortMovies(String type) {
		Set<MovieDetails> movie = new TreeSet<MovieDetails>();
		movie.addAll(movies);
		if (type.equalsIgnoreCase("Genre")) {
			movies = new TreeSet<MovieDetails>(new MyComparator().new Genre());
		} else if (type.equalsIgnoreCase("Name")) {
			movies = new TreeSet<MovieDetails>(new MyComparator().new Name());
		}
		movies.addAll(movie);
	}

	public void addMovie(MovieDetails mov) {
		movies.add(mov);
	}

	public void removeMovie(MovieDetails mov) {
		movies.remove(mov);
	}

	public void removeAllMovies() {
		movies.clear();
	}

	public boolean findMovieByName(String name) {
		for (MovieDetails m : movies) {
			if (m.getMovName().equalsIgnoreCase(name)) {
				System.out.println(m);
				return true;
			}
		}
		return false;

	}

	public boolean findMovieByGenre(String genre) {
		int temp = 0;
		for (MovieDetails m : movies) {
			temp = 0;
			if (m.getGenre().contains(genre)) {
				System.out.println(m);
				temp = 1;
			}
		}
		if (temp == 1)
			return false;
		else
			return true;
	}

}
