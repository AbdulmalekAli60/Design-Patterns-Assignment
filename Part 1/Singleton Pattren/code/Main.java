public class Main {

    public static void main(String[] args) {
      
        String className = Main.class.getName();

        MyLogger logger1 = MyLogger.getInstance();//Pass name of class
        logger1.Info("Please check deatils (logger1)", className);
        logger1.Warning("Connection failed (logger1)", className);

        MyLogger logger2 = MyLogger.getInstance();//Pass name of class
        logger2.Info("Error count 3 (logger2)", className);
        logger2.Warning("Connection failed (logger2)", className);

        Order order = new Order();
        order.HiFromOrderClass();

        // Logger 1, 2 and in  order class will print the same messgaes because they point to one instance
    }
}