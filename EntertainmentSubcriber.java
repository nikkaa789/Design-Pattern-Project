public class EntertainmentSubcriber implements Subscriber {
    NewsPublisher ns;
    String newsReceived=null;
    public String category="entertainment";

    @Override
    public void update(String news) {
            this.newsReceived=news;
    }

    public String getCategory() { return this.category; }
    public  String getnewsReceived(){return this.newsReceived;}

}
