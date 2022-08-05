package LOCK_ME;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fileDelOperation 
{
	String fname;
	public void delOperation(String s)
	{   
	    this.fname=s;
    	Path p= Paths.get("main1");
		String ss=p.toString();
	   File f=new File(ss);
	   f.getAbsolutePath();
	   Path path1=Paths.get("C:\\Users\\AJAY\\eclipse-workspace1\\Lock./main1/"+s);
       File f2=new File(path1.toString());
	   String[] b= f.list();
	   boolean i=false;
     for(String string:b)
     {
    	 if(string.equals(fname))   //case sensitivity checked
    	 {
    		 i=true;
    	 }
     }
        if(i==true)
        {
           if( f2.delete()==true)    // file is deleted or not check
               {
	             System.out.println(s+"\tFile deleted succesfully");
               }
           else
              {
	             System.out.println(s+"->File is not in the directory");
              }
        }
     else
     {
    	 
    	 System.out.println("check case of file name u  given file is not deleted ");
     }
        
	}
}
