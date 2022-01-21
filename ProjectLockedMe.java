package Project1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProjectLockedMe {

	public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	int choice,choice1,choice2,c1=0,count=0;
	String st;
	File mfolder=new File("Driver.file");
	mfolder.mkdir();
	String location="Driver.file";
	
	System.out.println("Welcome toi virtual key Repositories\n\n");
    System.out.println("Please Enter key to continue");
    System.in.read();
    choice=0;
    System.out.println("MAIN MENU");
    System.out.println("Select the options given below");
    System.out.println("1.Retrieve all files inside the main folder");
    System.out.println("2.Perform file operations");
    System.out.println("3.Exit\n");
    choice=sc.nextInt();
    switch(choice) {
  case 1:
    	File obj=new File("Driver.file");
    	File Farray[] =obj.listFiles();
    	for(int i=0;i<Farray.length;i++) {
    		if(Farray[i].isFile()) {
    			System.out.println("File: "+Farray[i] +"\n\n");
    		}else if(Farray[i].isDirectory()){
    			System.out.println("Folder: "+Farray[i] +"\n\n");
    		}
    	}
    	break;
    case 2:
    	do {
    		count=0;
    		System.out.println("FOLDER/FILE OPERATION SECTION");
	    	System.out.println("Select the Options Given Below:");
		    System.out.println("1. Add File/Folder");
		    System.out.println("2. Delete File/Folder");
		    System.out.println("3. Search File/Folder");
		    System.out.println("4. Go back to Main Menu");
		    System.out.println("5. Exit\n");
		    choice1=sc.nextInt();
		    switch(choice1) {
        case 1:
		    	System.out.println("Want add file or folder?");
		      System.out.println("Press 1 for folder,press 2 for file");
		    choice2=sc.nextInt();
		    switch(choice2) {
		      case 1:
		    	System.out.println("Please Enter the folder name");
		    String str1=sc.next();
		    File addfolder = new File(location+"\\"+str1);
    		if(addfolder.exists()) {
    			System.out.println("Already exits !! Please Enter Again\n");
    		}else {
    			addfolder.mkdir();
    			System.out.println("!!Your Folder is created!!\n");
    		}
    		break;
		      case 2:
		    	System.out.println("Please Enter the File name with Extension");
		    	String str2 = sc.next();
	    		File addfile = new File(location+"\\"+str2);
	    		if(addfile.exists()) {
	    			System.out.println("Already exits !! Please Enter Again\n");
	    			}else {
	    				try {
	    					addfile.createNewFile();
	    					System.out.println("!!Your File is created!!\n");
	    				}catch(IOException e) {
	    					e.printStackTrace();
	    				}
	    			}
	    		break;
		    default:
	    		System.out.println("Please Enter Correct Value!!!!!\n");
		    }
		 case 2:
			 c1=0;
		    	System.out.println("Want to Delete File or Folder?");
		    	System.out.println("Press 1 for Folder, Press 2 for File:");
		    	c1 = sc.nextInt();
            switch(c1) {
              case 1:
            	System.out.println("Please Enter the Folder name");
	    		st = sc.next();
	    		File delFolder = new File(location+"\\"+st);
	    		if(delFolder.exists()) {
	    			delFolder.delete();
	    			System.out.println("Folder Deleted\n");
	    		}
	    		else {
	    			System.out.println("!!Folder not Found!!!\n");
	    		}
	    		break;
    		  case 2: 
    		System.out.println("Please Enter the File name with extension");
    		st = sc.next();
    		File delFile = new File(location+"\\"+st);
    		if(delFile.exists()) {
    			delFile.delete();
    			System.out.println("File Deleted\n");
    			}else {
    				System.out.println("!!File not Found!!!\n");
    			}
    		break;
	    	default:
	    		System.out.println("Please Enter Correct Value!!!!!\n");
            }
            break;
	  case 3:
		    	System.out.println("Please Enter Name of File/Folder:");
		    	st = sc.next();
		    	File fsearch = new File("Driver.file");
				File FSarray[] = fsearch.listFiles();
		    	for(int i=0;i<FSarray.length;i++) {
		    		if(FSarray[i].getName().startsWith(st)) {
		    			count++;
		    			if(FSarray[i].isFile()) {
			    			System.out.println("File: "+FSarray[i]+"\n\n");
			    		}
			    		else if(FSarray[i].isDirectory()) {
			    			System.out.println("Folder: "+FSarray[i]+"\n\n");
			    		}
		    		}    		
		    	}

		    	if(count==0)
		    		System.out.println("No Record found\n");
		    	break;
	  case 4: 

	    	break;
	    case 5:
	    	System.out.println("Thanks for using this application");
	    	System.exit(1);
	    	break;
	    
	    default:
  		 System.out.println("Wrong input");

		    }

		    System.out.println("Press Enter to continue...");
		    System.in.read();
    	}while(choice1!=4);
    	break;
 case 3:
    	System.out.println("Thanks for using this "
    			+ "application");
    	System.exit(1);
    	default:
    		 System.out.println("Wrong input");
    }
	
	while(choice!=3);
    sc.close();
}   

}
