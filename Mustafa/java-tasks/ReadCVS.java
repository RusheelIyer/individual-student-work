package individualWork;

//Importing necessary libraries
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class ReadCVS {
 
  public static void main(String[] args) {
	//declaring variables that will be needed
	String file = args[0];
	String line;
 
	BufferedReader x = null;
	try {
 
		//Declaring BufferedReader
		x = new BufferedReader(new FileReader(file));
		//Looping through every line in the file
		while ((line = x.readLine()) != null) {
 
		    //Splitting line on commas
			String[] info = line.split(",");
 
			//Printing out the data
			System.out.println("Name: "+info[0]+"\tEmail: "+info[1]+"\tComments: "+info[2]);
 
		}
 
	} catch (FileNotFoundException e) {
		//Printing out error if file is not found
		System.out.println("No File Found.");
	} catch (IOException e) {
		//Printing out an error if some other error occurs
		System.out.println("Error - IOException");
	} catch (ArrayIndexOutOfBoundsException e){
		//Print out error
		System.out.println("Unexpected Error")
	}
  }
}
