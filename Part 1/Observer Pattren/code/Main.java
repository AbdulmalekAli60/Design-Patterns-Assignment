public class Main {
    public static void main(String[] args) {
        // Observers
        Student Abdulmalek = new Student("Abdulmalek");
        Student Eyad = new Student("Eyad");
        Student Feras = new Student("Feras");
        Student Ali = new Student("Ali");
        // Observers

        // Subjects
        Course SoftwareDesignandArchetecture = new Course("Software Design and Archetecture");
        Course ComputerEthics = new Course("Computer Ethics");
        Course DiscreteMath = new Course("Discrete Math");
        // Subjects

        SoftwareDesignandArchetecture.register(Abdulmalek);
        SoftwareDesignandArchetecture.register(Eyad);
        SoftwareDesignandArchetecture.register(Feras);
        SoftwareDesignandArchetecture.register(Ali);

        ComputerEthics.register(Abdulmalek);

        DiscreteMath.register(Abdulmalek);

        // Change Avalibality of courses
        SoftwareDesignandArchetecture.setCourseAvalibality(true);
        ComputerEthics.setCourseAvalibality(false);
        DiscreteMath.setCourseAvalibality(false);
        // Change Avalibality of courses

        // observer "Ali" deleted the course
        SoftwareDesignandArchetecture.unRegister(Ali);
        System.out.println("==============================");
        SoftwareDesignandArchetecture.setCourseAvalibality(true);

    }
}
