class Patterns
{
    public static void main(String args[])
    {

        int i,j;
         for(i=0;i<=4;i++)
         {
             for(j=0;i>=j;j++)
             { 
                System.out.print("*");
                 
             }
             System.out.println(); 
         }
         for(i=1;i<=4;i++)
         {
             for (j=4;j>=i;j--)
             {
                System.out.print("*");
             }
             System.out.println();
         }
           
        }
}
