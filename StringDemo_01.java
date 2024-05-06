public class StringDemo_01 {

    public static void main(String[] args) {
        String name="aljazeera";
char []dst=new char[8];
        System.out.println(name.codePointAt(4));
        System.out.println(name.codePointBefore(1));
        System.out.println(name.codePointCount(0,8));
        System.out.println(name.offsetByCodePoints(1,2));
        name.getChars(1,7,dst,0);
        System.out.println(name.codePointAt(2));
    //    for(int i=0; i<dst.length; i++){
    //     System.out.println(dst[i]);
    //    }

    for(char v:dst){
        System.out.println(v);
    }
    }
    
}
