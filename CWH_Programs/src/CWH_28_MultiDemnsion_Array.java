public class CWH_28_MultiDemnsion_Array {
    public static void main(String[] args) {
        int [] [] marks;
        marks = new int [3][3];
        marks[0][0] = 101;
        marks[0][1] = 102;
        marks[0][2] = 103;
        marks[1][0] = 104;
        marks[1][1] = 105;
        marks[1][2] = 106;
        marks[2][0] = 107;
        marks[2][1] = 108;
        marks[2][2] = 109;

        System.out.println("print numbers");
     /* for(int i=0;i<marks.length;i++){
          System.out.println(marks[i][0]+" "+marks[i][1]+" "+marks[i][2]);
      }
        System.out.println("Reverse");
    for (int i=marks.length-1;i>=0;i--){
        System.out.println(marks[i][0]+" "+marks[i][1]+" "+marks[i][2]);
    }*/

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

}
