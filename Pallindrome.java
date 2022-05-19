class Pallindrome{
    public static void main(String args[])
    {
        java.util.Scanner scn=new java.util.Scanner(System.in);
        System.out.println("Enter the num");
        int n=scn.nextInt();
        int a=n;
        int sum=0;
        while(n>0)
        {
            int r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(sum==a)
        {
            System.out.println("Given num is pallindrome");
        }
        else{
            System.out.println("Given num is not pallindrome");
        }
    }
}