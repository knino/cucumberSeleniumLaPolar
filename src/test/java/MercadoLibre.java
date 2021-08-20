public class MercadoLibre extends BaseClass{
    private String searchButton = "//button[@type='submit']";
    private String searchBar = "//input[@class='nav-search-input']";
    private String dropDownOrderByButton = "//*[@class='andes-dropdown__trigger']";
    private String dropDownOrderBy = "//*[@value='price_asc']";
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

    public void clickOrderDropDown(){
        clickElement(dropDownOrderByButton);
    }

    public void SelectDropDownAscPriceOrder(){

        clickElement(dropDownOrderBy);
    }

    public void close() {
        closeBrowser();
    }
}
