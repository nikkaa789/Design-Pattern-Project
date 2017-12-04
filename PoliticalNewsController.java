import java.util.List;

public class PoliticalNewsController implements NewsController {
    private NewsController nc1;
    NewsPublisher np=NewsPublisher.getinstance();
    private List<Subscriber> s=null;
    @Override
    public void setNextController(NewsController nc) {
        this.nc1=nc;
    }

    @Override
    public void forwardNews(String news) {
        if(np.getNewsCategory()=="political") {
            s=np.getList();
            for(int i=0;i<s.size();i++) {
                if((s.get(i).getCategory()).toLowerCase()=="political") { s.get(i).update(news);
                }
            }
        }
        else { nc1.forwardNews(news);
        }
    }
}
