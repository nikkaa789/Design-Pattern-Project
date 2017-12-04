import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        String category;
        String news;
        Scanner sc=new Scanner(System.in);
        Scanner input=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println(a);
        NewsPublisher np=NewsPublisher.getinstance();
        PoliticalSubscriber ps=new PoliticalSubscriber();
        EntertainmentSubcriber es=new EntertainmentSubcriber();
        SportsSubscriber ss=new SportsSubscriber();
        np.addSubscriber(ps);
        np.addSubscriber(es);
        np.addSubscriber(ss);
        System.out.println("Welcome to KIET news agency \nPress 1 if you are news reported.");
        int choice=sc.nextInt();
        switch (choice){
            case 1: {
                System.out.println("Please share the news with us.");
                news=input.nextLine();
                System.out.println("Please specify the category of news \nPress 1 for Entertainment \nPress 2 for Sports \nPress 3 for Political");
                category=sc.next();
                if (category.equals("1")) {
                    np.setNewsCategory("entertainment");
                    np.setNews(news);
                    np.notifyNewsController();
                } else if (category.equals("2")) {
                    np.setNewsCategory("sports");
                    np.setNews(news);
                    np.notifyNewsController();
                } else if (category.equals("3")) {
                    np.setNewsCategory("political");
                    np.setNews(news);
                    np.notifyNewsController();
                }
                break;
            }
        }

        System.out.println(ps.getnewsReceived());
        System.out.println(es.getnewsReceived());
        System.out.println(ss.getnewsReceived());
    }
}
