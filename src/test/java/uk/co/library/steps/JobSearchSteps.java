package uk.co.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @When("I click on accept cookies")
    public void iClickOnAcceptCookies() throws InterruptedException {
        new HomePage().acceptIFrameAlert();
    }

    @And("I enter job title {string}")
    public void iEnterJobTitle(String enterJobTitle) {
        new HomePage().enterJobTitle(enterJobTitle);
    }

    @And("I enter location  {string}")
    public void iEnterLocation(String enterJobLocation) {
        new HomePage().enterTheLocation(enterJobLocation);
    }

    @And("I select the distance {string}")
    public void iSelectTheDistance(String distance) {
        new HomePage().selectTheDistance(distance);
    }

    @And("I click on more Search options link")
    public void iClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnTheSearchOptionLink();
    }

    @And("I enter minimum salary {string}")
    public void iEnterMinimumSalary(String salaryMinimum) {
        new HomePage().enterTheMinimumSalary(salaryMinimum);
    }

    @And("I enter maximum salary {string}")
    public void iEnterMaximumSalary(String salaryMaximum) {
        new HomePage().enterTheMaximumSalary(salaryMaximum);
    }

    @And("I select salary type {string}")
    public void iSelectSalaryType(String select) {
        new HomePage().salaryTypeSelect(select);
    }

    @And("I select job type {string}")
    public void iSelectJobType(String selectJobType) {
        new HomePage().jobTypeSelect(selectJobType);
    }

    @And("I click on find jobs button")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnTheFindBtn();
    }

    @Then("I should be able to verify the result {string}")
    public void iShouldBeAbleToVerifyTheResult(String result) {
        Assert.assertEquals(new ResultPage().verifyTheResults(),result,"Error in result");
    }
}
