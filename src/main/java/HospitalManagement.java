import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class HospitalManagement
{
    public static void main(String[] args) {
        PatientDetails pd=new PatientDetails("Bhavya",2001,63819839,"HeadAche");
        DoctorDetails dd=new DoctorDetails("Asha",432,4543547,"Ortho");
        System.out.println("---------------");
        System.out.println("Patient Details");
        System.out.println("---------------");
        System.out.println("Name of patient is :"+pd.patientName);
        System.out.println("Patient id is :"+pd.patientId);
        System.out.println("Patient phone number is :"+pd.phoneNumber);
        System.out.println("Patient issue :"+pd.issue);
        System.out.println("----------------");
        System.out.println("Doctor Details");
        System.out.println("----------------");
        System.out.println("Doctor name is :"+dd.doctorName);
        System.out.println("Doctor ID is :"+dd.doctorId);
        System.out.println("Doctor phone number is :"+dd.phoneNumber1);
        System.out.println("Department :"+dd.department);
        System.out.println("--------------------------");
    }
}
