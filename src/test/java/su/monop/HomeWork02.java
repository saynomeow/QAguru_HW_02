package su.monop;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class HomeWork02 {

   //arrange
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    Configuration.baseUrl = "https://demoqa.com";
    }

   //act
    @Test
    void testFillThePracticeForm() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        $("#firstName").setValue("Lex");
        $("#lastName").setValue("G");
        $("#userEmail").setValue("123@test.com");
        $("[for='gender-radio-3']").click();
        $("#userNumber").setValue("9991118877");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("October");
        $(".react-datepicker__year-select").selectOption("1993");
        $(".react-datepicker__day--010:not(.react-datepicker__day--outside-month)").click();
        $("#subjectsInput").setValue("Chemistry").pressEnter();
        $("#subjectsInput").setValue("Social Studies").pressEnter();
        $("[for=hobbies-checkbox-2]").click();
        $("[for=hobbies-checkbox-3]").click();
        $("#uploadPicture").uploadFromClasspath("new.txt");
        $("#currentAddress").setValue("My current address 123");
        $("#react-select-3-input").setValue("Rajasthan").pressEnter();
        $("#react-select-4-input").setValue("Jaipur").pressEnter();
        $("#submit").click();

       //assert
        $("#example-modal-sizes-title-lg").shouldBe(visible);
        $(".modal-title").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Lex G"), text("123@test.com"),
          text("Other"), text("9991118877"), text("10 October,1993"), text("Chemistry, Social Studies"),
          text("Reading, Music"), text("new.txt"), text("My current address 123"), text("Rajasthan Jaipur"));
    }
}