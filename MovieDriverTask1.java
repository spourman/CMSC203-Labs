import java.util.Scanner;

public class MovieDriverTask1 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Movie movie = new Movie();

		System.out.println("Enter the title of the movie: ");
		String title = keyboard.nextLine();
		movie.setTitle(title);

		System.out.println("Enter the movie's rating: ");
		String rating = keyboard.nextLine();
		movie.setRating(rating);

		System.out.println("Enter the number of tickets sold: ");
		int tickets = keyboard.nextInt();
		movie.setSoldTickets(tickets);

		System.out.println(movie.toString());
	}
}