package lesson5;

public interface Mediator {
    Player getOwner();
    void changeOwner(Player player);
}
