public interface QueueBehaviour {
    void takeInQueue(Actor actor);
    void makeOrders();
    void takeOrders();
    void releaseFromQueue();
}
