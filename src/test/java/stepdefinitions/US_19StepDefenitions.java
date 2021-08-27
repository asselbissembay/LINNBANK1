package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.rules.Timeout;
import pages.US_19Page;
import utilities.ConfigurationReader;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.ReusableMethods;


public class US_19StepDefenitions {
    US_19Page us_19Page= new US_19Page();
    SoftAssert softAssert = new SoftAssert();


        @When("dogru username girer")
        public void dogru_username_girer() {
            us_19Page.username.sendKeys(ConfigurationReader.getProperty("adminn_username"));
        }

        @When("dogru password girer")
        public void dogru_password_girer() {
            us_19Page.password.sendKeys(ConfigurationReader.getProperty("adminn_password"));

        }

    @And("islemin yapıldıgını dogrular")
    public void isleminYapıldıgınıDogrular() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(us_19Page.allert.isDisplayed());


    }
}
