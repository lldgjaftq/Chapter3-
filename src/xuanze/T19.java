package xuanze;

import java.util.Scanner;

public class T19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("输入三条边的长度：");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int sum;
		if(a+b>c&&a+c>b&&b+c>a) {
			sum = a + b + c;
			System.out.println("三角形的周长是" + sum);
		}
		else {
			System.out.println("这些输入值不合法。");
		}
	}

}
