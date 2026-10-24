
import java.util.*;
public class Main
{
 public static void main(String[] args)
 {
 Scanner s=new Scanner(System.in);
 System.out.println("Enter your full name:");
 String s1=s.nextLine();
 System.out.println("Enter your age:");
 int age=s.nextInt();
 String [] arr=s1.split(" ");
 System.out.println("Your password is:");
 for(int i=0;i<arr.length;i++)
 {
 System.out.print(arr[i].charAt(0)+"_");
 }
 System.out.print(arr[arr.length-1]+"@"+age);
 }
 }