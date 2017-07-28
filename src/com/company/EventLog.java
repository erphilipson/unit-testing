package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Ethan on 7/27/17.
 */
public class EventLog {

    private static List<Event> eventList;

    public boolean addEvent(Event event) {

        if (!Objects.equals(event.action, "Face2Face") && !Objects.equals(event.action, "PhoneCall") && !Objects.equals(event.action, "TextMessaging") && !Objects.equals(event.action, "Unknown")) {
            throw new IllegalArgumentException();
        } else {
            eventList.add(event);
            return true;
        }
    }

    public int getNumEvents () {
        return eventList.size();
    }

    public EventLog () {
        eventList = new ArrayList<>();
    }
}
