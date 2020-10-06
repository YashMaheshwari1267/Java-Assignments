package collection.test;

import collection.assignments.MovieDetails;
import collection.assignments.MovieDetailsList;
import junit.framework.*;

public class TestMovieDetails extends TestCase{
	protected MovieDetailsList movies= new MovieDetailsList();
	
	public TestMovieDetails(String testName) {
		super(testName);
	}
	
	public Test Suite() {
		return new TestSuite(TestMovieDetails.class);
	}
	
	protected void setUp() {
		MovieDetails movie1= new MovieDetails("The Godfather","Marlon Brando","Diane Keaton","drama crime");
		MovieDetails movie2= new MovieDetails("Star Wars","Mark Hamill","Carrie Fisher","mythological");
		MovieDetails movie3= new MovieDetails("Chinatown","Jack Nicholson","Faye Dunaway","historical");
		
		movies.addMovie(movie1);
		movies.addMovie(movie2);
		movies.addMovie(movie3);
	}
	
	public void test() {
		assertTrue(true);
	}
	
	//testing size of list
	public void testList() {
		assertEquals(3, movies.getMovies().size());
	}
	
	//finding movies with name
	public void testMovieByName() {
		assertTrue(movies.findMovieByName("The Godfather"));
	}
	
	//finding movie with genre
	public void testMovieByGenre() {
		assertTrue(movies.findMovieByGenre("historical"));
	}
	
	//removing movie test
	public void testRemoveMovie() {
		movies.removeMovie(movies.getMovies().iterator().next());
		assertEquals(2,movies.getMovies().size());
	}
	
	
}