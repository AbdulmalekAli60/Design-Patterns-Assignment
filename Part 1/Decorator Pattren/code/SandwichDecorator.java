public abstract class SandwichDecorator implements Sandwich { // this is the decorator which will be like a layer bewteen the
                                                     // concrete class "BasicSandwich" and other classes, the
                                                     // midifications on the concrete class
    private Sandwich sandwich;

    public SandwichDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public double getCost() {
        return this.sandwich.getCost();
    }

    @Override
    public String getDescreption() {
        return this.sandwich.getDescreption();
    }
}
