package yt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.youtube.com";
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("#search")).sendKeys("rick astley");
		
		String ytvideo = "div.style-scope.ytd-app:nth-child(12) div.style-scope.ytd-app:nth-child(1) ytd-masthead.masthead-finish div.style-scope.ytd-masthead:nth-child(4) ytd-searchbox.style-scope.ytd-masthead:nth-child(6) form.style-scope.ytd-searchbox button.style-scope.ytd-searchbox:nth-child(2) > yt-icon.style-scope.ytd-searchbox:nth-child(1)";
		driver.findElement(By.cssSelector(ytvideo)).click();
		
		//WebElement videoIzNiza
		
		driver.findElement(By.xpath("//div[@id='contents']//ytd-video-renderer[1]//div[1]//div[1]//div[1]//div[1]//h3[1]//a[1]")).click();
		//String videoIzNiza = "//div[@id='contents']//ytd-video-renderer[1]//div[1]//div[1]//div[1]//div[1]//h3[1]//a[1]";
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement pausePlayButton = driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']"));

        pausePlayButton.click();

        
        List<WebElement> lst1 = new ArrayList<>();
       //List<WebElement> lst2 = driver.findElements(By.className(className));
        List<WebElement> playSecondRecomended = driver.findElements(By.className("ytd-compact-video-renderer"));

        playSecondRecomended.get(2).click();

        

		//driver.findElement(By.cssSelector("div.style-scope.ytd-app:nth-child(12) ytd-page-manager.style-scope.ytd-app:nth-child(2) ytd-watch-flexy.style-scope.ytd-page-manager.hide-skeleton:nth-child(1) div.style-scope.ytd-watch-flexy:nth-child(7) div.style-scope.ytd-watch-flexy:nth-child(1) div.style-scope.ytd-watch-flexy div.style-scope.ytd-watch-flexy:nth-child(1) div.style-scope.ytd-watch-flexy:nth-child(1) div.style-scope.ytd-watch-flexy div.style-scope.ytd-watch-flexy ytd-player.style-scope.ytd-watch-flexy div.style-scope.ytd-player div.html5-video-player.ytp-transparent.ytp-hide-info-bar.ytp-iv-drawer-enabled.iv-module-loaded.ad-created.paused-mode div.ytp-chrome-bottom:nth-child(28) div.ytp-chrome-controls div.ytp-left-controls > button.ytp-play-button.ytp-button:nth-child(2)"));
		
	}

}
