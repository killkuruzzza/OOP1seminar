public class Main {
    public static void main(String[] args) {
        market Market = new market();
        Human human1 = new Human("Александр");
        Human human2 = new Human("Кирилл");
        Market.acceptToMarket(human1);
        Market.acceptToMarket(human2);
        Market.update();

    }
}