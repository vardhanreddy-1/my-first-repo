public class Spacepattern2 {
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=4;j>=i;j--)
            {
                  System.out.print("*");
            }
            System.out.println();
            for(int k=1;k<=i;k++)
            {
                System.out.print(" ");
            }

        }  
    }
}
