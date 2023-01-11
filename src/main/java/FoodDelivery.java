import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FoodDelivery
{
    public static void main(String[] args) {
        RestaurantDetails rd=new RestaurantDetails("IDC","Domlur");
        CustomerFoodDetails cf=new CustomerFoodDetails("Bhavya","Halasuru",946612565);
        System.out.println("------------------");
        System.out.println("Restaurant Details");
        System.out.println("------------------");
        System.out.println("Name of restaurant:"+rd.restName);
        System.out.println("Location:"+rd.location);
        System.out.println("----------------");
        System.out.println("Customer Details");
        System.out.println("----------------");
        System.out.println("Name of Customer:"+cf.custName);
        System.out.println("Location of customer:"+cf.loc);
        System.out.println("Phone number:"+cf.phoneNumber);
        System.out.println("---------------------");
    }
}
