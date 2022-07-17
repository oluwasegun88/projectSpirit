package Rehearsals;

public class Looping {
    public static void main(String[] args) {
        int i,j ;

        for (i = 1; i <= 6; i++) {

            for (j = 1; j <= i; j++) {
                System.out.printf(" %d ",j);
             }
            System.out.printf("\n");
        }
        System.out.println("Update");
        System.out.println("Update");
    }

}