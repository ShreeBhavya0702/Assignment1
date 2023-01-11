import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OnlineMeeting {
    public static void main(String[] args) {
        MeetingLogin ml=new MeetingLogin("Bhavya@gmail.com","b123");
        ParticipantDetails pd=new ParticipantDetails("Bhavya","MCA");
        System.out.println("-------------");
        System.out.println("Login Details");
        System.out.println("-------------");
        System.out.println("EMail id:"+ml.emailId);
        System.out.println("Password:"+ml.loginPassword);
        System.out.println("-------------------");
        System.out.println("Participant Details");
        System.out.println("-------------------");
        System.out.println("Name of Participant:"+pd.name);
        System.out.println("Qualification:"+pd.qualification);
        System.out.println("-------------------------------");


    }
}
