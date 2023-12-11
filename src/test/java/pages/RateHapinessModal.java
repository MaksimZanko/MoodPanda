package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class RateHapinessModal extends BaseModal{
    By sliderCss=By.cssSelector(".ui-slider-handle");
    By updateButtonCss=By.cssSelector(".buttonUpdate");
    //choose the button of rate your happiness
    By goToMydiaryCss = By.cssSelector(".ButtonMydiary");

    @Override
    public RateHapinessModal isModalOpened() {
        $(updateButtonCss).shouldBe(Condition.visible, Duration.ofMillis(20000));
        return this;
    }
    public RateHapinessModal updateMood(int moodRating){
        $(sliderCss).click();
        int currentMoodCount=5;
        int difference = moodRating-currentMoodCount;
        Keys arrowValue;
        if (difference>0){
            arrowValue=Keys.ARROW_RIGHT;
        }else {
            arrowValue=Keys.ARROW_LEFT;
        }
        for (int i=0; i<Math.abs(difference); i++){
            $(sliderCss).sendKeys(arrowValue);
        }
        $(updateButtonCss).click();
        return this;
    }
    public  MyDiaryPage  goTomyDiary(){
        $(goToMydiaryCss).click();
        MyDiaryPage myDiaryPage = new MyDiaryPage();
        myDiaryPage.isPageOpened();
        return myDiaryPage;
    }
}
