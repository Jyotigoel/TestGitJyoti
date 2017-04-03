package program;

import java.io.IOException;

public class LaunchingExternalApps {
	/*public static void main(String[] args)
	{
		Runtime runtime= Runtime.getRuntime();
		try
		{
			runtime.exec("notepad D:\\test.txt");  
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}*/
	/*public static void main(String[] args)
    {
        Runtime runtime = Runtime.getRuntime();     //getting Runtime object
 
        String[] s = new String[] {"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe", "http://javaconceptoftheday.com/"};
 
        try
        {
            runtime.exec(s);        //opens "http://javaconceptoftheday.com/" in chrome browser
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }*/

	 public static void main(String[] args) throws Exception
	    {
	        Runtime runtime = Runtime.getRuntime();     //getting Runtime object
	 
	        Process process = runtime.exec("notepad D:\\test.txt");        //opens "sample.txt" in notepad
	 
	        Thread.sleep(5000);
	 
	        process.destroy();
	    }
}
