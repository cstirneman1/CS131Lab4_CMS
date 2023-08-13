import java.io.*;
import java.util.*;

public class FileProcessor {

	private String fileName;
	private int stringLength;
	private ArrayList<String> stringList;
	private Scanner input;
	
	public FileProcessor(String fileName, int stringLength) {
		this.setStringLength(stringLength);
		this.fileName = fileName;
		stringList = new ArrayList <String>();
			
	}//end empty-argument constructor
	
	public int getArrayListSize() {
		
		return stringList.size();
	}//end getArrayListSize
	
	public void processFile() {
		StringTooLongException ex = new StringTooLongException("String too long!");
		try {
            input = new Scanner(new File(fileName));

            while (input.hasNextLine()) {
                String line = input.nextLine();

                if (line.length() > stringLength) {
                    throw new StringTooLongException("String is too long!");
                }

                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (StringTooLongException e) {
            System.out.println(e.getMessage());
        }
		
	}//end processFile

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getStringLength() {
		if (stringLength <= 5) {
			stringLength = 5;
		}
		else {
			stringLength = stringLength;
		}
		return stringLength;
		
	}

	public void setStringLength(int stringLength) {
		this.stringLength = stringLength;
	}
	
	
}//end class
