package ljv65.model;

public class Perfomance
{
    public String title;
    public int price;
    public String artisticDirector;
    public double duration;
    public String city;
    public String shortDescription;
    //Дата создания

    public Perfomance(String title, int price, String artisticDirector,
                      double duration, String city, String shortDescription)
    {
        this.title = title;
        this.price = price;
        this.artisticDirector = artisticDirector;
        this.duration = duration;
        this.city = city;
        this.shortDescription = shortDescription;

    }
}

