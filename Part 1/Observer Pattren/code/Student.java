public class Student implements Observer { // observer class "recives notification"
    private String studnetName;

    public Student(String name) {
        this.studnetName = name;
    }

    @Override
    public void update(String message) {
        System.out.println(this.studnetName + ", There is a new notification about the course: " + message);
    }

    // setters and getters
    public String getStudnetName() {
        return studnetName;
    }

    public void setStudnetName(String name) {
        studnetName = name;
    }
}
