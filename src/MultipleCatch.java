import java.util.Scanner;

public class MultipleCatch {
  /*Write a program that takes an array size N and N
    integers. Then it takes an index and a divisor. Perform division of the element at the specified index by the divisor.

Handle the following exceptions:

ArrayIndexOutOfBoundsException: If the accessed index is invalid, print "Invalid Index".
ArithmeticException: If the divisor is zero, print "Divide by zero error".*/
        // TODO: Read N
        // TODO: Create array and read N integers
        // TODO: Read index
        // TODO: Read divisor
        
        // TODO: 
        // TODO: catch ArrayIndexOutOfBoundsException -> Print "Invalid Index"
        // TODO: catch ArithmeticException -> Print "Divide by zero error"
    public static void main(String args[]){
        System.out.println("enter N:");
        Scanner sc=new Scanner(System.in);
        int n=sc.NextInt();
        int[n] arr;
              for(int i=0;i<n;i++){
                  System.out.println("enter the element:");
                  arr[i]=sc.NextInt();
                }
        System.out.println("enter the index to divide:");
        int index=sc.NextInt();
        System.out.println("enter the divisor:");
        int div=sc.NextInt();
        try{
            System.out.println(arr[index]/div);
        }
            catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Divide by zero error");
            }
            catch(ArithmeticException e){
                System.out.println("Invalid Index");
            }
        
        
    }
    
}
