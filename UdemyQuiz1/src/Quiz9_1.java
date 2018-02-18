import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Quiz9_1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Stack<Integer> a = new Stack<Integer>();
		Stack<Integer> b = new Stack<Integer>();
		Queue<Integer> c = new LinkedList<Integer>();
		
		a.push(6);
		a.push(5);
		a.push(3);
		a.push(1);
		b.push(7);
		b.push(6);
		b.push(5);
		b.push(4);
		b.push(3);
		
//		while(!a.empty())
//			System.out.print(a.pop() + " ");
//		System.out.println();
//		while(!b.empty())
//			System.out.print(b.pop() + " ");
		
		while(!a.isEmpty() && !b.isEmpty())
		{
			if(a.peek()<b.peek())
			{
				a.pop();
			}
			if(a.peek()>b.peek())
			{
				b.pop();
			}
			if(a.peek()==b.peek())
			{
				c.add(a.peek());
				a.pop();
				b.pop();
			}
				
		}
		System.out.print("The common elements are: ");
		for (Integer i:c)
			System.out.print(i + " ");
		
	}

}
