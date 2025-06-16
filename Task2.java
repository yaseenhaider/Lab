
abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean isOutstanding();
}


class Student extends Person {
    private double CGPA;

    public Student(String name, double CGPA) {
        super(name);
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    @Override
    public boolean isOutstanding() {
        return CGPA > 3.5;
    }
}


class Professor extends Person {
    private int numberOfPublications;

    public Professor(String name, int numberOfPublications) {
        super(name);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }

    @Override
    public boolean isOutstanding() {
        return numberOfPublications > 50;
    }
}


public class Task2 {
    public static void main(String[] args) {
        // Create an array of Person
        Person[] people = new Person[3];
        people[0] = new Student("Yaseen", 3.6);
        people[1] = new Student("Aysha", 3.4);
        people[2] = new Professor("Dr. ali", 100);


        for (Person person : people) {
            if (person instanceof Student) {

                System.out.printf("%s is a student with CGPA %.2f: Outstanding? %b%n",
                        person.getName(), ((Student) person).getCGPA(), person.isOutstanding());
            }

            else if (person instanceof Professor) {

                System.out.printf("%s is a professor with %d publications: Outstanding? %b%n",
                        person.getName(), ((Professor) person).getNumberOfPublications(), person.isOutstanding());
            }
        }
    }
}