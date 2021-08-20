import io.cucumber.java.en.*;

public class MercadoLibreSteps {
    MercadoLibre ML = new MercadoLibre();

    @Given("^Navigate in mercadolibre$")
    public void navigateToMercadoLibre(){
        ML.navigateToMercadoLibre();
        System.out.println("given");

    }

    @When("^Enter Search criteria$")
    public void insertCriteria(){
        System.out.println("When");
    }

    @And("^Click on search button$")
    public void clickAndSearch(){
        System.out.println("And");
    }

    @Then("^Result match the criteria$")
    public void validateCriteria(){
        System.out.println("Then");
    }
}
