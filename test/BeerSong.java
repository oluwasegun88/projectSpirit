public class BeerSong {
    public static void main(String[] args) {
        int beerNUm = 99;
        String word = "Bottles";

        while (beerNUm > 0){

            if (beerNUm == 1){
                word = "bottle";
            }
            System.out.println(beerNUm + " " + word + " of beer on the wall");
            System.out.println(beerNUm + " " + word + "of beer");
            System.out.println("Take me down");
            System.out.println("Pass it around");
            beerNUm = beerNUm - 1;


        }
    }
}
