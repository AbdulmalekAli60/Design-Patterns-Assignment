public class Cheese extends SandwichDecorator {
    
    private double cheesePrice = 2.15;

    private String cheeseDescreption = " American Cheese";

    public Cheese (Sandwich sandwich){
        super(sandwich);
    }

    @Override
    public double getCost() {

        return super.getCost() + cheesePrice;
    }

    @Override
    public String getDescreption() {
        
        return super.getDescreption() + cheeseDescreption;
    }

    // setters and getters
    public double getCheesePrice() {
        return cheesePrice;
    }

    // setters and getters
    public void setCheesePrice(double cheesePrice) {
        this.cheesePrice = cheesePrice;
    }

    public String getCheeseDescreption() {
        return cheeseDescreption;
    }

    public void setCheeseDescreption(String cheeseDescreption) {
        this.cheeseDescreption = cheeseDescreption;
    }
}
