import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Zakładki {

    @Test
    public void przejsciaPomiedzyZakladkami() throws InterruptedException {
        System.out.println("====================================================");
        System.out.println("||              Uruchamianie testu                ||");
        System.out.println("====================================================");
        System.setProperty("webdriver.chrome.driver", "C:/WebDrivers/chromedriver.exe");
        System.out.println("Uruchamianie WebDrivera..");
        System.out.println("");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        String komunikatWWW = "Błędny adres strony !!";
        //Maksymalizuj okno przeglądarki
        driver.manage().window().maximize();

        //Przejdź na stronę repairbox.pl
        String www = "https://www.repairbox.pl/";
        System.out.println(" ");
        System.out.println("Przejdź do strony: " + www);
        driver.navigate().to(www);
        Thread.sleep(1200);

        try {
            driver.findElement(By.xpath("//*[@id='kopageBarCookies']/a[1]")).click();
        } catch (Exception ignored) {
            System.out.println("Brak komunikatu Cookies !!");
        }

        Assertions.assertEquals(www, driver.getCurrentUrl(), komunikatWWW);

        //Kliknij w przycisk Filmy
        System.out.println("Przejdź do zakładki Filmy..");
        driver.findElement(By.cssSelector("a[href='filmy']")).click();
        System.out.println("#######################");

        // Pobierz i wyświetl adres URL strony.
        System.out.println(driver.getCurrentUrl());
        Assertions.assertEquals("https://www.repairbox.pl/filmy",driver.getCurrentUrl(), komunikatWWW );

        // Pobierz i wyświetl tytuł strony / tytuł karty
        System.out.println(driver.getTitle());
        System.out.println("#######################");
        Thread.sleep(300);

        //Kliknij w przycisk Aplikacje
        System.out.println("Przejdź do zakładki Aplikacje..");
        driver.findElement(By.cssSelector("a[href='aplikacje']")).click();
        System.out.println("#######################");

        // Pobierz i wyświetl adres URL strony.
        System.out.println(driver.getCurrentUrl());
        Assertions.assertEquals("https://www.repairbox.pl/aplikacje",driver.getCurrentUrl(), komunikatWWW );


        // Pobierz i wyświetl tytuł strony / tytuł karty
        System.out.println(driver.getTitle());
        System.out.println("#######################");
        Thread.sleep(1500);

        //Kliknij w przycisk Poradniki
        System.out.println("Przejdź do zakładki Poradniki..");
        driver.findElement(By.cssSelector("a[href='poradniki']")).click();
        System.out.println("#######################");

        // Pobierz i wyświetl adres URL strony.
        System.out.println(driver.getCurrentUrl());
        Assertions.assertEquals("https://www.repairbox.pl/poradniki",driver.getCurrentUrl(), komunikatWWW );

        // Pobierz i wyświetl tytuł strony / tytuł karty
        System.out.println(driver.getTitle());
        System.out.println("#######################");
        Thread.sleep(1400);

        //Kliknij w przycisk Serwis
        System.out.println("Przejdź do zakładki Serwis..");
        driver.findElement(By.cssSelector("a[href='serwis']")).click();
        System.out.println("#######################");

        // Pobierz i wyświetl adres URL strony.
        System.out.println(driver.getCurrentUrl());
        Assertions.assertEquals("https://www.repairbox.pl/serwis",driver.getCurrentUrl(), komunikatWWW );

        // Pobierz i wyświetl tytuł strony / tytuł karty
        System.out.println(driver.getTitle());
        System.out.println("#######################");
        Thread.sleep(1700);

        //Kliknij w przycisk Narzędzia
        System.out.println("Przejdź do zakładki Narzędzia..");
        driver.findElement(By.cssSelector("a[href='narzedzia']")).click();
        System.out.println("#######################");

        // Pobierz i wyświetl adres URL strony.
        System.out.println(driver.getCurrentUrl());
        Assertions.assertEquals("https://www.repairbox.pl/narzedzia",driver.getCurrentUrl(), komunikatWWW );

        // Pobierz i wyświetl tytuł strony / tytuł karty
        System.out.println(driver.getTitle());
        System.out.println("#######################");
        Thread.sleep(1700);

        //Kliknij w przycisk Kontakt
        System.out.println("Przejdź do zakładki Kontakt..");
        driver.findElement(By.cssSelector("a[href='kontakt']")).click();
        System.out.println("#######################");

        // Pobierz i wyświetl adres URL strony.
        System.out.println(driver.getCurrentUrl());
        Assertions.assertEquals("https://www.repairbox.pl/kontakt",driver.getCurrentUrl(), komunikatWWW );

        // Pobierz i wyświetl tytuł strony / tytuł karty
        System.out.println(driver.getTitle());
        System.out.println("#######################");
        Thread.sleep(2000);

        //Zamknij przeglądarkę
        System.out.println("================ Zakończenie testu ================");
        driver.quit();
    }
}
