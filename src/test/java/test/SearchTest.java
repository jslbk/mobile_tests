package test;

import pages.MainPage;
import pages.SearchPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static io.qameta.allure.Allure.step;

@DisplayName("Mobile search tests")
public class SearchTest extends TestBase {
    private final SearchPage searchPage = new SearchPage();
    private final MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Search results are displayed")
    void successfulSearchTest() {
        step("Search for the specific word", () -> {
            mainPage.clickSearchButton();
            searchPage.enterSearchText("Browserstack");
        });
        step("Verify search result in not empty", () ->
                searchPage.getSearchResultsCount().shouldHave(sizeGreaterThan(0)));
    }

    @Test
    @DisplayName("Error text is visible after article is opened")
    void openPageTest() {
        step("Search for the specific word", () -> {
            mainPage.clickSearchButton();
            searchPage.enterSearchText("Browserstack");
        });
        step("Verify search result in not empty", () ->
                searchPage.getSearchResultsCount().shouldHave(sizeGreaterThan(0)));
        step("Open first article from the result list", mainPage::clickFirstArticle
        );
        step("Verify error text is displayed", () ->
                mainPage.verifyErrorAfterOpeningArticle("Error")
        );
    }
}
