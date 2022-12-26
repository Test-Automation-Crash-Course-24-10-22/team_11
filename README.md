Automation testing stack using Java, Selenium, TestNG, and Maven.

It consists of:

'Page Component Object Model' design pattern.

Reports, created with Allure framework.

The target website is https://rozetka.com.ua/ua/

Automated tests:

Verify the user can not login when the text field "Email" is empty.

Verify the user can not login with an invalid password.

Verify the opportunity to log in with a valid email and password.

Verify the opportunity to select the checkbox [Remember Password].

Verify the user can call the sighup popup window with the button [Signup]


Executing the Tests:

1.Select branch master

2.Clone the repository:
git clone https://github.com/Test-Automation-Crash-Course-24-10-22/team_11.git

3.Run the test with command : mvn clean test

4.Generate the report with command:  allure serve 
