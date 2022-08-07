package LOCK_ME;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class add {
	
	public void file_add(String s) // method to add file in main1 menu
	
	{
		add.ismainExists("main1");   // checking main1 menu exists or not
		Path newPath = Paths.get("C:\\Users\\AJAY\\git\\Lockme\\Lock./main1/"+s);
		File f1=new File(newPath.toString());
		try 
		{
			f1.createNewFile();
			System.out.println("File created succesfully ");
		} 
		catch (IOException e)
		{
			System.out.println("File could not created\n");//e.printStackTrace();
		}
		
	}
	public static void ismainExists(String ss)
	{
		
		Path newPath1 = Paths.get("C:\\Users\\AJAY\\eclipse-workspace1\\Lock\\"+ss);
       	File ff=new File(newPath1.toString());
		if(!ff.exists())
		{
			ff.mkdirs();   //if folder does not exists it creats folder
		}
		
	
	}

}
