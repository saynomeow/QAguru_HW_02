package su.monop;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomeWork02 {
    //arrange
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }
    //act
    @Test
    void fillPracticeFormTests() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Lex");
        $("#lastName").setValue("G");
        $("#userEmail").setValue("123@test.com");
        $("[for='gender-radio-3']").click();
        $("#userNumber").setValue("9991234567");

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("August");
        $(".react-datepicker__year-select").selectOption("1986");
        $(".react-datepicker__day--012").click();

        $("#subjectsInput").setValue("English").pressEnter();
        $("#subjectsInput").setValue("Computer Science").pressEnter();
        $("[for=hobbies-checkbox-1]").click();
        $("[for=hobbies-checkbox-3]").click();

        $("#uploadPicture").uploadFromClasspath("");

        $("#currentAddress").setValue("My current address");
        $("#react-select-3-input").setValue("Rajasthan").pressEnter();
        $("#react-select-4-input").setValue("Jaipur").pressEnter();

        $("#submit").click();



    }


    //assert






}
