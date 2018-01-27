import java.util.Scanner;

public class Quiz4_3 {

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
		
		if (points > 85 && points <= 100)
		{
			grade = "A";
		}
			else if (points > 75 && points <= 85)
			{
				grade = "B";
			}
			else if (points > 65 && points <= 75)
			{
				grade ="C";
			}
			else if (points > 55 && points <= 65)
			{
				grade ="D";
			}
		else
		{
			grade = "F";
		}
		
		switch (grade) {
		case "A":
			System.out.println("Excellent!!!");	
			break;
		case "B":
			System.out.println("Well done!!!");	
			break;
		case "C":
			System.out.println("Needs more work!!!");	
			break;
		case "D":
			System.out.println("You have passed the exam!!!");	
			break;
		case "F":
			System.out.println("You have failed the exam!!!");	
			break;
		default:
			break;
		}
		
	}

}