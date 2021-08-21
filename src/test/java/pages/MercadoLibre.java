package pages;

public class MercadoLibre extends BaseClass {
    private String searchButton = "//button[@type='submit']";
    private String searchBar = "//input[@class='nav-search-input']";
    private String searchButtonBarOff = "//span[@class='ui-search-animated-switch__switch-bar ui-search-animated-switch__switch-bar--off']";
    private String searchButtonBarOn = "//span[@class='ui-search-animated-switch__switch-bar ui-search-animated-switch__switch-bar--on']";
    private String result ="//meta[@name='description']";

    public MercadoLibre(){
        super(BaseClass.driver);
    }

    public void navigateToMercadoLibre(){
        BaseClass.navigateTo("https://www.mercadolibre.cl/");
    }
    public void MercadoLibreProductPages(){
        BaseClass.navigateTo("https://listado.mercadolibre.cl/nintendo-switch-consola#D[A:nintendo%20switch%20consola,L:undefined]");
    }

    public void clickSearch(){
        clickElement(searchButton);
    }

    public void sendCriteria() {
        sendKeys(searchBar, "consola nintendo switch");
    }

    public void clickFullBar(){
        clickElement(searchButtonBarOff);
    }

    public void close() {
        BaseClass.closeBrowser();
    }

    public String getTitle(){
        return textTitle(result);
    }

    public String getClassAtribute(){
      return getAtribute(searchButtonBarOn);

    }



    }
