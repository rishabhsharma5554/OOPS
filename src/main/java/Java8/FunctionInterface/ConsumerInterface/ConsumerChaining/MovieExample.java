package Java8.FunctionInterface.ConsumerInterface.ConsumerChaining;
import java.util.function.Consumer;
public class MovieExample {
	static class Movie
	{
		String name;
		String result;
		Movie(String name,String result)
		{
			this.name=name;
			this.result=result;
		}
	}
	public static void main(String[] args) {
		Consumer<Movie> c1 = movie -> System.out.println("Movie: "+movie.name+" ready to release.");
		Consumer<Movie> c2 = movie -> System.out.println("Movie: "+movie.name+" is "+movie.result);
		Consumer<Movie> c3 = movie -> System.out.println("Movie: "+movie.name+"information storing in database.");
		
		Movie m = new Movie("Bahubali", "Hit");
		Consumer<Movie> chainedMovie = c1.andThen(c2).andThen(c3);
		chainedMovie.accept(m);
	}
	
	
	/*
	 * Movie: Bahubaliready to release
	 * Movie: Bahubali is Hit
	 * Movie: Bahubaliinformation storing in database.
	 * 
	 * */

}
