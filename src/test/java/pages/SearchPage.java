package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.*;

public class SearchPage {
    private final SelenideElement searchInputLocator = $(id("org.wikipedia.alpha:id/search_src_text")),
            firstArticleDescriptionLocator = $(id("org.wikipedia.alpha:id/page_list_item_description"));

    private final ElementsCollection searchResultsLocator = $$(id("org.wikipedia.alpha:id/page_list_item_title"));

    public void enterSearchText(String searchText) {
        searchInputLocator.sendKeys(searchText);
    }

    public ElementsCollection getSearchResultsCount() {
        return searchResultsLocator;
    }

    public void checkSearchResultSubtitleIs(String subtitle) {
        firstArticleDescriptionLocator.shouldHave(text(subtitle));
    }

    public void clickFirstArticle() {
        firstArticleDescriptionLocator.click();
    }

}
