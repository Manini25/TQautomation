
class Fibonacci
{
    public static void main(String args[])
    {
        java.util.Scanner scn = new java.util.Scanner(System.in);
        System.out.println("Enter 1st num");
        int x=scn.nextInt();

        System.out.println("Enter 2nd num");
        int y=scn.nextInt();

        System.out.println("Enter the num of seriess");
        int n=scn.nextInt();

        System.out.println(x+ "");
        System.out.println(y+ "");

        for(int i=1;i<=n;i++)
        {
            int c=x+y;
            System.out.println(c+ "");
            x=y;
            y=c;
        }


    }
}