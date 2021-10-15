import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Nawigowanie {

    @Test
    public void navigation() {
        System.out.println("Uruchamianie Testu..");
        System.setProperty("webdriver.chrome.driver", "G:/WebDrivers2/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        //Maksymalizuj okno przeglądarki
        driver.manage().window().maximize();

        //Przejdź na stronę repairbox.pl
        driver.navigate().to("https://www.repairbox.pl/");

        //Przejdź do zakładki Kontakt
        driver.navigate().to("https://www.repairbox.pl/kontakt/");

        //Wykonaj polecenie "wstecz" na przeglądarce
        driver.navigate().back();

        //Wykonaj polecenie "dalej" na przeglądarce
        driver.navigate().forward();

        //Odśwież stronę
        driver.navigate().refresh();

        //Zamknij przeglądarkę
        driver.quit();
    }
}
