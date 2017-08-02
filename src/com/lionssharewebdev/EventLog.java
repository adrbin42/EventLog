package com.lionssharewebdev;

import java.util.List;
import java.util.Scanner;

public class EventLog {
    private List<Event> eventList;

    public boolean addEvent(Event event){
        try{
            System.out.print("Please enter the name of your event: ");
            Scanner scanner = new Scanner(System.in);
            String eventName = "";
            event.setName(scanner.next(eventName));

            System.out.print("Please enter a description of what you will do at event: ");
            Scanner scanner2 = new Scanner(System.in);
            String eventAction = "";
            event.setAction(scanner.next(eventAction));

            System.out.println("Information entered is as follows: " + eventName + " "+ eventAction);
            eventList.add(event);
            for (Event eventadded : eventList) {
                System.out.println("Print event list "+ eventList);
            }

        }catch (IllegalArgumentException e){
            System.out.print("Must add an event name and action!");
        }
        return true;
    }

    public int getNumEvents(){
        return eventList.size();
    }

    public EventLog(List <Event> eventList){
        this.eventList = eventList;
    }
}
