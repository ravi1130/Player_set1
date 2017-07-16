import java.io.*;
public class Factorial{
public static void main(String args[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Integer fact=1;
System.out.println("Enter the value");
Integer n=Integer.parseInt(br.readLine());
if(n>0){
for(i=1;i<=n;i++){
fact=fact*i;
}
System.out.println(fact);
}
else
System.out.println(fact);
}
}
