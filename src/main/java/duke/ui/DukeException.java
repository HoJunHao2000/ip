package duke.ui;

/**
 * An Exception class for Duke related problems.
 */
public class DukeException extends Exception {

    /**
     * Constructor for DukeException.
     * @param message The message to be shown when DukeException is caught.
     */
    public DukeException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "☹ OOPS!!! " + super.getMessage();
    }
}