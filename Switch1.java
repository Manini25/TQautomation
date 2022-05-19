class Switch1
{
    public static void main(String[] args)
    {
        java.util.Scanner scn = new java.util.Scanner(System.in);
        
        System.out.println("choose perform");
        String oper=scn.next();

        System.out.println("Enter first num");
        int a=scn.nextInt();

        System.out.println("Enter second num");
        int b=scn.nextInt();

        switch(oper)
        {
            case Add : System.out.println("Addition of two nums is" +(a+b));
            break;

            case sub:System.out.println("Subtraction of two nums is" +(a-b));
            break;

            case mul:System.out.println("multiplication of two nums is" +(a*b));
            break;

            case div:System.out.println("division of two nums is" +(a/b));
            break;
        }
    }
}
