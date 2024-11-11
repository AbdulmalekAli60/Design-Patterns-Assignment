// This class is for testing the logger from different classes
public class Order {
    
    public void HiFromOrderClass(){
        MyLogger logger = MyLogger.getInstance(); 
        logger.Info("This is a call form order class!!!", Order.class.getName()); // pass the name of class
    }
}
