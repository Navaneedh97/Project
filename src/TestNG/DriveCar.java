package TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DriveCar {
  @Test(priority=1)
  public void start() {
	  System.out.println("Start the car");
  }
  
  @Test(priority=2)
  public void first() {
	  System.out.println("First Gear");
  }
  
  @Test(priority=3)
  public void second() {
	  System.out.println("Second Gear");
  }
  
  @Ignore
  @Test(priority=4)
  public void music() {
	  System.out.println("Music Systen ON");
  }
  
  @Test(priority=5)
  public void third() {
	  System.out.println("Third Gear");
  }
  
  @Test(priority=6,enabled=false)
  public void fourth() {
	  System.out.println("Fourth Gear");
  }
  
  @Test(priority=7)
  public void fifth() {
	  System.out.println("Fifth Gear");
  }
  
  }