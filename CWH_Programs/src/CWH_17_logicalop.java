public class CWH_17_logicalop {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        if(a && b) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        if(a || b) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
//        if(a  b) {
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//        }
        System.out.println(a);
        System.out.println(b);   // not Operator
        System.out.println(!a);
        System.out.println(!b);

    }

}


