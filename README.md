Internet

This is an example project of some "better" practices to put in place, such as implementing a PageObject model using PageFactory for object creation and initialization.

An AbstractPage object is being extended; the super class uses an AjaxElementLocatorFactory in it's initElements call; this enforces a wait (configured in shared/singleton WebDriver wrapper class) for elements to appear before exceptions are thrown.

Currently this project is using Cucumber-JVM and PicoContainer to test Dave Haeffner's "The Internet" at http://the-internet.herokuapp.com.
