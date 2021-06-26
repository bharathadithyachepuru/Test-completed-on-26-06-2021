package Saturday;

import java.util.Scanner;

public class pojo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

	String ename = "Bharath";
	int empid = 1551;
	String address = "Khammam";
	
	String ename1 = "Kareem";
	int empid1 = 1549;
	String address1 = "Kurnool";
	
	String ename2 = "Sumanth";
	int empid2 = 1550;
	String address2 = "Rajamundry";
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your Employee id");
	
    int employeeid = sc.nextInt();
    
    if(empid==employeeid) {
    	
    	System.out.println("Welcome to office Bharath");
    }
    
    else if (empid1==employeeid) {
		
    	System.out.println("Welcome to office Kareem");
	}
    
    else if (empid2==employeeid) {
    	
    	System.out.println("Welcome to offie Sumanth");
	}
    
    else {
    	
    	System.out.println("Given Employee id is not found or mismatched");
    }
    
    
	}
    
   }


