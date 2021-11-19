package xuanze;
import java.util.Scanner;
public class T22 {

	public static void main(String[] args) {
	System.out.print("Enter a point with two coordinates: ");
	Scanner input = new Scanner(System.in);
	int x = input.nextInt();
	int y = input.nextInt();
	if(x*x+y*y<100) {
		System.out.println("Point (" + (double)x + "," + (double)y + ") is in the circle");
	}
	else {
		System.out.println("Point (" + (double)x + "," + (double)y + ") is not in the circle");
	}
	}

}



