package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class ArticlePage {

    private final SelenideElement wikiErrorTextLocator = $(id("org.wikipedia.alpha:id/view_wiki_error_text")),
            wikiErrorBtnLocator = $(id("org.wikipedia.alpha:id/view_wiki_error_button"));

    public void verifyErrorAfterOpeningArticle(String error) {
        wikiErrorTextLocator.shouldHave(text(error));
        wikiErrorBtnLocator.click();
    }

}