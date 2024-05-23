import java.util.Scanner;
public class CWH_27_each_loop_array {
    public static void main(String[] args) {
        int [] noms ={1,2,3,4,5,6 };   // method 2
        float [] marks = {99.1f,56.3f,88.6f,56.6f,52.005f};
        System.out.println(marks.length);
        System.out.println("Naive method");
        System.out.println(marks[0]);

        System.out.println("loop method");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("Reverse order loop");
        for (int j =marks.length -1 ; j>=0;j--){
            System.out.println(marks[j]);
        }
        System.out.println("Fot each loop");
        for (float element:marks){
            System.out.println(element);
        }

 }
}
