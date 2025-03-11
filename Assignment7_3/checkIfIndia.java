package Assignment7_3;

import java.util.Objects;

public class checkIfIndia {
    public void checker(String str) throws NoMatchException {
        if (Objects.equals(str, "India")) {
            System.out.println("The word entered is equal to India");
        } else {
            throw new NoMatchException("The word entered is not equal to 'India'.");
        }
    }
}
