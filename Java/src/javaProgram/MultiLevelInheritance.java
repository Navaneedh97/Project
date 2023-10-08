package javaProgram;

class School{  
void open()
{
	System.out.println("School Opened");
  }  
}  
class Teacher extends School{
void work(){
	System.out.println("Working");
	}  
} 
class Student extends Teacher{  
void learn()
{
	System.out.println("Learning");
}  
  }  


public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student  s= new Student();
			 s.learn();
			 s.work();
			 s.open();

	}

}
