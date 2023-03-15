import java.util.*;

public class TestLength {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input a length in mm");
		double number=in.nextDouble();

		System.out.println("Using Length_mm ...");

		Length_mm lm=new Length_mm();
		lm.set_mm(number);

		System.out.println("Length in inches: " + lm.get_inches());

		System.out.println("Using Length_in ...");

		Length li=new Length_in();
		li.set_mm(number);

		System.out.println("Length in inches: " + li.get_inches());
	}
}
