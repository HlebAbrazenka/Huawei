package HomeWork;
public class IstudyBasicJava1 {
    public static void main(String[] args) {
        String s = "I study Basic Java!";
        char result = s.charAt(18);
        System.out.print("Last symbol - " + result);

        //------------------------------------------------//
        String string = "I study Basic Java!";
        String PartOfString = "Java";
        System.out.println("Is string contain Java? - ");
        System.out.println(string.contains(PartOfString));

        //-------------------------------------------------//
        String GoodString = "I study Basic Java!";
        String BadString = GoodString.replace('a', 'o');
        System.out.println("Good string - " + GoodString);
        System.out.println("Bad string - " + BadString);

        //--------------------------------------------------//
        System.out.println(s.toLowerCase());

        //-------------------------------------------------//
        System.out.println(s.toUpperCase());

        //--------------------------------------------------//
        String subString = "I study Basic Java!";
        System.out.println(subString.substring(14));

        //---------------------------------------------------//
    }

}