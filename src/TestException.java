
public class TestException {

	public static void main(String[] args) {

		FileProcessor processor = new FileProcessor("BadString.txt", 10);
        processor.processFile();
        System.out.println("ArrayList size: " + processor.getArrayListSize());
        
        processor.getArrayListSize();
    }

}


