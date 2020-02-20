package Day5xpath;

public class Xpath {

}



//there are eight locator id,Name,Link text,P_link text,Class Name,Tag Name,Xpath,CSS selector
//Xpath is a XML path
//Syntax:driver.findElementByLocator.gettext

// There are two type of Xpath : Absolute Xpath & Relative Xpath

//1.Basic Relative attribute Base Xpath Syntex //tagName[@Attribute='attribute Value'] www.leaftaps.com/opentags-//input[@id='username']

//***Use this syntax into a DOM by clikking CTRL+F and check it right or wrong.

//2.Partial Relative attribute Base Xpath Syntax//tagName[contains(@Attribute,'attribute value')],www.bank of america,//input[contains(@name,'online')] and chek in a DOM

//   () is call Node.

//3.Basic Relative Text Base Xpath: Syntax//tagname[text()='textvalue'],EXp_


//4.Partial Relative Text Base Xpath//tagName[contains(text(),'textvalue')],Exp:


//***if we go through parent to child class then we put just  /  forward slash,child name and put child class no.

//Nested html is HTML inside HTML


//<a--->HTML Tag(pink color)

//class----->locator/attribute(orange color)

