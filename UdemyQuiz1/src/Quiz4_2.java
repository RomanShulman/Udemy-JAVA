import java.util.Scanner;

public class Quiz4_2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner readerPoints = new Scanner(System.in);
		System.out.println("Please enter the number of points of the student:\n");
		
		int points = readerPoints.nextInt();
		String grade = "";
		
		if (points >100)
			System.out.println("The number you've entered is too high for a legal grade !!!");
		if (points <0)
			System.out.println("The number you've entered is too low for a legal grade !!!");
		
		if (points > 95 && points <= 100)
		{
			grade = "A+";
		}
			else if (points > 90 && points <= 95)
			{
				grade = "A";
			}
			else if (points > 85 && points <= 90)
			{
				grade ="A-";
			}
			else if (points > 80 && points <= 85)
			{
				grade ="B+";
			}
			else if (points > 75 && points <= 80)
			{
				grade ="B";
			}
			else if (points > 70 && points <= 75)
			{
				grade ="B-";
			}
			else if (points > 65 && points <= 70)
			{
				grade ="C+";
			}
			else if (points > 60 && points <= 65)
			{
				grade ="C";
			}
			else if (points > 55 && points <= 60)
			{
				grade ="C-";
				
			}
			else if (points > 50 && points <= 55)
			{
				grade ="D";
			}
		else
		{
			grade = "F";
		}
		
		System.out.println("Your grade is:" + grade);
	}

}