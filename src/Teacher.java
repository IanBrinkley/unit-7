import java.util.ArrayList;

public class Teacher {

    private double budget;
    private int numStudents;
    private int prepPeriod;
    private String subject;
    private String name;
    private ArrayList<Double> grades;

    public Teacher(String name, String subject) {
        budget = 0;
        numStudents = 150;
        prepPeriod = 0;
        grades = new ArrayList<Double>();
        for (int i = 0; i < numStudents; i++) {
            grades.add(0.0);
        }
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public boolean buySomething(double money) {
        if (budget - money >= 0) {
            budget -= money;
            return true;
        } else {
            return false;
        }
    }

    public int getStudents() {
        return numStudents;
    }

    public void setStudents(int numStudents) {
        if (numStudents < grades.size()) {
            for(int i = grades.size() - 1; i >= numStudents; i--) {
                grades.remove(i);
            }
        } else {
            for(int i = 0; i < numStudents - this.numStudents; i++) {
                grades.add(0.0);
            }
        }
        this.numStudents = numStudents;
    }

    public int getPrepPeriod() {
        return prepPeriod;
    }

    public void setPrepPeriod(int prepPeriod) {
        this.prepPeriod = prepPeriod;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public void changeGrade(double grade, int index) {
        grades.set(index, grade);
    }

    public void teach(double minutes) {
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) + minutes / 120 <= 100) {
                grades.set(i, grades.get(i) + minutes / 120);
            }
            else {
                grades.set(i, 100.0);
            }
        }
    }

    public double getAverageGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum/numStudents;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String toString() {
        return name + " teaches " + subject + " and their class has an average grade of " + getAverageGrade();
    }
}
