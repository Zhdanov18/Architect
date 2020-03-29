package lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ViolationManager {
    Map<Violation, List<Listener>> listeners = new HashMap<>();

    public ViolationManager(Violation... violetions) {
        for (Violation violation : violetions) {
            this.listeners.put(violation, new ArrayList<>());
        }
    }

    public void subscribe(Violation violation, Listener listener) {
        List<Listener> users = listeners.get(violation);
        users.add(listener);
    }

    public void unsubscribe(Violation violation, Listener listener) {
        List<Listener> users = listeners.get(violation);
        users.remove(listener);
    }

    public void notify(Violation violation, Player player) {
        List<Listener> users = listeners.get(violation);
        for (Listener listener : users) {
            listener.onAction(violation, player);
        }
    }
}
