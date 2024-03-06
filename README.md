# Demo automation test project of the [Wikipedia's](https://www.wikipedia.org/) mobile application search via [Browswerstack](https://www.browserstack.com/)


<img alt="Wikipedia" src="media/Wiki.png" width="40%">

## Content

- <a href="#tools"> Tools</a>
- <a href="#cases"> Test Cases</a>
- <a href="#autotests"> Running Automated Tests</a>
- <a href="#jenkins"> Jenkins Build</a>
- <a href="#allureReport"> Example of Allure Report</a>
- <a href="#allure"> Integration with Allure TestOps</a>
- <a href="#jira"> Integration with Jira</a>
- <a href="#telegram"> Telegram notifications</a>
- <a href="#video"> Example of test execution via Browserstack</a>

____
<a id="tools"></a>
## 🛠️ Tools

<p align="center">
<a href="https://www.java.com/"><img width="6%" title="Java" src="media/Java.svg"></a>
<a href="https://selenide.org/"><img width="6%" title="Selenide" src="media/Selenide.svg"></a>
<a href="https://browserstack.com/"><img width="6%" title="Browserstack" src="media/Browserstack.png"></a>
<a href="https://github.com/allure-framework/allure2"><img width="6%" title="Allure Report" src="media/Allure.svg"></a>
<a href="https://qameta.io/"><img width="5%" title="Allure TestOps" src="media/AllureTestOps.svg"></a>
<a href="https://gradle.org/"><img width="6%" title="Gradle" src="media/Gradle.svg"></a>
<a href="https://junit.org/junit5/"><img width="6%" title="JUnit5" src="media/Junit5.svg"></a>
<a href="https://www.jenkins.io/"><img width="6%" title="Jenkins" src="media/Jenkins.svg"></a>
<a href="https://web.telegram.org/"><img width="6%" title="Telegram" src="media/Telegram.svg"></a>
<a href="https://www.atlassian.com/ru/software/jira/"><img width="5%" title="Jira" src="media/Jira.svg"></a>
</p>

____
Tests are written in Java using the Appium framework for mobile automation testing, and the build tool is Gradle.
JUnit 5 is employed as the framework for unit testing. When running tests for remote execution, Browserstack is utilized.
For remote execution, a Jenkins job is implemented with the generation of an Allure report and sending the results to Telegram via a bot.
Integration with Allure TestOps and Jira is also implemented.

The contents of the Allure report for each test case include:
- Test steps and the results of their execution
- Screenshot of the page at the last step (to visually analyze why the test failed)
- Page Source (ability to open the page source in a new tab and see the reason for the test failure)
- Browser console logs
- Video (Screen recording from the Browserstack) of the test automation execution.

____
<a id="cases"></a>
## :male_detective: Test Cases

Automated:
- Verification of search results detection
- Searching for the required definition
- Verification of headline presence in news

Manual:
- Verification of successful navigation to the body of the news via link

<a id="autotests"></a>
____
## :arrow_forward: Running Automated Tests

### Running Tests from the Terminal

#### Execution from the project's root directory:

<em> To run <b>all</b> the tests: </em>

```
gradle clean test 
```

____
<a id="jenkins"></a>
## <img width="4%" title="Jenkins" src="media/Jenkins.svg"> </a> Jenkins Build <a target="_blank"> </a>

Registration on the [Jenkins](https://jenkins.autotests.cloud/) resource is required for access to Jenkins.

To start the build, go to the "Build with parameters" section, select the necessary parameters, and click "Build".
### Jenkins Build Parameters:
- TASK (set scope/task to execute)
- COMMENT (optional parameter to add notes that will be displayed in report)

<p align="center">
<img title="Jenkins Build" src="media/JenkinsBuild.png">
</p>
After the build is completed, icons for "Allure Report" and "Allure TestOps" will appear next to the build number in the "Build History" section. Clicking on these icons opens pages with the generated HTML report and test documentation, respectively.

____
<a id="allureReport"></a>
## <img width="4%" style="vertical-align:bottom" title="Allure Report" src="media/Allure.svg"> </a> Example of <a target="_blank" href="https://jenkins.autotests.cloud/job/js_browserstack_mobile_tests/"> Allure Report </a>

<p align="center">
<img title="Allure Overview" src="media/AllureOverview.png">
</p>

____
<a id="allure"></a>
## <img width="4%" style="vertical-align:bottom" title="Allure TestOps" src="media/AllureTestOps.svg"> </a> Integration with <a target="_blank" href="https://allure.autotests.cloud/launch/36244"> Allure TestOps </a>

On the *Dashboard* in **Allure TestOps**, you can see the statistics of the number of tests: how many of them are added and executed manually, how many are automated. New tests and test run results are sent through the integration with each build.

<p align="center">
<img title="Allure TestOps DashBoard Graphs" src="media/AllureTestOpsDashboardGraphs.png">
</p>

<p align="center">
<img title="Allure TestOps DashBoard" src="media/TestOpsDashboard.png">
</p>

<p align="center">
<img title="Allure TestOps Cases" src="media/TestOpsCases.png">
</p>

____
<a id="jira"></a>
## <img width="4%" style="vertical-align:bottom" title="Jira" src="media/Jira.svg"> </a> Integration with <a target="_blank" href="https://jira.autotests.cloud/"> Jira </a>

Integration with **Allure TestOps** and **Jira** is implemented. In the Jira task, you can see which test cases were written as part of the task and their execution results.

<p align="center">
<img title="Jira Task" src="media/JiraTask.png">
</p>

____
<a id="telegram"></a>
## <img width="4%" style="vertical-align:bottom" title="Telegram" src="media/Telegram.svg"> Automatically generated report notification in <a target="_blank" href="https://telegram.org/"> Telegram </a> via Bot

After the build is complete, a **Telegram** bot automatically processes and sends a message with the test run report to a specifically configured chat.

<p align="left">
<img width="40%" title="Telegram Notifications" src="media/TelegramBot.jpg">
</p>

____
<a id="video"></a>
## <img width="4%" style="vertical-align:bottom" title="Browserstack" src="media/Browserstack.png"> </a> Screen recording attachment <a target="_blank" href="https://browserstack.com/"> Browserstack </a> example

In the Allure reports for each test, a video of the test execution is attached along with a screenshot.

<p align="left">
  <img title="Browserstack attachment" src="media/Video.gif">
</p>
