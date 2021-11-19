package xuanze;

public class T24 {

	public static void main(String[] args) {
		int x = (int)(Math.random()*13)+1;
		int y = (int)(Math.random()*4)+1;//如果是（int)Math.random()*4+1的范围就是0,(int)[0,1)=0，向下取整。
		System.out.print("The card you picked is ");
		if(x==1) {
			System.out.print("Ace");
		}
		else if(x==11) {
			System.out.print("Jack");
		}
		else if(x==12) {
			System.out.print("Queen");
		}
		else if(x==13) {
			System.out.print("King");
		}
		else {
			System.out.print(x);

		}
		switch(y) {
		case 1:
			System.out.print(" of Clubs");
			break;
		case 2:
			System.out.print(" of Diamonds");
			break;
		case 3:
			System.out.print(" of Hearts");
			break;
		case 4:
			System.out.print(" of Spadas");
			break;
		}
	}

}
