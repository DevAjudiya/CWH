
import javax.xml.transform.Source;
import java.util.Scanner;

public class CWH_15_PracticeSET03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //problem1
        System.out.print("Enter the name ");
        String s = sc.nextLine();
        String name =s.toLowerCase();
        System.out.println(name);

        //problem2
        String name1 =s.replace(" ","_");
        System.out.println(name1);

        //problem 3
        String lt = "Dear |name| , Thanks a lot !!";
        lt = lt.replace("|name|",s);
        System.out.println(lt);

        //problem 4
        String myString = "This String is contains  double and triple space";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //problem 5
        String myletter = "Dear Harry, \n\tThis JAVA course is Nice . \nThanks!";
        System.out.println(myletter);
    }
}
