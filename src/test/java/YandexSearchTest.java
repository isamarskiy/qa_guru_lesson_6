import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YandexSearchTest {

    @Test
    void searchYandex() {
        String search_word = "selenide";

        open("https://ya.ru");
        $("#text").setValue(search_word).pressEnter();
        $("#search-result").shouldHave(text(search_word));
    }
}