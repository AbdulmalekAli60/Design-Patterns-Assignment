public class Main {
    public static void main(String[] args) {
        Sandwich finalSandwitch1 = new Cheese(new Beef(new BasicSandwich())); // first object is independent form the
                                                                              // second object

        System.out.println("Descreption: " + finalSandwitch1.getDescreption());
        System.out.println("Cost: " + finalSandwitch1.getCost());

        System.out.println("======================================"); // also we can write it like this
        Sandwich finalSandwitch2 = new BasicSandwich();
        finalSandwitch2 = new Cheese(finalSandwitch2);

        System.out.println("Descreption: " + finalSandwitch2.getDescreption());
        System.out.println("Cost: " + finalSandwitch2.getCost());
    }
}