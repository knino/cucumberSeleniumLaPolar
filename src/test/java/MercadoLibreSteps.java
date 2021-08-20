import io.cucumber.java.en.*;

public class MercadoLibreSteps {
    MercadoLibre ML = new MercadoLibre();

    @Given("^Navigate in mercadolibre$")
    public void navigateToMercadoLibre(){
        ML.navigateToMercadoLibre();


    }

    @When("^Enter Search criteria$")
    public void insertCriteria(){
        ML.sendCriteria();
    }

    @And("^Click on search button$")
    public void clickAndSearch(){
        ML.clickSearch();
    }

    @Then("^Result match the criteria$")
    public void validateCriteria(){
        System.out.println("Then");
    }

    @And("^Close Browser$")
    public void closeBrowser(){
       ML.close();
    }
}
