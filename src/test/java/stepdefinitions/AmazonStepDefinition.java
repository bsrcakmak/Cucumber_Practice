package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.Driver;

public class AmazonStepDefinition {
    AmazonPage amazonPage;
    @Given("kullanici amazona gider")
    public void kullaniciAmazonaGider() {

        Driver.getDriver().get("https://amazon.com");
    }

    @Then("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);

    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("sayfa basliginin iphone icerdigini test eder")
    public void sayfaBasligininIphoneIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iphone"));
    }

    @When("kullanici selenium icin arama yapar")
    public void kullaniciSeleniumIcinAramaYapar() {
        amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("selenium", Keys.ENTER);

    }

    @Then("sayfa basliginin selenium icerdigini test eder")
    public void sayfaBasligininSeleniumIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("selenium"));
    }

    @When("kullanici java icin arama yapar")
    public void kullaniciJavaIcinAramaYapar() {
        amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("java", Keys.ENTER);

    }

    @Then("sayfa basliginin java icerdigini test eder")
    public void sayfaBasligininJavaIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("java"));

    }
}