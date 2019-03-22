package youtube;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		
		//poziva se definisani url (YT u ovom slucaju)
		
		String url = "https://www.youtube.com";
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//nalazi se polje za pretragu i ukucava zeljeni pojam
		WebElement pretraga = driver.findElement(By.cssSelector("#search"));
		pretraga.sendKeys("dead south good company");
		
		//locira se dugme Search i klikne
		WebElement searchButton = driver.findElement(By.cssSelector("div.style-scope.ytd-app:nth-child(12) div.style-scope.ytd-app:nth-child(1) ytd-masthead.masthead-finish div.style-scope.ytd-masthead:nth-child(4) ytd-searchbox.style-scope.ytd-masthead:nth-child(6) form.style-scope.ytd-searchbox button.style-scope.ytd-searchbox:nth-child(2) > yt-icon.style-scope.ytd-searchbox:nth-child(1)"));
		searchButton.click();
		
		//klik na locirani xpath prve pesme iz pretrage
		WebElement prvaPesma = driver.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/ytd-page-manager[1]/ytd-search[1]/div[1]/ytd-two-column-search-results-renderer[1]/div[1]/ytd-section-list-renderer[1]/div[2]/ytd-item-section-renderer[1]/div[2]/ytd-video-renderer[1]/div[1]/div[1]/div[1]/div[1]/h3[1]/a[1]"));
		
		prvaPesma.click();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//pauzira se snimak
		
		WebElement pausePlayButton = driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']"));
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        pausePlayButton.click();

        //pokrece se druga pesma iz liste preporucenih pesama
        
        List<WebElement> lst1 = new ArrayList<>();
       
        List<WebElement> playSecondRecomended = driver.findElements(By.className("ytd-compact-video-renderer"));

        playSecondRecomended.get(2).click();

        

		//driver.findElement(By.cssSelector("div.style-scope.ytd-app:nth-child(12) ytd-page-manager.style-scope.ytd-app:nth-child(2) ytd-watch-flexy.style-scope.ytd-page-manager.hide-skeleton:nth-child(1) div.style-scope.ytd-watch-flexy:nth-child(7) div.style-scope.ytd-watch-flexy:nth-child(1) div.style-scope.ytd-watch-flexy div.style-scope.ytd-watch-flexy:nth-child(1) div.style-scope.ytd-watch-flexy:nth-child(1) div.style-scope.ytd-watch-flexy div.style-scope.ytd-watch-flexy ytd-player.style-scope.ytd-watch-flexy div.style-scope.ytd-player div.html5-video-player.ytp-transparent.ytp-hide-info-bar.ytp-iv-drawer-enabled.iv-module-loaded.ad-created.paused-mode div.ytp-chrome-bottom:nth-child(28) div.ytp-chrome-controls div.ytp-left-controls > button.ytp-play-button.ytp-button:nth-child(2)"));
		
	}

}
