import java.util.ArrayList;
import java.util.List;

public class EntertainmentNewsController implements NewsController {
    NewsPublisher np=NewsPublisher.getinstance();
    private List<Subscriber> s=new ArrayList<Subscriber>();
    private NewsController nc1;
    @Override
    public void setNextController(NewsController nc) {
    this.nc1=nc;
    }

    @Override
    public void forwardNews(String news) {
        if(np.getNewsCategory()=="entertainment")
        {
            s=np.getList();
            for(int i=0;i<s.size();i++)
            {
                if(s.get(i).getCategory().toLowerCase()=="entertainment") { s.get(i).update(news); }
            }
        }else {
            System.out.println("in entertainment else, with news = " + news);
        }
    }
}
