package me.skyblockapi.Manager;



import org.bukkit.event.Event;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class EventManager {
    private Map<Class<? extends Event>, Consumer<? extends Event>> eventHandlers;

    public EventManager() {
        this.eventHandlers = new HashMap<>();
    }

    public <T extends Event> void registerEvent(Class<? extends Event> eventClass, Consumer<? extends Event> eventHandler) {
        eventHandlers.put(eventClass, eventHandler);
    }

    public <T extends Event> void triggerEvent(T event) {
        @SuppressWarnings("unchecked")
        Consumer<T> handler = (Consumer<T>) eventHandlers.get(event.getClass());
        if (handler != null) {
            handler.accept(event);
        }
    }

}

