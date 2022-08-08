package LOCK_ME;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class file_Name {
	public void show_fileName() {
		Path p= Paths.get("main1");
		String ss=p.toString();
	   File f=new File(ss);
	   f.getAbsolutePath();
	 //  System.out.println(f.getAbsolutePath());
	
	  String[] b= f.list();
	
     for(String string:b)
     {
    	 System.out.println(string);
     }
	}
	

}
