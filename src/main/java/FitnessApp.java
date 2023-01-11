import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FitnessApp
{
    public static void main(String[] args) {
        FitnessTrainee ft=new FitnessTrainee("Asha",25,56.68F);
        FitnessTrainer ftr=new FitnessTrainer("Sam",15,25000);
        System.out.println("---------------");
        System.out.println("Trainee Details");
        System.out.println("---------------");
        System.out.println("Name of Trainee"+ft.name);
        System.out.println("Age:"+ft.age);
        System.out.println("Weight:"+ft.weight);
        System.out.println("---------------");
        System.out.println("Trainer Details");
        System.out.println("---------------");
        System.out.println("Name of Trainer:"+ftr.name);
        System.out.println("Number of Trainees handled:"+ftr.trainees);
        System.out.println("Salary:"+ftr.sal);
        System.out.println("---------------");
    }
}
