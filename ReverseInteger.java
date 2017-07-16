import java.io.*;
public class ReverseInteger {

	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Integer rev=0,r;
    System.out.println("Enter the value");
		Integer n=Integer.parseInt(br.readLine());
    while(n>0){
    r=n%10;
    rev=rev*10+r;
    n=n/10;
    }
   System.out.println(rev);
    }
    }
