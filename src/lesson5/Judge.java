package lesson5;

public class Judge implements Listener {
    private static Judge instance;

    public static Judge getInstance() {
        if (instance == null) {
            instance = new Judge();
        }
        return instance;
    }

    @Override
    public void onAction(Violation action, Player player) {
        switch (action) {
            case HAND:
                System.out.println("Судья: " + player.getName() + " - игра руками");
                break;
            case DANGEROUS_GAME:
                System.out.println("Судья: " + player.getName() + " - опасная игра");
                break;
            default:
                System.out.println("Судья: " + player.getName() + " - нарушение");
        }
    }
}
