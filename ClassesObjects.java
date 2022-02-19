import java.util.*; 
class Student 
{ 
    String s_name; 
    int r_no,
    t_marks,m_obtained;     
    double percentage; 
  
  void compute() 
  { 
    percentage=(m_obtained*100)/t_marks; 
    System.out.println("Name : " +s_name+ "  Roll No:"+r_no+   "  Total_Marks:"+t_marks+                "  Otained_Marks:"+m_obtained+   "  Percentage:"+percentage); 
  } 
 
  double calculate() 
  {      
   return (m_obtained*100)/t_marks;  
  } 
 
  void cal(String name, int rno, int obtmrks, int tmrks ) 
  { 
      s_name=name; 
      r_no=rno;      
       m_obtained=obtmrks;      
        t_marks=tmrks; 
      percentage=(m_obtained*100)/t_marks; 
   } 
} 
class ClassesObjects 
{ 
   public static void main(String args[]) 
   { 
     
        Scanner scan=new Scanner(System.in); 
 
    Student s= new Student(); 
    Student s1= new Student(); 
    Student s2= new Student(); 
    Student s3= new Student(); 
    Student s4= new Student(); 
     
    s.s_name="Vaishnavi"; 
    s.r_no=01; 
    s.m_obtained=600; 
    s.t_marks=700; 
    s.compute(); 
     
  
    System.out.println("Enter Name:");     
    s1.s_name=scan.nextLine(); 
 
    System.out.println("Enter Roll_no:");     
    s1.r_no=scan.nextInt(); 
     
    System.out.println("Enter Total_Marks:");    
     s1.t_marks=scan.nextInt(); 
 
    System.out.println("Enter Otained_Marks:");     
    s1.m_obtained=scan.nextInt();     s1.percentage=s1.calculate(); 
 
    System.out.println("Percentage:"+s1.percentage); 
 
    
    s2.cal("Janhavi",02,500,700); 
    System.out.println("Name :"+s2.s_name+"  Roll No: "+s2.r_no+"  Total_Marks: "+s2.t_marks+"  Otained_Marks:  "+s2.m_obtained+"  Percentage: "+s2.percentage); 
 
    s3.cal("Siddhi",03,650,700); 
    System.out.println("Name:"+s3.s_name+ "  Roll No: "+s3.r_no+"  Total_Marks: "+s3.t_marks+"  Obtained_Marks: "+s3.m_obtained+"  Percentage: "+s3.percentage); 
 
 
    } 
 
} 
 
