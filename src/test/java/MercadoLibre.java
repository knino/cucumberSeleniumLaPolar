public class MercadoLibre extends BaseClass{
    private String searchButton = "//header/div[1]/form[1]/button[1]";
    private String searchBar = "//header/div[1]/form[1]/input[1]";
    public MercadoLibre(){
        super(driver);
    }

    public void navigateToMercadoLibre(){
        BaseClass.navigateTo("https://www.mercadolibre.cl/");
    }

    public void clickSearch(){
        clickElement(searchButton);
    }

    public void sendCriteria() {
        sendKeys(searchBar, "consola nintendo switch");
    }

    public void close() {
        closeBrowser();
    }
}
