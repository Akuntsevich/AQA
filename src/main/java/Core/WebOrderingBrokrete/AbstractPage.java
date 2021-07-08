package Core.WebOrderingBrokrete;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {

    protected WebDriver driver; //Копия драйвера чтобы сделать инициализацию драйвера, можно пользоваться в папке Core
    protected WebDriverWait wait; //Создания ожиданий, можно пользоваться в папке Core
    protected Actions actions; //Создание активностей, можно пользоваться в папке Core

    public AbstractPage (final WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }
}
