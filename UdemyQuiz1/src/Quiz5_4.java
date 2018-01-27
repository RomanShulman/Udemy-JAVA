import java.util.Scanner;

public class Quiz5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner readerPoints = new Scanner(System.in);
		System.out.println("Please enter the number:\n");
		
		int number = readerPoints.nextInt();
		
		int invert = 0;
			
		do 
		{
			if (number%10 > 0)
			{
				invert *=10;
				invert +=number%10;
			}
			number /=10;
			
		}
		while (number > 0);
		
		
		System.out.println("The inverted number is " + invert);
		
	}

}
