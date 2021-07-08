package WebOrderingBrokrete;

import Core.WebOrderingBrokrete.RegionProductPage;
import org.junit.Test;

public class WebOrderingSignUpTest extends BaseTest {

    @Test
    public void checkWebOrderingSuccessfulSignUp(){

        getWebDriver().get("https://brokrete-web-ordering-stage.herokuapp.com/");
        final RegionProductPage webOrderingBrokreteRegionProductPage = new RegionProductPage(getWebDriver());

    }

}
