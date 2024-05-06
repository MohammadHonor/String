/**
 * Innercompar
 */
class P{
    String s;
    String n;
    
public P(String s ,String n) {
        this.s = s;
        this.n = n;
    }



    @Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((s == null) ? 0 : s.hashCode());
    result = prime * result + ((n == null) ? 0 : n.hashCode());
    return result;
}



@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    P other = (P) obj;
    if (s == null) {
        if (other.s != null)
            return false;
    } else if (!s.equals(other.s))
        return false;
    if (n == null) {
        if (other.n != null)
            return false;
    } else if (!n.equals(other.n))
        return false;
    return true;
}
    @Override
    public String toString() {
        return "P [n=" + n + "]";
    } 
    
}




public class compar {
    public static void main(String[] args) {
        // authentication-equals()
        //sorting- comapareTo()
        // reference matching -==
        // String s="ali";
        // String n= new String("ali");
        // System.out.println( s.equals(n));


        // System.out.println(s==n);


        // System.out.println(s.compareTo(n));


        P obj1= new P("ali","mohammad");
        P obj2= new P("ali","khan");
      
        System.out.println(obj1.equals(obj2) +""+obj1);

    }
    
}
