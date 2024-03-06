package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class MainPage {
    private final SelenideElement searchButtonLocator = $(accessibilityId("Search Wikipedia"));

    public void clickSearchButton() {
        $(searchButtonLocator).click();
    }

}