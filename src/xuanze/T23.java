package xuanze;
import java.util.Scanner;
public class T23 {

	public static void main(String[] args) {
		System.out.print("Enter a point with two coordinates: ");
         Scanner input = new Scanner(System.in);
        int x = input.nextInt();
     	int y = input.nextInt();
     	if(x<5&&y<2.5) {
     		System.out.println("Point (" + (double)x + "," + (double)y + ") is in the rectangle");
     	}
     	else {
     		System.out.println("Point (" + (double)x + "," + (double)y + ") is not in the rectangle");
     	}
     	}
	}


