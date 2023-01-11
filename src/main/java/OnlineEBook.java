import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OnlineEBook
{
    public static void main(String[] args) {
        NewsPaper np=new NewsPaper("News Today","Pankaj");
        Magazine mz=new Magazine("Cosmopolitan","Women's Blog");
        System.out.println("-----------------");
        System.out.println("Newspaper Details");
        System.out.println("-----------------");
        System.out.println("Name of the Newspaper:"+np.paperName);
        System.out.println("Name od Editor:"+np.editor);
        System.out.println("----------------");
        System.out.println("Magazine Details");
        System.out.println("----------------");
        System.out.println("Name of Magazine:"+mz.magazineName);
        System.out.println("Category of Magazine:"+mz.category);
        System.out.println("----------------------------");
    }
}
