package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class NavigationBar {



    private final By iPhone = By.xpath("//*[@aria-label='iPhone']//span[@class='globalnav-link-text-container']");
    private final By ExploreAllIphone = By.xpath("//a[text()='Explore All iPhone']");
    private static final By Logo = By.xpath("//*[@id='globalnav-list']/li[1]/a");
    private static final By ApplePage = By.xpath("//*[@id=\"page\"]/div[2]");

    private static final Logger LOGGER = LogManager.getLogger(NavigationBar.class);

    public WebDriver driver;
    public NavigationBar(WebDriver driver){

        this.driver= driver;
    }



    public Explore mouseHoverToIphone(){
        LOGGER.debug("mouse hover to the iPhone Link");
        ActOn.element(driver, iPhone).mouseHover();
        return (Explore) this;
    }
    public Explore navigateToExplore() {
        LOGGER.debug("Clicking on the Explore All iPhone");
        ActOn.element(driver, ExploreAllIphone).click();
        return new Explore(driver);
    }
}
