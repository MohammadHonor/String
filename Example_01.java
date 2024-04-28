public class Example_01{
    public static void main(String[] args) {
        String s="my name is khan";
        char [] ch = s.toCharArray();
        System.out.println(ch);
        for( int i=0 ; i<ch.length; i++){
            System.out.println(type(ch[i]));
        }
    }
}