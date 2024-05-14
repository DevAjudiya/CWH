public class CWH_09_Assocaiativity {
    public static void main(String[] args) {
        int a=6*5-34/2;
/*          =30-34/2
*           =30-17
*           =13 */

        int b=6/5-34*2;
        /*    =6/5-68
        *     =0-67
        *     =-67*/


        System.out.println(b);
        System.out.println(a);
//        Precedence & Associativity
//               *,/ --> Higher L to R
//                 +,- --> Middle L to R

        //Quik Quiz
        int x=2, y=4, z=3;
//        int k = x-y/2;
        int k =x*x-4*a*z/2*x;
        System.out.println(k);
    }
}
