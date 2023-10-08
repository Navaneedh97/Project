package javaProgram;
class Office{  
void Open()
   {
	System.out.println("Office Opened");
	}  
}  
class Senior extends Office{ 
void organize()
  {
	System.out.println("Organizing the Plan");
	}  
}  
class Junior extends Office{  
void execute()
{
	System.out.println("Executing");
	}  
}  

public class HeirarchialInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Junior j=new Junior();  
		j.execute(); 
		j.Open();

	}

}
