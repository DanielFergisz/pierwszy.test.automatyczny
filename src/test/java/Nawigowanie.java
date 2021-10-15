import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Nawigowanie {

    @Test
    public void navigation() {
        System.out.println("================ Uruchamianie testu ================");
        System.setProperty("webdriver.chrome.driver", "G:/WebDrivers2/chromedriver.exe");
        System.out.println("Uruchamianie WebDrivera..");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        //Maksymalizuj okno przeglądarki
        driver.manage().window().maximize();

        //Przejdź na stronę repairbox.pl
        String www = "https://www.repairbox.pl/";
        System.out.println("Przejdź do strony: " + www);
        driver.navigate().to(www);

        //Przejdź do zakładki Kontakt
        System.out.println("Przejdź do zakładki: Kontakt");
        driver.navigate().to("https://www.repairbox.pl/kontakt/");

        //Wykonaj polecenie "wstecz" na przeglądarce
        System.out.println("Powrót do poprzedniej zakładki..");
        driver.navigate().back();

        //Wykonaj polecenie "dalej" na przeglądarce
        System.out.println("Przejdź Dalej..");
        driver.navigate().forward();

        //Odśwież stronę
        System.out.println("Odśwież stronę..");
        driver.navigate().refresh();

        //Zamknij przeglądarkę
        System.out.println("================ Zakończenie testu ================");
        driver.quit();
    }
}
