package me.skyblockapi.Utils;

import org.bukkit.event.Event;
import me.skyblockapi.Manager.EventManager;

import java.util.function.Consumer;


public class RegisterAPI {
        private EventManager eventManager;

        public RegisterAPI() {
            this.eventManager = new EventManager();
        }

        public void registerEvent(Class<? extends Event> eventClass, Consumer<? extends Event> eventHandler) {
            eventManager.registerEvent(eventClass, eventHandler);
        }

        public void triggerEvent(Event event) {
            eventManager.triggerEvent(event);
        }
}
