public class StringProg1 {
    public static void main(String args[])
    {
        String s="Java122552Java";
        String s1="";
        s=s.toLowerCase();

      for(int i=0;i<s.length();i++)
      {
             char c=s.charAt(i);
             if(c>='a' &&c<='z')
             {
                 s1=s1+c;
             }

             else if(c>='A' && c<='Z')
             {
                 s1=s1+c;
             }
         }

     System.out.println(s1);   // Output - JavaJava
       System.out.println(s);        // Output - Java122552java
    }
}
