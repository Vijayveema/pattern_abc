import java. util.Scanner;
import java.lang.*;
public class pattern3{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter tna numbet");
  int n=sc.nextInt();
 for(int i=1;i<=n;i++){
          char ch='A';
          for(int j=1;j<n*2;j++){
              if(j>=n-i+1&&j<=n+i-1){
                  if(j==n-i+1||j==n+i-1||i==n) 
                         System.out.print(ch);
                     else
                     System.out.print(" ");
                     ch++;
              }
              else
              System.out.print(" ");
          }
          System.out.println(" ");
      }
      
    }
}