public class SportsSubscriber implements Subscriber {
    String newsReceived=null;
    private String category="sports";
    @Override
    public void update(String news) {
        this.newsReceived=news;
    }
    public String getCategory() { return this.category; }
    public  String getnewsReceived(){return this.newsReceived;}
}
