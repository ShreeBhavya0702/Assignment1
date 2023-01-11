import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Entertainment
{
    public static void main(String[] args)
    {
        OttMovies ot=new OttMovies("Amazon Prime","Harry Potter");
        OttWebSeries ow=new OttWebSeries("Netflix","Peaky Blinders");
        System.out.println("-------------");
        System.out.println("Movie Details");
        System.out.println("-------------");
        System.out.println("Name of Ott:"+ot.ottName);
        System.out.println("Movie Name:"+ot.movieName);
        System.out.println("-----------------");
        System.out.println("WebSeries Details");
        System.out.println("-----------------");
        System.out.println("Name of Ott:"+ow.ottName1);
        System.out.println("WebSeries Name:"+ow.webSeries);
        System.out.println("---------------------");
    }
}
