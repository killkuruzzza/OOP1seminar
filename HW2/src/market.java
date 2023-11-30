import java.util.ArrayList;
import java.util.List;

public class market implements MarketBehaviour, QueueBehaviour{
    List<Actor> queue = new ArrayList<>();
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName()+ "Зашел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors){
            queue.remove(actor);
            System.out.println(actor.getName() + "Человек вышел из магазина");

        }
    }

    @Override
    public void update() {
        takeOrders();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + "Встал в очередь");
        queue.add(actor);
    }

    @Override
    public void makeOrders() {
        for (Actor actor:queue){
            if (!actor.isMakeOrder) {
                   actor.setMakeOrder(true);
                    System.out.println(actor.getName() + "Сделал заказ");
                }
        }
    }

    @Override
    public void takeOrders() {
        for (Actor actor:queue){
            if (!actor.isMakeOrder) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + "получил заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor:queue){
            if (!actor.isTakeOrder) {
                releasedActors.add(actor);
                System.out.println(actor.getName() + "вышел из очереди");
            }

        }
         releaseFromMarket(releasedActors);
    }
}
