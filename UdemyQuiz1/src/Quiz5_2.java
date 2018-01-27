import java.util.Scanner;

public class Quiz5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner readerPoints = new Scanner(System.in);
		System.out.println("Please enter the number:\n");
		
		int number = readerPoints.nextInt();
		int temp1 = 0;
		int temp2 = 1;
		int sum = 1;
		System.out.print( "0 ");
		do 
		{
			System.out.print( sum + " ");
			if (sum >= number)
				break;
			sum = temp1 + temp2;
			temp1 = temp2;
			temp2 = sum;
			
		}
		while (sum <= number);
		
		
	}

}
