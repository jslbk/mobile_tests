package test;

import pages.ArticlePage;
import pages.MainPage;
import pages.SearchPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static io.qameta.allure.Allure.step;

@DisplayName("Mobile search tests")
public class SearchTest extends TestBase {

    private static final String SEARCH_TEXT = "Browserstack",
            SEARCH_SUBTITLE = "Software company based in India";
    private final SearchPage searchPage = new SearchPage();
    private final MainPage mainPage = new MainPage();
    private final ArticlePage articlePage = new ArticlePage();

    @Test
    @DisplayName("Search results are displayed")
    void successfulSearchTest() {
        step("Search for the specific word", () -> {
            mainPage.clickSearchButton();
            searchPage.enterSearchText(SEARCH_TEXT);
        });
        step("Verify search result is not empty", () ->
                searchPage.getSearchResultsCount().shouldHave(sizeGreaterThan(0)));
    }

    @Test
    @DisplayName("Error text is visible after article is opened")
    void checkErrorTest() {
        step("Search for the specific word", () -> {
            mainPage.clickSearchButton();
            searchPage.enterSearchText(SEARCH_TEXT);
        });
        step("Verify search result is not empty", () ->
                searchPage.getSearchResultsCount().shouldHave(sizeGreaterThan(0)));
        step("Open first article from the result list", searchPage::clickFirstArticle);
        step("Verify error text is displayed", () ->
                articlePage.verifyErrorAfterOpeningArticle("Error"));
    }

    @Test
    @DisplayName("Check article subtitle is displayed")
    void checkSearchedArticleSubtitleTest() {
        step("Search for the specific word", () -> {
            mainPage.clickSearchButton();
            searchPage.enterSearchText(SEARCH_TEXT);
        });
        step("Check search result contains exact title", () ->
                searchPage.checkSearchResultSubtitleIs(SEARCH_SUBTITLE));
    }
}
