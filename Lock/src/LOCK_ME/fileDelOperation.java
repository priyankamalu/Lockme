package LOCK_ME;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fileDelOperation 
{
	 public String fname;

	public void delOperation(String s)
	{ fname=s;
    	Path p= Paths.get("main1");
		String ss=p.toString();
	   File f=new File(ss);
	   f.getAbsolutePath();
	   Path path1=Paths.get("C:\\Users\\AJAY\\git\\Lockme\\Lock./main1/"+s);
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
        	   System.out.println(s+"->file is not in directory");
           }
        }
     else
     {
    	 
    	 System.out.println("check case of file name u  given file is not deleted ");
     }
        
	}
}
