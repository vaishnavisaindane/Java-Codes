import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class buffer{
    int cp;
   int sp;
public static void main(String args[])throws IOException 
    { 
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter costprice: ");
       int cp = Integer.parseInt(reader.readLine());
       System.out.println("Enter selling price: ");
      int sp = Integer.parseInt(reader.readLine());
      if(cp-sp>0)
                {
		  System.out.println("loss:" +(cp-sp));
		}
		else if(cp-sp<0)
                {
		  System.out.println("profit:" +(sp-cp));
		}
		else
		
		  System.out.println("NEUTRAL");
        
    }
    
}