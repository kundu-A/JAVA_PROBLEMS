public class StringNumber {
    public static void main(String[] args) {
        String s="a21b3c5";
        int n=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit((s.charAt(i)))==true){
                n=Integer.parseInt(String.valueOf(s.charAt(i)));
                for(int j=0;j<n;j++)
                    System.out.print(s.charAt(i-1)+" ");
            }
        }
    }
}
