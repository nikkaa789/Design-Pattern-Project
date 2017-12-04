
import java.util.ArrayList;
import java.util.List;

public class NewsPublisher{
    private static List<Subscriber> storePublishers=new ArrayList<Subscriber>();
    private String news=null;
    private String newsCategory=null;
     static NewsPublisher object;
    private NewsPublisher()
    {}

    public static  NewsPublisher getinstance() {
        if (object==null)
        {
             object=new NewsPublisher();
            return object;
        }
        return object;
    }


    public void addSubscriber(Subscriber s) {
        storePublishers.add(s);
    }
    public void removeSubscriber() {
        this.removeSubscriber();
    }
    public void notifyNewsController(){
        NewsController pnc=new PoliticalNewsController();
        NewsController snc=new SportsNewsController();
        NewsController enc= new EntertainmentNewsController();
        pnc.setNextController(snc);
        snc.setNextController(enc);
        pnc.forwardNews(this.news);
    }
    public void setNews(String news) {
        this.news=news;
    }
    public String getNews() { return this.news; }
    public void setNewsCategory(String newsCategory){this.newsCategory=newsCategory; }
    public String getNewsCategory(){return this.newsCategory; }
    public List<Subscriber> getList()
    {
        return this.storePublishers;
    }
}
