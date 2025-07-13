package day3;

import java.util.Scanner;

import org.openqa.selenium.By;


public class Switch {

	public static void main(String[] args) {
//		System.out.println("Nhap n = ");
//		
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		printDayOfWeek(n);
		
		String locatorType = "id";
		String locatorValue = "firstName";
		
		By result = getLocator(locatorType, locatorValue);
		System.out.println(result);
		
		
	}
	
  public static void printDayOfWeek(int n) {
	  switch (n) {
	  case 2:
		  System.out.println("Thu 2");
		  break;
	  case 3:
		  System.out.println("Thu 3");
		  break;
	  case 4:
		  System.out.println("Thu 4");
		  break;
	  case 5:
		  System.out.println("Thu 5");
		  break;
	  case 6:
		  System.out.println("Thu 6");
		  break;
	  case 7:
		  System.out.println("Thu 7");
		  break;
	  case 8:
		  System.out.println("Chu Nhat");
		  break;
		default:
			System.out.println("Nhap lai n");
			break;		  
		  
	  }
	  }
  
      public static By getLocator(String locatorType, String locatorValue) {
		By result = null;
		switch (locatorType) {
		case "id": {
			
			result = By.id(locatorValue);
			break;
			}
        case "name": {
			
			result = By.name(locatorValue);
			break;			
		}
        case "linkText": {
			
			result = By.linkText(locatorValue);
			break;			
		}
        case "cssSelector": {
			
			result = By.cssSelector(locatorValue);
			break;			
		}
        case "partialLinkText": {
			
			result = By.partialLinkText(locatorValue);
			break;			
		}
        case "tagName": {
			
			result = By.tagName(locatorValue);
			break;			
		}
        case "xpath": {
			
			result = By.xpath(locatorValue);
			break;			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + locatorType);
		}
		return result;
		

	}
  }
  

