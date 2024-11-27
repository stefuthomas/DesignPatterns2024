package Assignment21;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        APIFacade apiFacade = new APIFacade(new APIClient());
        String joke = apiFacade.getAttributeValueFromJson("https://api.chucknorris.io/jokes/random", "value");
        System.out.println(joke);

        String usdToEur = apiFacade.getAttributeValueFromJson("https://api.fxratesapi.com/latest", "rates.EUR");
        System.out.println("Exhange rate from USD to EUR is: " + usdToEur);
    }
}