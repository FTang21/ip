package boba.task;

/**
 * Represent a task with a set time to meet.
 * Inherits from the Task class.
 */
public class Event extends Task {

    /** The time the event is occurring*/
    protected String at;

    /**
     * Creates a new event item
     * @param description A description of the task
     * @param at When the event is occurring
     */
    public Event(String description, String at) {
        super(description);
        this.at = at;
    }

    /**
     * Get the at time of the Event
     * @return String at
     */
    public String getAt() {
        return at;
    }

    /**
     * @return String representation of Event Class
     */
    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + at + ")";
    }
}
