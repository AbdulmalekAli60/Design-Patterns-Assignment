public class Beef extends SandwichDecorator {
    private double beefPrice = 5;
    private String beefDescreption = " Local Beef";

    public Beef(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public double getCost() {

        return super.getCost() + beefPrice;
    }

    @Override
    public String getDescreption() {

        return super.getDescreption() + beefDescreption;
    }

    // setters and getters

    public double getBeefPrice() {
        return beefPrice;
    }

    public void setBeefPrice(double beefPrice) {
        this.beefPrice = beefPrice;
    }

    public String getBeefDescreption() {
        return beefDescreption;
    }

    public void setBeefDescreption(String beefDescreption) {
        this.beefDescreption = beefDescreption;
    }

}
