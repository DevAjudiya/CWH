import java.util.Scanner;
public class CWH_Pr_03 {
    public static void main(String[] args) {
//      Pr_1
     /*   int a = 10;
        if (a == 11) {
            System.out.println("a=11");

        } else {
            System.out.println("a=12");
        }
        */
//        Pr_2
        Scanner sc = new Scanner(System.in);
      /*  byte m1, m2, m3;
        System.out.println("Enter the marks of Physics");
        m1 = sc.nextByte();
        System.out.println("Enter the marks of Chemistics");
        m2 = sc.nextByte();
        System.out.println("Enter the marks of Maths");
        m3 = sc.nextByte();

        float avg = (m1 + m2 + m3) / 3;
        System.out.println("The average marks is " + avg);

        if (avg <= 40 && m1 == 33 && m2 == 33 && m3 == 33) {
            System.out.println("You are Pass");

        } else {
            System.out.println("You are Not Pass");
        }
*/
//        Pr_3
       /*float tax = 0;
        System.out.println("Enter the income");
        float income = sc.nextFloat();
        if(income<2.5){
            tax =tax +0;
        }
        else if(income>2.5f && income<=5f){
            tax =tax + 0.05f * (income - 2.5f);

        }
        else if(income>5f && income<=10f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income>10f){
                tax =tax + 0.05f * (5.0f - 2.5f);
                tax = tax + 0.05f * (10.0f - 5f);
                tax = tax + 0.3f * (income - 10f);

            }
        System.out.println("The tax is "+tax);

        */

//        PR_4
        /*       int day;
        System.out.println("Enter the day of the week: ");
            day = sc.nextInt();


               switch(day) {
                   case 1:
                       System.out.println("Monday");
                       break;
                   case 2:
                       System.out.println("Tuesday");
                       break;


                   case 3:
                       System.out.println("Wednesday");
                       break;
                   case 4:
                       System.out.println("Thursday");
                       break;
                   case 5:
                       System.out.println("Friday");
                       break;
                   case 6:
                       System.out.println("Saturday");
                       break;
                   case 7:
                       System.out.println("Sunday");
                       break;
                   default:
                       System.out.println("Invalid day");
               }

         */
//         Pr5
      /*  System.out.println("Enter the year");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");

        }

       */
//        Pr 6
        System.out.println("Enter the website");
        String website = sc.nextLine();

        if (website.endsWith(".com"))
        {
            System.out.println("Your website is a universal website");
        }
        else if (website.endsWith(".in")){
            System.out.println("Your website is a indian website");
        }
        else if (website.endsWith(".org")){
            System.out.println("Your website is a opensource website");
        }
        else if (website.endsWith(".gov")){
            System.out.println("Your website is a government website");
        }

               }
        }




