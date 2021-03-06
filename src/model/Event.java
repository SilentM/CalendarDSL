package model;

import java.util.Calendar;

public interface Event extends Comparable<Event> {
    public Calendar getStart();
    public Calendar getEnd();
    public int getDayOfWeek();
    boolean hasConflict(Calendar start, Calendar end);
    void addToScheduler(Scheduler scheduler);
    String getName();
    String getDescription();
    String getLocation();
}
