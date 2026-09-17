package tests.examples;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {

    void cssXpath() {
        //<input placeholder="name@example.com" id="userEmail" class="mr-sm-2 form-control" type="email" data-testid="email">

        $("[data-testid=email]").setValue("1");
        $(by("data-testid", "email")).setValue("1");
        $x("//*[@data-testid=email]").setValue("1");

        //<input placeholder="name@example.com" id="email" class="mr-sm-2 form-control" type="email">
        $("[id=email]").setValue("1");
        $(by("id", "email")).setValue("1");
        $(byId("email")).setValue("1");
        $("#emai").setValue("1");
        $x("//*[@id=email]").setValue("1");

        //<input placeholder="name@example.com" class="mr-sm-2 form-control" type="email" name="email">
        $("[name=email]").setValue("1");
        $(by("name", "email")).setValue("1");
        $(byName("email")).setValue("1");
        $("input[name=email]").setValue("1");
        $x("//*[@name=email]").setValue("1");

        //<input type="email" class="inputtext login_form_input_box">
        $("[class=inputtext][class=login_form_input_box]").setValue("1");
        $(".login_form_input_box").setValue("1");
        $(".inputtext.login_form_input_box").setValue("1");
        $("input.inputtext.login_form_input_box").setValue("1");
        $x("//input[@class='inputtext'][@class='login_form_input_box']").setValue("1");

        //<div class="inputtext">
        //     <input type="email" class="login_form_input_box">
        //</div>
        $(".inputtext .login_form_input_box").setValue("1");
        $(".login_form_input_box").setValue("1");
        $(".inputtext").$(".login_form_input_box").setValue("1");
        $("div.inputtext input.login_form_input_box").setValue("1");

        //<div>Hello, qa.guru!</div>
        $x("//*[text()='Hello, qa.guru!']"); //bad practice
        $x("//*[contains(text(),'Hello, qa.guru!']");
        $(byText("Hello, qa.guru!"));
        $(withText("lo, qa!"));

    }
}
