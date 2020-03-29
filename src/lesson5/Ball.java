package lesson5;

public final class Ball implements Mediator {
    private static Ball instance;
    private Player owner;

    private Ball() {
        this.owner = null;
    }

    public static Ball getInstance() {
        if (instance == null) {
            instance = new Ball();
        }
        return instance;
    }

    @Override
    public Player getOwner() {
        return getInstance().owner;
    }

    @Override
    public void changeOwner(Player player) {
        if (player == null && getOwner() != null) {
            System.out.println(getOwner().getName() + " потерял мяч");
        }
        if (player != null && getOwner() != null) {
            System.out.println(player.getName() + " пас от " + getOwner().getName());
        }
        if (player != null && getOwner() == null) {
            System.out.println(player.getName() + " владеет мячом");
        }
        instance.owner = player;
    }
}
