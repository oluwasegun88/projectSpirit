public class Summation {
    public static void main(String[] args) {
        int [] array = {5,10,15,20,25,30};
        int total = 0;
        for (int number:array){
            total += number;
        }
        System.out.printf("Total of array element:%d%n", total);
    }

}
