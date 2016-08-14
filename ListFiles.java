
import java.io.File;
import java.io.FileFilter; 

class ListFiles {
    public static void main(String []args) {
    	File[] files = new File(".").listFiles(
        	new FileFilter() {
                	public boolean accept(File f) { return f.isFile(); }
                }
        );
        for(File file: files) {
        	System.out.println(file);
        }
    }
}
