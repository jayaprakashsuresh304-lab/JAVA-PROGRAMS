import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the String");
        String x = data.nextLine(); 
        char y = x.charAt(0);
        System.out.println(y);
         
        int a = x.codePointAt(0);
        System.out.println(a);
        
        int b = x.codePointBefore(2);
        System.out.println(b);
    }
}


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
         
        System.out.println("enter the data1");
        String a =x.nextLine();
        System.out.println("enter the data2");
        String b =x.nextLine();
        
        int y = a.codePointCount(0,4);
        System.out.println(y);
        
        int z = a.compareTo(b);
        System.out.println(z);

        
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
         
        System.out.println("enter the data1");
        String a =x.nextLine();
        System.out.println("enter the data2");
        String b =x.nextLine();
        
        int y = a.compareToIgnoreCase(b);
        System.out.println(y);
        
        
        System.out.println(a.concat(b));        
        
    }
}



import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
         
        System.out.println("enter the String");
        String y = x.nextLine();
        
        System.out.println(y.contains("he"));
         System.out.println(y.contains("e"));
          System.out.println(y.contains("hi"));
           System.out.println(y.contentEquals("hello"));
            System.out.println(y.contentEquals("h"));
    }
}


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    
        Scanner data = new Scanner(System.in);
        char[] d = {'H','E','L','L','O'};
        String str = "hello";
        
        System.out.println(str.copyValueOf(d,0,5));
        System.out.println(str.endsWith("lo"));
        System.out.println(d.equals(str));
        
        
    }
}


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
         
     System.out.println("enter the String");
     String a = x.nextLine();
     System.out.println(a.equalsIgnoreCase("hello"));
     String b = "hi %s my age %d";
     String result = String.format(b,"mangudi",19);
     System.out.println(result);
       
    }
}


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
         
     char[] data = {'0','1','2','3','4','5','6','7','8','9'};

     String myString = "HelloWorld!";
     myString.getChars(5,11,data,4);
     System.out.println(data);
       
    }
}




import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
         
   String name = "mangudi";
   byte [] a = name.getBytes();
   System.out.println(a[0]);
       
    }
}



import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
         
   String name = "mangudi";
   byte [] a = name.getBytes();
   System.out.println(name.hashCode());
       
    }
}


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
         
        String x = "hello world";
        System.out.println(x.indexOf("world"));
       
    }
}


import java.util.Scanner;
class main{
    public static void main(String [] args){
        Scanner data =  new Scanner(System.in);
        
        String x = "hello";
        System.out.println(x.isEmpty());
    }
}



import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String x = String.join("mangudi","R","S");
        System.out.println(x);
    }
}

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String x = "Helloworld";
        System.out.println(x.lastIndexOf("world"));
    }
}

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String x = "Helloworld";
        System.out.println(x.length());
    }
}