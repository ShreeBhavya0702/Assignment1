import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OnlineCourse {
    public static void main(String[] args) {
        CourseDetails cd=new CourseDetails("Java",10000);
        StudentTrainee st=new StudentTrainee("Bhavya","MCA","Bengaluru");
        TrainerDetails td=new TrainerDetails("Suchitra","Java",25000);
        System.out.println("--------------");
        System.out.println("Course Details");
        System.out.println("--------------");
        System.out.println("Name of course"+cd.courseName);
        System.out.println("Fee:"+cd.feeDetails);
        System.out.println("---------------");
        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Name of Student:"+st.name);
        System.out.println("Qualification:"+st.qualification);
        System.out.println("Location:"+st.loc);
        System.out.println("---------------");
        System.out.println("Trainer Details");
        System.out.println("---------------");
        System.out.println("Name of Trainer:"+td.name);
        System.out.println("Subject:"+td.sub);
        System.out.println("Salary of Trainer:"+td.sal);
        System.out.println("-----------------------");

    }
}
