package PracticeProject1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Arrays;

public class FileHandlingMechanism {

	public static void main(String[] args)throws IOException{
		createFileusingFileClass();
		createFileusingFileOutputStreamClass();
		createFilein_NIO();
	}
	
	private static void createFileusingFileClass()throws IOException{
		File file=new File("files1.txt");
		//creat the file
		if(file.createNewFile()) {
			System.out.println("File is created");
		}else {
	System.out.println("File already exists");
		}
		
	//Write content
		FileWriter writer=new FileWriter(file);
		writer.write("Test data");
		writer.close();
	}
private static void createFileusingFileOutputStreamClass()throws IOException {
	String data="Test data"	;
		FileOutputStream out=new FileOutputStream("files1.txt");
	out.write(data.getBytes());
	out.close();
	}
private static void createFilein_NIO() throws IOException{
	String data="Test data";
	Files.write(Paths.get("files1.txt"),data.getBytes());
	List<String>lines=Arrays.asList("1stline","2nd line");
	Files.write(Paths.get("files1.txt"),lines,StandardCharsets.UTF_8,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
}

}
