package Selenium.locators;

import org.openqa.selenium.By;

public class CustomXPath {
    public static void main(String[] args) {

        //xpath - not an attribute
        //html dom - address/path of the element

        //1. abs xpath
        // /html/body/div/div[2]/ul

        //2.relative/custom xpath
        //use some xpath functions
        //xpath syntax
        //xpath axes
        //custom xpath

        //3. xpath uses attributes (id, name, any)
        //4. xpath having multiple functions
        //5. xpath axes: parent/child, ancestor, siblings

        //htmltag[@attribute='value']
        //htmltag[@attribute1='value' and @attribute2='value']

        //text():
        //htmltag[text()='value']

        //contains(): to handle dynamic elements with dynamic properties/attributes
        //htmltag[contains(@attribute,'value')]
        //htmltag[contains(@attribute1,'value') and @attribute2='value']

        //contains with text():
        //htmltag[contains(text(),'value')]

        //starts-with():
        //htmltag[starts-with(@attribute,'value')]

        //xpath with class names:
        //htmltag[@class='c1 c2 c3 ... cn')]

        By x1 = By.xpath("//htmltag[@class='c1 c2 c3 ... cn')]"); //right
        By x2 = By.className("//htmltag[@class='c1 c2 c3 ... cn')]"); //wrong(only one class name allowed)
        By x3 = By.className("c3"); //right
        By x4 = By.className("c2"); //right

        //xpath with index: using capture group
        //(//div[@class='footer-main'])[2]//a -- can use by index number
        //(//div[@class='footer-main'])[position()=2]//a -- also can use by position()
        //((//div[@class='footer-main'])[2]//a)[3]
        //(//div[@class='footer-main'])[last()] -- can use last() to go last element


        //dynamic WebTableHandle:
        //for parent:
        //a[text()='Md Arif']/parent::td

        //for grandparent:
        //a[text()='Md Arif']/ancestor::tr

        //for parent preceding-sibling:
        //a[text()='Md Arif']/parent::td/preceding-sibling::td/input or //a[text()='Md Arif']/../preceding-sibling::td/input

        //for parent following-sibling:
        //a[text()='Md Arif']/parent::td/following-sibling::td/a[@context='company']

        //for backward:
        //a[text()='Md Arif']/../../../../../../../../../../../../../../../../.. -- use for backward traversing through xpath

        //my interview ques --
        //ul[@id='first-level-nav']/child::li[@class='logo']//img


        //static web table handles:
        //*[@id="customers"] -- check for all the html tag who has id = customer
        //table[@id="customers"] -- check for only html tags table, so it takes less time
    }
}
