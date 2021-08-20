public class MercadoLibre extends BaseClass{

    public MercadoLibre(){
        super(driver);
    }

    public void navigateToMercadoLibre(){
        BaseClass.navigateTo("https://www.mercadolibre.cl/");
    }

}
