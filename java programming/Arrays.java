import java.util.Scanner;
public class Arrays
    {
        public static void main(String[] args)

        {
            System.out.println("enter number of elements :"); 
            Scanner input = new Scanner(System.in); 
            int n = input.nextInt();
            int myNum[] = new int[10];
            System.out.println("-----elements into arry-----");
            for(int i=0;i<=n-1;i++)
              {
                myNum[i]  = input.nextInt();
              }
              

        }

    
}
