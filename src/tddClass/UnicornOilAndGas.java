package tddClass;

public class UnicornOilAndGas {
    private String location;
    private final double pricePerLitre = 200;
    private double litreBought;

    public UnicornOilAndGas(String location){
        this.location = location;
    }
    public void setLitreBought(double litreBought){
        this.litreBought = litreBought;
    }

    public double getLitreBought() {
        return litreBought;
    }
    public double petrolAmount(){
        double amount = pricePerLitre *litreBought;
        return amount;
    }

    private   double discount(){
        double discount = petrolAmount() * 2 /100;
        return discount;
    }

    public  double priceAfterDiscount(){
        double priceAfterDiscount = petrolAmount() - discount();
        return priceAfterDiscount;
    }

}
