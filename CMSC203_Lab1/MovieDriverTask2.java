import java.util.Scanner;

public class MovieDriverTask2 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		String again = "yes";

		while (again.equalsIgnoreCase("yes")) {

			Movie movie = new Movie();

			System.out.println("Enter the title of the movie: ");
			String title = keyboard.nextLine();
			movie.setTitle(title);

			System.out.println("Enter the movie's rating: ");
			String rating = keyboard.nextLine();
			movie.setRating(rating);

			System.out.println("Enter the number of tickets sold: ");
			int tickets = keyboard.nextInt();
			keyboard.nextLine(); // clears the leftover line feed so the next loop works correctly
			movie.setSoldTickets(tickets);

			System.out.println(movie.toString());

			System.out.println("Do you want to enter another movie? (yes/no)");
			again = keyboard.nextLine();
		}

		System.out.println("Goodbye!");
	}
}
