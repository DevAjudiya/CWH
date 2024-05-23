public class CWH_24_Brack_and_Continue {
    public static void main(String[] args) {
//        Break and Continue using Loops
        int i;
        for (i=0;i<5;i++){
            if(i==2){
                System.out.println("Ending the loops");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }

//    while (i<5) {
//        System.out.println(i);
//        System.out.println("java is great");
//        if (i == 2) {
//            System.out.println("Ending the loops");
//            break;
//        }
//        i++;
//    }

    }

}
