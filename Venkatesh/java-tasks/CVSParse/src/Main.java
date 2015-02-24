import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		String location = args[0]; //Take the location of file from the first command line argument
		while(true){ //Repeats until it is stopped from elsewhere
			try {
				BufferedReader r = new BufferedReader(new FileReader(location)); //Attempts to create a buffered reader with location specified
				run(r); //Calls the method to iterate over the file after ensuring that the file location is correct
			}
			
			catch(FileNotFoundException e){
				System.out.println("File not found. Please re-enter file location"); //Prompts manual location input if file is not found
				Scanner s = new Scanner(System.in);
				location = s.nextLine().replaceAll("//s", ""); //Takes input using scanner
				s.close(); //Closes scanner
			}
			
			catch (Exception e){
				System.out.println("Unexpected error"); //Response to all unknown exceptions
				System.exit(0); //Closes the program
			}
		}
	}
	
	public static void run(BufferedReader r){
		String line = "";
		try {
			while ((line = r.readLine()) != null){ //Stores the next line and loops as long as the file is not over
				String[] items = line.split(","); // Split based on comma since CSV is comma seperated
				try {
					System.out.println("Name" + items[0] + "Email" + items[1]+ "Comment" + items[2]); //Try to provide output
				}
				catch (ArrayIndexOutOfBoundsException e){
					System.out.println("Malformed line, line has been skipped"); //If the line is missing items, skip the line
				}
			}
			r.close(); // Close the reader
		}
		catch (Exception e){
			System.out.println("Unexpected error"); //Response to all unknown exceptions
		}
		
		finally{ //Always occurs
			System.exit(0); //Close the program
		}
	}

}
