package com.lionssharewebdev;

import java.util.List;
import java.util.Scanner;

public class EventLog {
    private List<Event> eventList;

    public boolean addEvent(Event event)throws IllegalArgumentException {

            System.out.print("Please enter the name of your event: ");
            Scanner scanner = new Scanner(System.in);
            String eventName = "";
            event.setName(scanner.next(eventName));
            if(event.getName() == null ) {
                throw new IllegalArgumentException("Please enter a name for your event!"); }

            System.out.print("Please enter one of the following event actions: Face2Face,PhoneCall,TextMessaging or Unknown");
            Scanner scanner2 = new Scanner(System.in);
            String eventAction = "";
            event.setAction(scanner.next(eventAction));
        if( event.getAction().equals("Face2Face") ||
                event.getAction().equals("PhoneCall") ||
                event.getAction().equals("TextMessaging") ||
                event.getAction().equals("Unknown")
                ) {
            eventList.add(event);
            System.out.println("Information entered is as follows: " + event);
            return true;
        }else {
            throw new IllegalArgumentException("Enter a proper event value: Face2Face,PhoneCall,TextMessaging or Unknown!");
        }



    }

    public int getNumEvents(){
        return eventList.size();
    }

    public EventLog(List <Event> eventList){
        this.eventList = eventList;
    }
}
