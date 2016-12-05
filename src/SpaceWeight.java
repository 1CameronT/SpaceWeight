import java.util.Scanner;

/**
 *
 *Name:
 *Teacher:Mr.Hardman
 *Assignment#, Program #
 *Date Last Modified:
 * 
 */

/**
 * @author c.toy
 *
 */
public class SpaceWeight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		
		double userWeight;
		double planetWeight;
		
		String planet;
		
		System.out.print("What is your weight?");
		userWeight = userInput.nextDouble();
		
		System.out.print("what celestial body you want to travel to?");
		planet = userInput.next();
		
		if(planet.equalsIgnoreCase("Mercury")){
			System.out.println("Your weight on Mercury is: " + userWeight * 0.38);
		}
		
		if(planet.equalsIgnoreCase("Venus")){
			System.out.println("Your weight on Venus is: " + userWeight * 0.91);
		}
		
		if(planet.equalsIgnoreCase("Moon")){
			System.out.println("Your weight on Moon is: " + userWeight * 1.65);
		}
		
		if(planet.equalsIgnoreCase("Mars")){
			System.out.println("Your weight on Mars is: " + userWeight * 0.38);
		}
		
		if(planet.equalsIgnoreCase("Jupiter")){
			System.out.println("Your weight on Jupiter is: " + userWeight *2.34);
		}
		
		if(planet.equalsIgnoreCase("Saturn")){
			System.out.println("Your weight on Saturn is: " + userWeight * 1.06);
		}
		
		if(planet.equalsIgnoreCase("Uranus")){
			System.out.println("Your weight on Uranus is: " + userWeight * 0.92);
		}
		
		if(planet.equalsIgnoreCase("Neptune")){
			System.out.println("Your weight on Neptune is: " + userWeight * 1.19);
		}
		
		if(planet.equalsIgnoreCase("Pluto")){
			System.out.println("Your weight on Pluto is: " + userWeight * 0.06);
		}
		
	
		
		userInput.close();
		
	}

}
