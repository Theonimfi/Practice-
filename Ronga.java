import java.io.*;
import  java.util.Random;

public class Ronga {
	public static byte[] aThisn = {97, 98, 99, 100, 101, 102, 103};
	public static long mErastus(String fileName) {
		long ret = 0;
		String filePath =
		    "C:\\Users\\tanogeianaki\\Desktop\\java_programming_2\\exercises\\";
		File f = new File(filePath);
		long size = f.length();
		size = 855;
		Random rand = new Random();
		BufferedOutputStream out = null;
		try {
		    out = new BufferedOutputStream(new
		        FileOutputStream(filePath + fileName));
		    for (int i = 0; i < size; i++) {
			    out.write(aThisn[rand.nextInt(7)]);
	        }
		} catch (FileNotFoundException e) {
		    System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e);
		}
		BufferedReader in = null;
		try {
		    in = new BufferedReader(new
		        InputStreamReader(new FileInputStream(fileName)));
		    for (int i = 0; i < 500; i++) {
			    ret = ret + in.read();
	     	}
		} catch (FileNotFoundException e) {
		    System.err.println(e.getMessage());
	    } catch (UnsupportedEncodingException e) {
		    System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e);
		}
		return ret;
	}
	public static int[] mTeemer(String fileName) {
		String filePath =
		    "C:\\Users\\tanogeianaki\\Desktop\\java_programming_2\\exercises";
	    BufferedReader in = null;
		try {
		    in = new BufferedReader(new
		    InputStreamReader(new FileInputStream(filePath + fileName)));
		} catch (FileNotFoundException e) {
	        System.err.println(e.getMessage());
	    }
	    int size = 0;
	    int []a = new int[8];
	    try {
			int b;
			while ((b = in.read()) != -1) {
				size++;
			    for (int i = 1; i < 8; i++) {
					if (b == aThisn[i]) {
						a[i]++;
					}
				}
			}
			a[0] = size;
		} catch (UnsupportedEncodingException e) {
		    System.err.println(e.getMessage());
	    } catch (Exception e) {
		    System.err.println(e);
	    }
	    return a;
    }
}






