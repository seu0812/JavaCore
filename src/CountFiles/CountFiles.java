package CountFiles;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CountFiles {
	
	static List<File> files = new ArrayList<>();

	public static void main(String[] args) {
		File dir = new File("c:\\Program Files");
		
		catalog(dir);

	for (File file : files) {
		
		System.out.println(file.getAbsolutePath());
		
	}
	System.out.println(files.size());
	}
	public static void catalog(File dir) {
			File[] items = dir.listFiles();
			if(items == null){
				files.add(dir);
				return;
				
			}
		
			for (File item : items){ 
				if (item.isDirectory()){					
					files.add(item);
				//	catalog(item);
								
				} else{
					files.add(item);
				}
			}
			
			
			}
			
		}

		
	
	
	


