public class Triangle {

    public static void main(String[] args) {
        int n = 5;
        int Row; int Col;
        for (Row=1; Row <=n; Row ++){
            for (Col=1; Col <=Row; Col++){
                System.out.print(Col);
            }
        }

        System.out.println();
    }
}
