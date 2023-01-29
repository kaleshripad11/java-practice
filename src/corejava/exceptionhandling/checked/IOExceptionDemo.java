package corejava.exceptionhandling.checked;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {
	/*
	 * Checked exception demo using file handling(IOException)
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Create a file
		File f = new File("E://Shree//iotest.txt");
		f.createNewFile();	// File has been created on given path
		System.out.println(f.canWrite());	
		System.out.println(f.getPath());
		
		// Write content to a file
		try {
			FileWriter write = new FileWriter(f);
			write.write("Hey there, this file is written using code!!");
			write.close();
		}
		catch(IOException ex) {
			System.out.println(ex.toString());
		}
		
		//f.delete();
		// Below line may throw IOException
	}

}
