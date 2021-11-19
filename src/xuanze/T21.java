package xuanze;

import java.util.Scanner;

public class T21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: (e.g., 2012): ");
		int year = input.nextInt();
		System.out.print("Enter month: 1-12: ");
		int month = input.nextInt();
		System.out.print("Enter the day of the month: 1-31: ");
		int day = input.nextInt();
		if(month==1) {
			month = 13;
			year--;
		}
		else if(month==2) {
			month = 14;
			year--;
		}
		int m=month;
		int q=day;
		int k=year%100;
		int j=year/100;
		int h;
		h = (q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
		System.out.print("Day of the week is ");
		if(h==2) {
			System.out.print("Monday");
		}
		else if(h==3) {
			System.out.print("Tuesday");
		}
		else if(h==4) {
			System.out.print("Wednesday");
		}
		else if(h==5) {
			System.out.print("Thursday");
		}
		else if(h==6) {
			System.out.print("Friday");
		}
		else if(h==0) {
			System.out.print("Saturday");
		}
		else if(h==1) {
			System.out.print("Sunday");
		}
	}

}
