// Предметная область - футбол.
// Mediator - мяч. Observer - судья. По совместительству они синглтоны.
// Некоторые места можно доработать, но для понимания механизма достаточно.

package lesson5;

public class Main {
    public static void main(String[] args) {
        Mediator ball = Ball.getInstance();
        Listener judge = Judge.getInstance();

        Player[] players = new Player[2];
        players[0] = new Player("Кокорин", ball);
        players[1] = new Player("Мамаев", ball);

        for(Player p: players) {
            for (Violation v: Violation.values()) {
                p.violations.subscribe(v, judge);
            }
        }

// начинаем игру
        players[0].get();
        players[0].lose();
        players[1].get();
        players[1].passTo(players[0]);
        players[0].rulesViolation(Violation.DANGEROUS_GAME);
        players[1].rulesViolation(Violation.HAND);
    }
}
