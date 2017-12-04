public interface NewsController {
    void setNextController(NewsController nc);
    void forwardNews(String news);
}
