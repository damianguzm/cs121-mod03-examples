import java.util.Random;

/**
 * Demonstrates the creation of pseudo-random numbers using the Random class.
 *
 * @author Java Foundations
 */
public class RandomNumbers
{
	/**
	 * Generates random numbers in various ranges.
	 */
	public static void main(String[] args)
	{
		// Try it with a seed:  new Random(12345);
		Random generator; // Declare Random variable
		generator = new Random(12345); // instantiate Random object
		int num1;
		double num2;

		num1 = generator.nextInt();
		System.out.println("A random integer: " + num1);

		num1 = generator.nextInt(10);
		System.out.println("From 0 to 9: " + num1);

		num1 = generator.nextInt(10) + 1;
		System.out.println("From 1 to 10: " + num1);

		num1 = generator.nextInt(15) + 20;
		System.out.println("From 20 to 34: " + num1);

		num1 = generator.nextInt(20) - 10;
		System.out.println("From -10 to 9: " + num1);

		num2 = generator.nextDouble();
		System.out.println("A random float (between 0 and 1): " + num2);

		num2 = generator.nextDouble() * 6;  // 0.0 to 5.999999
		num1 = (int)num2 + 1;
		System.out.println("From 1 to 6: " + num1);
	}
}
