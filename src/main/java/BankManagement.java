import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class BankManagement
{
    public static void main(String[] args) {
        CustomerDetails cd=new CustomerDetails("Bhavya",75679768);
        BankDetails bd=new BankDetails("Indian Bank","Indiranagar");
        System.out.println("----------------");
        System.out.println("Customer Details");
        System.out.println("----------------");
        System.out.println("Name of customer is:"+cd.customerName);
        System.out.println("Account number is:"+cd.accountNumber);
        System.out.println("------------");
        System.out.println("Bank Details");
        System.out.println("------------");
        System.out.println("Name of Bank:"+bd.bankName);
        System.out.println("Branch name:"+bd.branch);
        System.out.println("----------------------");
    }
}
