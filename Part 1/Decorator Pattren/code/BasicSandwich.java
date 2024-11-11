public class BasicSandwich implements Sandwich { // we implement the concrete component

    private double BasicCost = 10;
    private String descreption = "Bread";

    @Override
    public double getCost() {
        return BasicCost;
    }

    @Override
    public String getDescreption() {
        return descreption;
    }

    public double getBasicCost() {
        return BasicCost;
    }

    public void setBasicCost(double basicCost) {
        BasicCost = basicCost;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

}
