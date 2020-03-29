package lesson5;

public interface Action {
    void get();
    void lose();
    void passTo(Player player);
    void rulesViolation(Violation violation);
}
