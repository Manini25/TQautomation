class ScannerNext
{
    public static void main(String[] args)
    {
        java.util.Scanner scn = new java.util.Scanner(System.in);
        System.out.println("Enter your name");
        String name=scn.next();

        System.out.println("Enter your age");
        int age= scn.nextInt();

        System.out.println("Enter your gender");
        char gender=scn.next().charAt(1);

        System.out.println("name=" +name+ ",age=" +age+ ",gender=" +gender);


    }
}
