public class Strings_2 {

    public static void main(String[] args) {
    
       String name = "Sahil";
       int st = name.length();
       System.out.println(st); // 6 and 7 lines is same as line 8.
       System.out.println(name.length()); 
       System.out.println(name.toLowerCase()); 
       System.out.println(name.toUpperCase()); 


        String nonTrim = "   mouse    ";
        System.out.println(nonTrim);   // without trim method


       System.out.println(nonTrim.trim()); // this is the use of trim method it helps in removing unwanted spaces in a string.

        System.out.println(name.substring(1));  //ahil ----output
        // what this will do is it will print string excluding S which is at 0th position since we have mentioned the position as 1 so it will start from 'a' and will continue to print untill the string ends. this is the use of substring single parameter.


        System.out.println(name.substring(1,3));   //ah ----output
        // substring with 2 parameter will print string from 1st index to 2nd index but will not print 3rd index.
        // but we have to mention 3rd index to print string till 2nd index.
        // 0  1  2  3  4
        // S  a  h  i  l
        // these are the index numbers
        //* but note that length of this string will always be 5*.

        System.out.println(name.replace('i','o'));

        System.out.println(name.replace("S","o"));
        System.out.println(name.replace("S","abc"));

        System.out.println(name.startsWith("S")); // true
        System.out.println(name.endsWith("l"));   //true

        System.out.println(name.charAt(3));   //i
        

 }   
}
