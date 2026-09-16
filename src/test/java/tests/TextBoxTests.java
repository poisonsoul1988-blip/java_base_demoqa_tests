package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.browser ="chrome";
        Configuration.baseUrl = "https://demoqa.com/text-box";
        Configuration.timeout = 10000;
    }

    @Test
    void successfulFillFormTest() {

        open("https://demoqa.com/text-box");
        $("[id=userName]").setValue("Black Jack");
        $("[id=userEmail]").setValue("black@jack.com");
        $("[id=currentAddress]").setValue("first address 1");
        $("[id=permanentAddress]").setValue("second address 2");
        $("[id=submit]").click();

        $("[id=output] [id=name]").shouldHave(text("Black Jack"));
        $("[id=output] [id=email]").shouldHave(text("black@jack.com"));
        $("[id=output] [id=currentAddress]").shouldHave(text("first address 1"));
        $("[id=output] [id=permanentAddress]").shouldHave(text("second address 2"));
    }
}
