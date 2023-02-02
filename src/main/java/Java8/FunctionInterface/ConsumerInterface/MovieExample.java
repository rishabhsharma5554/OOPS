package Java8.FunctionInterface.ConsumerInterface;

import java.util.ArrayList;
import java.util.function.Consumer;
class Movie
{
	String name;
	String hero; 
	String heroine;
	public Movie(String name, String hero, String heroine) {
		super();
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
	}
	@Override
	public String toString() {
		return String.format("%s %s %s",name,hero,heroine);
	}
	
}
public class MovieExample {

	public static void main(String[] args) {
		ArrayList<Movie> movies = new ArrayList<>();
		populate(movies);
		
		Consumer<Movie> c = movie -> System.out.println(movie);
		for(Movie movie : movies)
			c.accept(movie);
			
	}

	private static void populate(ArrayList<Movie> movies) {
		movies.add(new Movie("Bahubali","Prabhas","Anushka")); 
		movies.add(new Movie("Rayees","Sharukh","Sunny")); 
		movies.add(new Movie("Dangal","Ameer","Ritu")); 
		movies.add(new Movie("Sultan","Salman","Anushka")); 
	}

}
