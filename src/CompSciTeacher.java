import java.util.ArrayList;

public class CompSciTeacher extends Teacher implements Comparable {

    private ArrayList<String> programmingLanguages;
    private int numComputers;

    public CompSciTeacher(String name) {
        super(name, "Computer Science");
        this.programmingLanguages = new ArrayList<String>();
        this.numComputers = 0;
    }

    public void learnLanguage(String programmingLanguage) {
        this.programmingLanguages.add(programmingLanguage);
    }

    public ArrayList<String> getProgrammingLanguages() {
        return programmingLanguages;
    }

    // comp sci teachers get discounts in an alternate universe for teaching comp sci
    public boolean buySomething(double money) {
        money *= 0.7;
        if (getBudget() - money >= 0) {
            setBudget(getBudget() - money);
            return true;
        } else {
            return false;
        }
    }

    public void buyComputers(int numComputers) {
        int successes = 0;
        for (int i = 0; i < numComputers; i++) {
            if(buySomething(1000)) {
                successes++;
            }
        }
        this.numComputers += successes;
    }

    public int getNumComputers() {
        return numComputers;
    }

    public String languagesToString() {
        String languages = "";
        for (int i = 0; i < programmingLanguages.size() - 1; i++) {
            languages += programmingLanguages.get(i) + ", ";
        }
        languages += "and " + programmingLanguages.get(programmingLanguages.size() - 1);
        return languages;
    }

    public int compareTo(Object other) {
        CompSciTeacher otherT = (CompSciTeacher) other;
        return this.numComputers * this.programmingLanguages.size() - otherT.getNumComputers() * otherT.getProgrammingLanguages().size();
    }

    public String toString() {
        return getName() + ", a Comp Sci teacher, has " + numComputers + " computers, teaches " + languagesToString() + ", and their class has average grade " + getAverageGrade();
    }
}
