package LOCK_ME;

import java.util.Scanner;

public class display_class {
	boolean go =true;
	public void display()    //this method display main menu
	{
		do {
		System.out.println("==========================================\nThese are some operation u can performe on file");
	
		System.out.println("\n1)Display all file names\n"
				+ "2)OperationsOnFiles\n3)Exit");
		
		System.out.println("Enter your Choice:\n");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		if(i==1)
		{
			System.out.println("All Files in Ascending Order are:");
			file_Name f=new file_Name();
			f.show_fileName();
		}
		else if(i==2)
		{
		opetion_Handling o=new opetion_Handling();
		o.opetion(true);
		}
		else if(i==3)
		{
            System.out.println("You chossen Exit operation Out Of Program Now");
			go = false;
			opetion_Handling o=new opetion_Handling();
			o.opetion(false);
			
		}
	}while(go==true);
	}

}
