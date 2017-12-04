public class PoliticalSubscriber implements Subscriber {
    NewsPublisher ns;
    private String newsReceived=null;
    public  String category="political";

    @Override
    public void update(String news) {
        this.newsReceived=news;
    }

    public String getCategory() {
        return this.category; }
    public  String getnewsReceived(){return this.newsReceived;}
}
