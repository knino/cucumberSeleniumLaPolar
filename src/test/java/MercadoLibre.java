public class MercadoLibre extends BaseClass{
    private String searchButton = "//header/div[1]/form[1]/button[1]";
    public MercadoLibre(){
        super(driver);
    }

    public void navigateToMercadoLibre(){
        BaseClass.navigateTo("https://www.mercadolibre.cl/");
    }

    public void clickSearch(){
        this.clickElement(searchButton);
    }

}
