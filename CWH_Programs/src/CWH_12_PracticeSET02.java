import java.util.Scanner;
public class CWH_12_PracticeSET02 {
//    Pr1
    public static void main(String[] args) {
        float a= 7/4f*9/2f;
        System.out.println(a);

//     Pr2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Grade: ");
        char grade = sc.next().charAt(0);
        grade = (char)(grade+8);
        System.out.println(grade);

        //Decrypt
        grade = (char)(grade-8);
        System.out.println(grade);

//        Pr3

        int b= sc.nextInt();
        System.out.println(b>8);


    }
}
