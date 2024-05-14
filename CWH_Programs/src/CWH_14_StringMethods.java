import javax.xml.stream.events.StartDocument;

public class CWH_14_StringMethods {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str);
        int value = str.length();
        System.out.println(value);
        String value2 = str.toLowerCase();
        System.out.println(value2);

        String value3 = str.toUpperCase();
        System.out.println(value3);

        String str2="        Hello    World";
        String value4 = str2.trim();
        System.out.println(value4);
        String str3= str2.trim();
        System.out.println(str3);

        String value5 = str.substring(3);
        System.out.println(value5);

        String value6 = str.substring(0,3);
        System.out.println(value6);

        String value7 = str.replace('H','j');
        System.out.println(value7);

        boolean value8 = str.startsWith("He");
        System.out.println(value8);

        boolean value9 = str.endsWith("j");
        System.out.println(value9);

        char value10 = str.charAt(6);
        System.out.println(value10);

        int value11 = str.indexOf("d");
        System.out.println(value11);

        int value12 = str.lastIndexOf("H");
        System.out.println(value12);

        int value13 = str.lastIndexOf("b",6);
        System.out.println(value13);

        boolean value14 = str.equals("Hello World");
        System.out.println(value14);

        boolean value15 = str.equalsIgnoreCase("HELLO WORLD");
        System.out.println(value15);


        System.out.println("I am escape sequemce \" double quote");
    }

}
