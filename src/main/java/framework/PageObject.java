package framework;

/**
 * Created by MyHome on 28/01/2017.
 */
public class PageObject extends Object {
    public final void waitFor(long timeout, String text) throws InterruptedException {
        if (timeout < 0) {
            throw new IllegalArgumentException("timeout value is negative");
        }

        if (text==null) {
            throw new IllegalArgumentException(
                    "out value out of range");
        }
        wait(timeout);
    }
}
