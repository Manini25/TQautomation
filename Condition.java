class Condition
{
    public static void main(String args[])
    {
        java.util.Scanner scn= new java.util.Scanner (System.in);
        System.out.println("Enter first num");
        int a=scn.nextInt();

        System.out.println("Enter second num");
        int b=scn.nextInt();

        if(a>b)
        {
            System.out.println("First num is greater than second");
        }

        else if(a<b)
        {
            System.out.println("Second num is greater than first");
        }

        else
        {
            System.out.println("Both numbers are same");
        }

    }
}