# Automated tests for [kinsta.com](https://kinsta.com/)

> Kinsta is a Cloud Platform designed to help companies and dev teams ship and manage their web projects faster and more efficiently.

<img title="Kinsta Main" src="images/screens/kinstamain.png">

## :pushpin: Content:

- [Stack of technologies](#computer-stack-of-technologies)
- [Running tests](#running_woman-running-tests)
- [Build in Jenkins](#-build-in-jenkins)
- [Allure report](#-allure-report)
- [Allure TestOps Integration](#-allure-testops-integration)
- [Jira Integration](#-jira-integration)
- [Telegram notifications](#-telegram-notifications)
- [Video of an example of running a test in Selenoid](#-video-of-an-example-of-running-a-test-in-selenoid)


## :computer: Stack of technologies

<p align="center">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Idea.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
<img width="6%" title="Jira" src="images/logo/Jira.svg">
<img width="6%" title="Allure TestOps" src="images/logo/Allure_TO.svg">
</p>


**Allure report includes:**

* Test execution steps (of automated and manual tests)
* Screenshot of the last step
* Page Source
* Browser console logs
* Video of run

## :desktop_computer: Running autotests from the terminal
Lauching tests on a ***remote server*** using Jenkins and Selenoid (login and password are required for authorization) can be done using the following command from the terminal:
```bash  
gradle clean remote
```

If you do not specify any parameters, then the test will run with the default values that we set above.

## :rocket: Running tests

If necessary, you can override the launch options:

```
clean
simple_test
--info
"-Dbrowser=${BROWSER}"
"-DbrowserVersion=${BROWSER_VERSION}"
"-DbrowserSize=${BROWSER_SIZE}"
"-DbaseUrl=${BASE_URL}"
"-Dremote=${REMOTE}"
```

### Build options

* <code>BROWSER</code> is the browser in which the tests will be run. The default is <code>chrome</code>.
* <code>VERSION</code> is the browser version in which the tests will be run. The default is <code>100.00</code>.
* <code>SIZE</code> is the size of the browser window in which tests will be run. The default is <code>1920x1080</code>
* <code>BASE_URL</code> is the url that will open the application under test. By default - <code>https://kinsta.com</code>.
* <code>REMOTE_URL</code> is the address of the remote browser.


## <img width="4%" style="vertical-align:middle" title="Jenkins" src="images/logo/Jenkins.svg"> Build in [Jenkins](url)
<p align="center">
<img title="Jenkins Build" src="images/screens/jenkins.png">

</p>

## <img width="4%" style="vertical-align:middle" title="Allure Report" src="images/logo/Allure.svg"> [Allure](url)report
### Overview

<p align="center">
<img title="Allure Overview" src="images/screens/alluremain.png">
</p>

### Test result

<p align="center">
<img title="Test Results in Allure" src="images/screens/alluretests.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Allure TestOps Report" src="images/logo/Allure_TO.svg"> [Allure TestOps](url) Integration

Also we can connect <code>Jenkins</code> to the commercial version of <code>Allure</code>, which provides an opportunity to add there manual tests as well as an automated ones:

<p align="center">
<img title="Test Results in Allure" src="images/screens/alluretestops.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Jira Integration" src="images/logo/Jira.svg"> [Jira](url) Integration

And also we can see from <code>Jira</code>, which tests been added to <code>Allure</code> with their statuses

<p align="center">
<img title="Allure Overview" src="images/screens/jira.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Telegram" src="images/logo/Telegram.svg"> Telegram notifications

<p align="center">
<img width="50%" title="Telegram Notifications" src="images/screens/telegram.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Selenoid" src="images/logo/Selenoid.svg"> Video of an example of running a test in Selenoid

A video is attached to each test in the report. One of these videos is shown below.
<p align="center">
  <img title="Selenoid Video" src="images/video/video.gif">
</p>
