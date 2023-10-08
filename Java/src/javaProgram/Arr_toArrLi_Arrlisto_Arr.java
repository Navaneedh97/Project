package javaProgram;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Arr_toArrLi_Arrlisto_Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    List<String> nameList = new ArrayList<>();  
	    nameList.add("Navanee");  
	    nameList.add("Makizh");  
	    nameList.add("Karthi");  
	    nameList.add("Kishore");  
	    nameList.add("Lokesh");  
        System.out.println("Converting ArrayList to Array : " );  
        String[] item = nameList.toArray(new String[nameList.size()]);  
        for(String s : item){  
            System.out.println(s);  
        }  
        System.out.println("Converting Array to ArrayList : " );  
        List<String>l2 = new ArrayList<>();  
        l2 =  Arrays.asList(item);  
        System.out.println(l2);  

	}

}
