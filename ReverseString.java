import java.io.*;
public class ReverseString{
public static void main(String args[])throws IOException{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String rev="";
   char c;
   System.out.println("Enter the string");
   String str=br.readLine();
   Integer l=str.length();
   for(int i=l-1;i>=0;i--){
   c=str.charAt(i);
   rev=rev+c;
   }
   System.out.println(rev);
}
}
