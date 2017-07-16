import java.io.*;
public class Integer {

	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    		System.out.println("Enter the String");
        String str=br.readLine();
        Integer n=Integer.parseInt(str);
        System.out.println(n);
    }
    }
