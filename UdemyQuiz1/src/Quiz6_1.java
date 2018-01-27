import java.util.Scanner;

public class Quiz6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner readerPoints = new Scanner(System.in);
		System.out.println("Please enter the number:\n");
		
		int number = readerPoints.nextInt();
		int number2 = number;
		int[] digs = new int[10];
		//filling array digs
		while (number2>0)
		{
//			System.out.println(number2%10 + " ");
			digs[number2%10]++;
			number2 /=10;
			
		}
		number2 = 0;
		int maxDig=0;
		for (int i=0; i<digs.length; i++)
		{
			if (digs[i] > number2)
			{
				number2 = digs[i];
				maxDig = i;
			}

		}
		System.out.print("The most occuring digit is:" + maxDig);
		

		
	}

}
