public class ReversString {
    public static void main(String args[])
    {
        System.out.println(reversestring("Java Program"));
    }

    public static String reversestring(String s)
    {
        StringBuilder sb= new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
