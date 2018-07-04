package infy.assignment.exception;


/**
 * Customized Exception class
 *
 */
public class InvalidFormatException extends Exception {

	public InvalidFormatException(String msg) {
		super(msg + " (Dot and Spaces are not allow)");
	}
}
