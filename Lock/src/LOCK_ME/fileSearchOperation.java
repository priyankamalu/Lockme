package LOCK_ME;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class fileSearchOperation {
	public void searchOperation(String ss)
	{
		
		Path p= Paths.get("main1");
		String s=p.toString();
	    File f=new File(s);
	    f.getAbsolutePath();
	    String[] b= f.list();
	    Boolean i=false;
     for(String string:b)
     {
    	if (string.equals(ss))
    		 i=true;
    
	    }
     if (i==true)
     {
 		System.out.println(ss +"\t->\tFile found");

     }
     else
     {
	    	System.out.println(ss+"\t->\tFile not found");

     }

	}
}