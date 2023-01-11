import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OnlineShopping
{
    public static void main(String[] args) {
        CustDetails cd=new CustDetails("Bhavya",954315563,"Mobile Phone");
        ItemDetails id=new ItemDetails("Samsung Mobile",35000,"Black","OnlinePayment");
        System.out.println("----------------");
        System.out.println("Customer Details");
        System.out.println("----------------");
        System.out.println("Name of customer:"+cd.name);
        System.out.println("Phone number:"+cd.phoneNum);
        System.out.println("Name of item:"+cd.itemName1);
        System.out.println("------------");
        System.out.println("Item Details");
        System.out.println("------------");
        System.out.println("Name of item"+id.itemName);
        System.out.println("Price:"+id.price);
        System.out.println("Color of product:"+id.color);
        System.out.println("----------------------");
    }
}
