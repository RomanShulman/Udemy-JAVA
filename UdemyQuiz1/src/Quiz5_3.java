import java.util.Scanner;

public class Quiz5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner readerPoints = new Scanner(System.in);
		System.out.println("Please enter the number:\n");
		
		int number = readerPoints.nextInt();
		
		int sum = 0;
			
		do 
		{
			System.out.println(number + "   \n");
			if (number%10 > 0)
				sum++;
			number /=10;
			
		}
		while (number > 0);
		
		
		System.out.println("The number has " + sum + " digits");
		
	}

}
