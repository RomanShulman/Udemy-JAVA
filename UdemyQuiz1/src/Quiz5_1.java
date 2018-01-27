import java.util.Scanner;

public class Quiz5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner readerPoints = new Scanner(System.in);
		System.out.println("Please enter the number:\n");
		
		int number = readerPoints.nextInt();
		int temp = number-1;
		boolean ifPrim = false;
		
		while (temp > 1) 
		{
			if (number % temp ==0)
			{
				System.out.println("this is NOT the Primary number !!!");
				ifPrim = true;
				break;
			}
			temp--;
		}
		if (ifPrim == false)
			System.out.println("this is the Primary number !!!");
			
		

	}

}
