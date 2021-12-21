package su.monop;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HomeWork02PracticeForm {
    //arrange
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }
    //act
    @Test
    void fillPracticeFormTests() {
        open("https://demoqa.com/automation-practice-form");


    }


    //assert






}
