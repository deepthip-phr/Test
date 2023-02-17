package steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hook {
    @BeforeAll
    public void startSession(){
        System.out.println("Initialize Reports");
    }
    @AfterAll
    public void Session(){
        System.out.println("Initialize Reports");
    }
}
