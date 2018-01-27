import java.util.Scanner;

public class Quiz6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 2, 0, 4, 0, 5, 6};
		int j=0;
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n" + arr.length + "\n");
		for (int i=0; i<arr.length-2; i++)
		{
			if (arr[i] ==0)
			{
				j=i+1;
				while (arr[j]==0 && j<arr.length-1)
				{
					j++;					
				}
				arr[i] = arr[j];
				arr[j] = 0;
			}

		}
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		

		
	}

}
