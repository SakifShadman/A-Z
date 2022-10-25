package Selenium.locators;

import org.openqa.selenium.By;

public class CustomCSSSelector {
    public static void main(String[] args) {


        //CSS Selector: it's not an attribute
        By.cssSelector("");

        /*
        id --> #id or tag#id
        class --> .classname or tag.classname

        //we can use combine of id and classname
        #id.classname
        tag#id.classname
        .classname#id
        tag.classname#id

        //for multiple class:
        .c1.c2.c3...cn
        tag.c1.c2.c3...cn
        tag.c1.c2.c3...cn#id
        tag#id.c1.c2.c3...cn

        //if id and class not available
        tag[attribute='value'] -- css
        //tag[@attribute='value'] -- xpath

        //for multiple attribute:
        tag[attribute1='value'][attribute2='value'][][]

        tag[attribute*='value'] -- works like contains() from xpath
        input[id*='email']

        tag[attribute^='value'] -- works like starts-with() from xpath
        input[id^='input']

        tag[attribute$='value'] -- works like ends-with() from xpath
        input[id$='email']

        //parent to child:
        tag.classname childTag -- (direct child + indirect) as like //(double forward slash) in xpath
        tag.classname > childTag -- (only direct child) as like /(single forward slash) in xpath

        //child to parent: not allowed
        //backward traversing not allowed in CSS

        //preceding-sibling is not allowed

        //following-sibling is allowed:
        tag.classname + siblingTag

        //comma in CSS:
        input#username, input#password, button#loginBtn -- will validate everything from one cssSelector

        //nth-of-type: works like index as xpath but xpath is better for index concep

        //no text capture


                                xpath                        css
        //1.syntax:            complex                      simple
        //2.functions:         better                       limited
        //3.text:              yes -- text()                  NA
        //4.backward TR:       yes                            NA
        //5.webTable:          better handling              limited options
        //6.performance:       good                         good
        //7.diff tag check:      NA                         comma
        //8.after validations: good                         better
*/
        //We use CSSSelector when there is no text() or backward traversing in the webElement
        //We always use CSSSelector for easy syntax and for contains,starts-with or ends-with
    }
}
