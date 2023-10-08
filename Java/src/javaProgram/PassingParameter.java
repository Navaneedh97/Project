package javaProgram;
public class PassingParameter {
public static void myMethod(String name, int age) 
{
	System.out.println(name + ".A" + " is " + age);	
}

public static void add(int a, int b)
{
int c=a+b;
System.out.println(c);
}

public static int sub(int x, int y)
{
return x-y;
}

public static void main(String[] args)
{
	myMethod("Shathyan", 29);
	myMethod("Navanee", 26);
	myMethod("Balaji", 24);
	
	add(10,20);
	
	int z = sub(10,5);
	System.out.println(z);
}
}





