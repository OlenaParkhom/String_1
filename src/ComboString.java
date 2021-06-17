public class ComboString { // https://codingbat.com/prob/p168564
    public static void main(String[] args){
        String str = " Hello";
        String str2 = " Hej";
        String newstr = str.substring((str.length()-5),str.length());
        String newstr2 = str2.substring(1,4);
        System.out.println(newstr2+newstr+newstr2);

    }
}
