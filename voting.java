//exp 11
import java.util.*;
class MyException extends Exception{
	MyException(String s)
	{
		super(s);
	}
}
class voting{
	void validate(int a)
	{
		int age;
		age=a;
		try
		{
			if(age<18)
			{
				throw new MyException("person is not eligible to vote");
			}
			else
			{
				System.out.println("person is eligible to vote");
			}
		}
		catch(MyException me)
		{
			System.out.println("exception is caught...");
			System.out.println(me.getMessage());
		}
	}

	public static void main(String[] args) {
		Scanner Scan= new Scanner(System.in);
		voting v = new voting();
		System.out.println("enter[Age: ]");
		int age=Scan.nextInt();
        v.validate(age);
			
		}

}