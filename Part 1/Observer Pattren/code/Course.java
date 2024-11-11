import java.util.ArrayList;
import java.util.List;

public class Course implements Subject { // subject class "sends notification"
    private String courseName;
    private String courseAvalibality;
    private List<Observer> observerList; // list having all observers "studnets intersted in the course"

    public Course(String name) {
        this.courseName = name;
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer observer) {
        if (observer != null && !observerList.contains(observer)) {
            observerList.add(observer);
        }
    }

    @Override
    public void unRegister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllSubscribers() { // whene the avalibality of the course changes in the setCourseAvalibality
                                         // method, we call this function to loop thorugh observer list and notify them
        for (Observer observer : observerList) {
            observer.update(courseAvalibality);
        }
    }

    public void setCourseAvalibality(boolean avalbale) { // set avalibality from outsid of the class
        this.courseAvalibality = this.courseName + (avalbale ? " is Availeble" : " is Not Avalibale");
        notifyAllSubscribers();
    }

    // setters and getters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseAvalibality() {
        return courseAvalibality;
    }
}
