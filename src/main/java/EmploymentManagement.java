import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmploymentManagement
{
    public static void main(String[] args)
    {
        Qualification eq=new Qualification("Bhavya","MCA");
        Interview i=new Interview("Wipro","Developer");
        System.out.println("----------------");
        System.out.println("Employee Details");
        System.out.println("----------------");
        System.out.println("Name of Employee:"+eq.name);
        System.out.println("Qualification of Employee:"+eq.eduQualification);
        System.out.println("-----------------");
        System.out.println("Interview Details");
        System.out.println("-----------------");
        System.out.println("Name of Company:"+i.companyName);
        System.out.println("Designation:"+i.post);
        System.out.println("-------------------");
    }
}
