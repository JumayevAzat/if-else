public class Homework1 {
    public static void main(String[] args) {
        int i = 5;

        /*if (i == 1) {
            System.out.println("January");
        } else if (i == 2) {
            System.out.println("Febuary");
        } else if (i == 3) {
            System.out.println("March");
        } else if (i == 4) {
            System.out.println("April");
        } else if (i == 5) {
            System.out.println("May");
        } else if (i == 6) {
            System.out.println("June");
        } else if (i == 7) {
            System.out.println("July");
        } else if (i == 8) {
            System.out.println("August");
        } else if (i == 9) {
            System.out.println("September");
        } else if (i == 10) {
            System.out.println("October");
        } else if (i == 11) {
            System.out.println("November");
        } else if (i == 12) {
            System.out.println("December");
        } else {
            System.out.println("This month does not exist");
        } */

        switch ( i ) {
            case 1:  System.out.println("January");
                break;
            case 2:  System.out.println("February");
                break;
            case 3:  System.out.println("March");
                break;
            case 4:  System.out.println("April");
                break;
            case 5:  System.out.println("May");
                break;
            case 6:  System.out.println("June");
                break;
            case 7:  System.out.println("July");
                break;
            case 8:  System.out.println("August");
                break;
            case 9:  System.out.println("September");
                break;
            case 10:  System.out.println("October");
                break;
            case 11:  System.out.println("November");
                break;
            case 12:  System.out.println("December");
                break;
            default: System.out.println("This month does not exist");
                break;
        }
    }

}
