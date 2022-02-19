import pack.Operation;
import pack.mypack.Msg;
import java.io.*;

public class Add
{
public static void main(String args[])throws IOException {
	Operation o= new Operation();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter three numbers to be Add");
	int x=Integer.parseInt(br.readLine());     
	int y=Integer.parseInt(br.readLine());     
	int z=Integer.parseInt(br.readLine());     
	o.add(x,y,z); 
    Msg m= new Msg();   
     m.display(); 
	
	
}
}

 

// OperationUsage.java import pack.Operation; import pack.mypack.MyPack; import java.io.*; 
 
// class OperationUsage{ 
// public static void main(String args[]) throws Exception{ 
// Operation o= new Operation(); MyPack m = new MyPack(); m.display(); 
// BufferedReader br=new BufferedReader(new InputStreamReader(System.in));     
     
// int a=Integer.parseInt(br.readLine());   int b=Integer.parseInt(br.readLine()); int c=Integer.parseInt(br.readLine());       o.addition(a,b,c); 
 
// }} 
 

