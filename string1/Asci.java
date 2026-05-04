
public class Asci {
    public static void main(String[] args){
       char c='b';
       System.out.println(asci(c));
    }
    public static int asci(char c){
        int a=(int) c;
        return a;
    }
}
// char vs String
// str.charAt(i) returns char, so use single quotes: 'a'
// Double quotes "a" are String, so str.charAt(i) == "a" is wrong

// float -> double
// float f = 5.6f;
// double d = f;          // automatic conversion

// // double -> float
// double d2 = 5.6;
// float f2 = (float) d2; // explicit casting required

// // String -> int
// String s = "123";
// int n = Integer.parseInt(s);

// // Invalid String in parseInt()
// // "12a" or very large number throws NumberFormatException

// // Safe validity check
// try {
//     int num = Integer.parseInt(s);
//     // valid integer
// } catch (NumberFormatException e) {
//     // invalid integer
// }
