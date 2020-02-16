package fitnessapp.sjones;

public class AccountOwner {

    String firstName;
    String lastName;
    double weight;
    double height;
    int age;
    char gender;
    TrainingLevel userTLevel;
    public final static int calorieGoal = 2000; // this needs to be written like not a moron, for demo only like this

  enum TrainingLevel {
      NOVICE,
      INTERMEDIATE,
      ADVANCED

    }

    public AccountOwner(String firstName,String lastName,double weight, double height, int age){
      this(firstName,lastName,weight,height,age,0);
    }

    public AccountOwner(String firstName, String lastName, double weight, double height, int age, int trainingLevel){
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.gender = 'X'; // not yet implemented
        this.firstName = firstName;
        this.lastName = lastName;
        switch(trainingLevel){
            case 0:
                this.userTLevel = TrainingLevel.NOVICE;
                break;
            case 1:
                this.userTLevel = TrainingLevel.INTERMEDIATE;
                break;
            case 2:
                this.userTLevel = TrainingLevel.ADVANCED;
            default:
                this.userTLevel = TrainingLevel.NOVICE;
                break;
        }
    }

    public String getFirstName() {
        return firstName;
    }
}
