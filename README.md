Automation testing stack using Java, Selenium, TestNG, and Maven.

It consists of:

'Page Component Object Model' design pattern.

Reports, created with Allure framework.

The target website is https://rozetka.com.ua/ua/

Automated tests:

Verify the user can not login when the text field "Email" is empty.

Executing the Tests:

Select branch master

Clone the repository:

git clone https://github.com/Test-Automation-Crash-Course-24-10-22/team_11.git

Run the test with command :

mvn clean test

Generate the report with command:

allure serve 
