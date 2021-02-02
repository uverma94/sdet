package javaActivity_4;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Activity4_2 {
		    public static void main(String[] args) throws IOException {
		        
		 
				try { 
				 //Create a new text file using the default File Class. 
				 File file = new File("newfile.txt");
				  
				 //Use the createNewFile() method to create a file. 
				 boolean f = file.createNewFile(); 
				 if(f) {
				 System.out.println("File Created Successfully"); 
				 }
				 else {
				 System.out.println("File already exists"); 
				 } 
								 			    	
		    	
		    	//Use the FileUtils.getFile() method to get the file object.
		    	File fileUtil = FileUtils.getFile("resources");
		    	
		    	//To read the file the method is readFileToString().
		    	System.out.println("Data in File: " +FileUtils.readFileToString(fileUtil, "UTF8"));
		    	
		    	//Next, we create a new directory named resources.
		    	File Dire = new File("resource");
		    	
		    	//Copy the text file into this directory using the copyFileToDirectory() method.
		        FileUtils.copyFileToDirectory(file, Dire);
		        
		        //Get file from new directory
		        File newFile = FileUtils.getFile(Dire, "newFile.txt");
		        
		        //Read data from file
		        String newFileData = FileUtils.readFileToString(newFile, "UTF8");
		        
		        System.out.println("Data in new File:" +newFileData);
		        
		        
		    }catch(IOException e) {
		    	System.out.println(e);
		    	
		    }
}
}
