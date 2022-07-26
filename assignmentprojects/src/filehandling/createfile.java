package filehandling;

import java.io.File;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;

public class createfile {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try {
			File myfile = new File("E:\\JAVAFSD\\javaprojects\\assignmentprojects\\src\\demofile.txt");
			if (myfile.createNewFile()) {
				System.out.println("File created: " + myfile.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred. ");
			e.printStackTrace();
		}
		System.out.println(
				"please select one of the below operations\n\t w for write mode\n\t r for read mode\n\t a for append mode\n\t");
		Scanner in = new Scanner(System.in);
		String s = in.next();
		if (s.equalsIgnoreCase("r")) {
			filereading(s);
		} else if (s.equalsIgnoreCase("w") || s.equalsIgnoreCase("a")) {
			writingtofile(s);
		} else {
			System.out.println("Sorry try again");
		}
		in.close();
	}
	public static void writingtofile(String s) {
		Scanner in = null;
		try {
			String source = "";
			File f = new File("E:\\JAVAFSD\\javaprojects\\assignmentprojects\\\\src\\demofile.txt");
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			FileWriter f0 = null;
			if (s.equalsIgnoreCase("w")) {
				f0 = new FileWriter(f, false);
				System.out.println("Write 'stop' when you finish writing file ");
				f.delete();
				f.createNewFile();
				while (!(source = bf.readLine()).equalsIgnoreCase("stop")) {
					f0.write(source + System.getProperty("line.separator"));
				}
				bf.close();
				System.out.println("done");
			}
			else {
				f0 = new FileWriter(f, true);
				System.out.println("Write 'stop' when you finish appending file ");
				while (!(source = bf.readLine()).equalsIgnoreCase("stop")) {
					f0.append(source + System.getProperty("line.separator"));
				}
			}
			System.out.println("done");
			f0.close();
		} catch (Exception e) {
			System.out.println("Error : ");
			e.printStackTrace();
		}
	}
	public static void filereading(String s) {
		try {
			File myobj = new File("E:\\JAVAFSD\\javaprojects\\assignmentprojects\\src\\demofile.txt");
			Scanner myread = new Scanner(myobj);
			while (myread.hasNextLine()) {
				String contant = myread.nextLine();
				System.out.println(contant);
			}
			myread.close();
		} catch (FileNotFoundException e) {
			System.out.println("An Error occurred.");
			e.printStackTrace();
		}
	}
}