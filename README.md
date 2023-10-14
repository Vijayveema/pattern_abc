# pattern_abc
public class MyClass {
    public static void main(String args[]) {
     int n=6;
     for(int i=1;i<=n;i++){
         char ch='A';
         boolean flag=true;
         for(int j=1;j<n*2;j++){
            if(j>=n+1-i&&j<=n+i-1){
                if(flag==true){
                    System.out.print(ch); 
                    flag=false;
                    ch++;
                }
                else{
                    System.out.print(" ");
                    flag = true;
                }
            }
            else{
                    System.out.print(" ");
                }
         }
         System.out.println("");
     }
    }
}
