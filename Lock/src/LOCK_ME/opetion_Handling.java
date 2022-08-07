package LOCK_ME;

import java.util.Scanner;

public class opetion_Handling {
	
 public	void opetion() //this method prints secondary menu 
	{ 
	    boolean go=true;
		do 
		{
		System.out.println("Enter appropriate no to do specific function");
		System.out.println("1)Add_File\n2)Delete\n3)Search \n4)BackToMainFunction\n");

		Scanner sc1=new Scanner(System.in);
		int j=sc1.nextInt();
		
		switch(j)
		{
		case 1:
		 System.out.println("Enter The File Name You Want To Add:\n");
		     Scanner sc=new Scanner(System.in);
		     String s=sc.nextLine();
		    // System.out.println(s);
		     add a=new add();
		     a.file_add(s);
		 
		 break;

		case 2:
			 System.out.println("Enter the File Name You Wnat to Delete\n");
		     Scanner sc2=new Scanner(System.in);
			 String sd= sc2.next();
		     fileDelOperation fd=new fileDelOperation();
			 fd.delOperation(sd);
		break;
		case 3:
			 System.out.println("Enter the File Name You Wnat to Search\n");
		     Scanner sc3=new Scanner(System.in);
			 String ss= sc3.next();
		     fileSearchOperation fs=new fileSearchOperation();
			 fs.searchOperation(ss);
			break;
		case 4:
			 System.out.println("Back To Main Menu\n");
             display_class ds=new display_class();
             ds.display();
		 break;		
		}
	    }while(go==true);   // to run menu as many times as user wants
		
	}

}
