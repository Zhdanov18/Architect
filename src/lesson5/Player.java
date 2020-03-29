package lesson5;

public class Player implements Action {
    private String name;
    private Mediator ball;
    public ViolationManager violations;

    public Player(String name, Mediator ball) {
        this.name = name;
        this.ball = ball;
        this.violations = new ViolationManager(Violation.HAND, Violation.DANGEROUS_GAME);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void get() {
        if (ball.getOwner() != this && ball.getOwner() == null) {
            ball.changeOwner(this);
        }
    }

    @Override
    public void lose() {
        if (ball.getOwner() == this) {
            ball.changeOwner(null);
        }
    }

    @Override
    public void passTo(Player player) {
        if (ball.getOwner() == this) {
            ball.changeOwner(player);
        }
    }

    @Override
    public void rulesViolation(Violation violation) {
        violations.notify(violation, this);
    }
}
