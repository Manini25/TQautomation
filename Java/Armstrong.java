class Armstrong{
    public static void main(String args[])
    {
        java.util.Scanner scn = new java.util.Scanner(System.in);
        System.out.println("Enter num");
        int n=scn.nextInt();

        int a=n;
        int sum=0;
        while(n>0)
        {
            int r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        if(sum==a)
        {
            System.out.println("Given num is armstrong");
        }
        else{
            System.out.println("Given num is not armstrong");
        }
    }
}
