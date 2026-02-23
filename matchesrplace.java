public class matchesrplace{
    public static void main (String[] args) {
        String x = "Hello";
        String y = "Hello JK Hello";
        System.out.println(x.replace( "l","i"));
        String a = "(?i)Hello";
        System.out.println(y.replace( a,"hi"));
        String b = "Hello";
        System.out.println(y.replaceFirst( b,"hi"));
        
    }
}
