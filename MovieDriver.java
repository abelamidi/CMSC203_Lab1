import java.util.Scanner;


public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie javaMovie = new Movie();

		Scanner keyboard = new Scanner(System.in);
		String name, rating, answer;
		int numberOfTickets;
		char answer2;
		
		do {
			System.out.println("Enter the name of a movie: ");
			name = keyboard.nextLine();
			javaMovie.setTitle(name);
			System.out.println("Enter the rating of the movie: ");
			rating = keyboard.nextLine();
			javaMovie.setRating(rating);
			System.out.println("Enter the number of tickets for this movie: ");
			numberOfTickets = keyboard.nextInt();
			javaMovie.setSoldTickets(numberOfTickets);
			keyboard.nextLine();
			System.out.println(javaMovie.toString());
			System.out.println("Do you want to enter another? (y or n)");
			answer = keyboard.nextLine();
			answer2 = answer.charAt(0);
		}while (answer2 == 'y');
	   
		System.out.println("Goodbye");
	}
	
}
