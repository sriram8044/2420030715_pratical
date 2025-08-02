class string_ex {
    public static void main (String [] args){
        String s1="this is java class ";
        String s2="hello";
        String s3="Hello";
        String s4="1234";
        String s5="java234";
        String s6="";
        System.out.println(s1.length());
         System.out.println(s1.toUpperCase());
         System.out.println(s3.toLowerCase()); 
         System.out.println(s4.charAt(3));
          System.out.println(s5.length());
           System.out.println(s2.compareTo(s3));
           System.out.println(s2.compareToIgnoreCase(s3));
           System.out.println(s2.concat(s3));// return valu is string it attctes t
           System.out.println(s2.compareTo(s3));
           System.out.println(s2.contains(s3));
            System.out.println(s2.endsWith(s3));
             System.out.println(s1.indexOf("s"));   //first occurence 
              System.out.println(s2.endsWith(s3));
             System.out.println(s1.isEmpty());
             String s10="hii;how;are;you";
             String s11[]=s10.split(".");
             System.out.println(s11);
             
            





    }
}