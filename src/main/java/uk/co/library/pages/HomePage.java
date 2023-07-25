package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(id = "gdpr-consent-notice")
    WebElement getInToIFrame;
    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptAllBtn;

    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitle;

    @CacheLookup
    @FindBy(id = "location")
    WebElement location;

    @CacheLookup
    @FindBy(id = "distance")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement searchOptionLink;

    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryTypeDrop;

    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobTypeDrop;

    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;
    @CacheLookup
    @FindBy(xpath = "//span[@class='mat-button-wrapper']//span[text()='Accept All']")
    WebElement acceptCookies;

    public void enterJobTitle(String enterJobTitle) {
        sendTextToElement(jobTitle, enterJobTitle);
        log.info("Enter job Title" + enterJobTitle + jobTitle.toString());
    }

    public void enterTheLocation(String enterJobLocation) {
        sendTextToElement(location, enterJobLocation);
        log.info("Entering location: " + enterJobLocation + location.toString());

    }

    public void selectTheDistance(String distance) {
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
        log.info("Entering distance: " + distance + distanceDropDown.toString());

    }

    public void clickOnTheSearchOptionLink() {
        clickOnElement(searchOptionLink);

        log.info("Clicking on searchOptionLink "+searchOptionLink.toString());}

    public void enterTheMinimumSalary(String salaryMinimum) {
        sendTextToElement(salaryMin, salaryMinimum);
        log.info("Entering enterTheMinimumSalary: " + salaryMinimum + salaryMin.toString());

    }

    public void enterTheMaximumSalary(String salaryMaximum) {
        sendTextToElement(salaryMax, salaryMaximum);
        log.info("Entering salaryMax: " + salaryMaximum + salaryMax.toString());
    }

    public void salaryTypeSelect(String select) {
        selectByVisibleTextFromDropDown(salaryTypeDrop, select);
        log.info("Selecting salaryTypeDrop: " + select + salaryTypeDrop.toString());
    }

    public void jobTypeSelect(String selectJobType) {
        selectByVisibleTextFromDropDown(jobTypeDrop, selectJobType);
        log.info("Selecting jobTypeDrop: " + selectJobType + jobTypeDrop.toString());
    }

    public void clickOnTheFindBtn() {
        clickOnElement(findJobsBtn);
        log.info("Clicking findJobsBtn: " + findJobsBtn.toString());
    }


    public void acceptIFrameAlert() throws InterruptedException {
        Thread.sleep(2000);
        driver.switchTo().frame(getInToIFrame);
        clickOnElement(acceptAllBtn);
        driver.switchTo().defaultContent();
        log.info("Accepting cookies: " + acceptAllBtn.toString());
    }
}
