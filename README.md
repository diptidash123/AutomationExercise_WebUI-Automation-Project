**AutomationExercise – Web/UI Automation Project**

**Project Overview:-**
AutomationExercise.com is a publicly available web application designed to support QA engineers, developers, and automation enthusiasts to practice real-world automation scenarios. 
The site offers a wide range of web elements and workflows commonly found in e-commerce applications, such as:
* User authentication (login / signup)
* Product browsing and catalog navigation
* Shopping cart operations
* Checkout and order placement
* User accounts
This project is built to automate end-to-end test scenarios of AutomationExercise.com using Selenium WebDriver and TestNG. It showcases a scalable and maintainable automation framework that follows industry standards and best practices. By automating real user flows, this framework enables faster regression testing, repeatable validation, and robust test reporting.
The framework structure follows the Page Object Model (POM) design pattern to ensure separation of test logic, better readability, and maintainability.

Project Objectives
The primary goals of this automation project are:
* Convert Manual Test Cases into Automated Scripts Transform manual QA flows validated on AutomationExercise.com into stable and reusable automated test cases.
* Build a Scalable Automation Framework Design a framework that is maintainable, modular, and extensible to support future test additions and enhancements.
* Leverage Industry-Standard Tools and Practices Utilize Java, Selenium WebDriver, TestNG, and Maven, adhering to automation and coding best practices.
* Follow Page Object Model (POM) Design Separate page element locators and actions from test logic, reducing code duplication and improving maintainability.
* Enable Clear Test Reporting and Debugging Integrate Extent Reports to generate detailed execution reports containing step logs and screenshots for failure analysis.
* Implement TestNG Test Suites for Organized Execution Group tests logically for regression, sanity, and other execution needs with suite XML configurations.
* Support Cross-Environment Execution Facilitate execution against different environments and configurations without modifying core logic.
* Lay Foundation for CI/CD Integration Structure the project to be easily integrated with pipelines (e.g., Jenkins, GitHub Actions) for automated execution.

End-to-End Web Automation Flow
As part of this automation framework, the following complete end-to-end user journey has been automated and validated:
* Navigate to the AutomationExercise website
* User Login with valid credentials
* Home Page verification and product selection
* Add selected product to cart
* Open and validate cart page
* Proceed to checkout
* Enter payment and billing details
* Place the order successfully
* Verify order confirmation message
This flow simulates a real customer purchase journey and ensures that all major functional components of the application work seamlessly together.

🛠 Tech Stack & Tools
Tool / Technology	Purpose
Java	Core programming language used for automation scripting
Selenium WebDriver	Web automation and browser interaction
TestNG	Test execution, assertions, grouping, and reporting
Maven	Build management and dependency handling
IntelliJ IDEA / Eclipse	Integrated Development Environment (IDE)
WebDriverManager	Automatic browser driver management
Extent Reports	Rich HTML test execution and analysis reports
Jenkins	CI/CD automation and scheduled test execution
Git & GitHub	Version control and source code management
Apache Commons IO	File handling and screenshot utilities
TestNG XML Suites	Test suite configuration and execution management
Dependencies Used
Dependency	Version	Purpose
Selenium Java	4.40.0	Web browser automation and UI interaction
TestNG	7.0.0	Test execution, assertions, and test grouping
WebDriverManager	6.3.2	Automatic browser driver management
Extent Reports	5.1.0	Interactive HTML test execution reports
Apache Commons IO	2.20.0	File handling and screenshot utilities
Maven Surefire Plugin	3.2.5	Test execution and TestNG suite integration
🏗Framework Design
The framework follows a clean, modular, and scalable architecture, designed using Page Object Model (POM) and industry best practices to ensure maintainability, reusability, and easy scalability.

AutomationExercise_WebAutomation
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── constant/                Application constants & enums
│   │   │   │   └── FrameworkConstants.java
│   │   │
│   │   │   ├── core/                    Framework core components
│   │   │   │   ├── BaseTestCase.java
│   │   │   │   └── DriverManager.java
│   │   │
│   │   │   ├── pages/                   Page Object classes
│   │   │   │   ├── LoginPage.java
│   │   │   │   ├── HomePage.java
│   │   │   │   ├── CartPage.java
│   │   │   │   └── CheckoutPage.java
│   │   │
│   │   │   ├── enums/                   Framework enums
│   │   │   │   └── BrowserType.java
│   │   │
│   │   │   └── utils/                   Reusable utilities
│   │   │       ├── ConfigReader.java
│   │   │       ├── ExtentManager.java
│   │   │       ├── ExtentTestManager.java
│   │   │       ├── ScreenshotUtil.java
│   │   │       ├── RetryAnalyzer.java
│   │   │       ├── TestListener.java
│   │   │       └── TestDataReader.java
│   │   │
│   │   └── resources
│   │       └── testcases/               External test data (Excel/Files)
│   │           └── AutomationExercise_TestCases.xlsx
│   │
│   └── test
│       ├── java
│       │   ├── Login/                   Login related test cases
│       │   │   └── LoginPageTest.java
│       │   │
│       │   └── TestScript/              End-to-end test flows
│       │       └── AddToCartTest.java
│       │
│       └── resources
│           ├── config/                  Environment configurations
│           ├── drivers/                Browser driver binaries
│           ├── testinputdata/           External test input files
│           └── testsuite/               TestNG suite XMLs
│               └── Regressiontestsuite.xml
│
├── Screenshots/                         Failure screenshots
├── target/                              Maven build output
├── test-output/                         TestNG default reports
├── extent-config.xml                    Extent report configuration
├── .gitignore                           Git ignored files
├── pom.xml                              Maven dependencies
└── README.md                            Project documentation

📌 Framework Components
🔹 Core Layer (core/)
Contains base framework components:
* BaseTestCase.java → Test setup & teardown
* DriverManager.java → WebDriver initialization
Handles browser lifecycle and common configurations.

🔹 Page Layer (pages/)
Implements Page Object Model:
* Each web page has a dedicated class
* Contains locators and actions
* Separates UI logic from test logic
Improves maintainability and reusability.

🔹 Utility Layer (utils/)
Provides reusable framework utilities:
* Configuration management
* Extent report handling
* Screenshot capture
* Retry mechanism
* Test listeners
* Test data reading
Centralizes common functionalities.

🔹 Test Layer (src/test/java)
Contains all test scenarios:
* Module-wise organization
* End-to-end test flows
* Business logic validation
Ensures clean separation between framework and test logic.

🔹 Resource Layer (src/test/resources)
Stores external configurations and test data:
* Environment configs
* Driver files
* TestNG suites
* Test input files
Supports data-driven execution.

🚀 Design Principles Followed
✔ Page Object Model (POM) ✔ Single Responsibility Principle ✔ Separation of Concerns ✔ Reusability & Modularity ✔ Data-Driven Testing ✔ Scalable Architecture

📈 Benefits of This Framework
* Easy maintenance
* Faster test creation
* Reduced code duplication
* Better reporting & debugging
* CI/CD ready
* Supports parallel execution (extendable)

📘 What I Learned from This Project
Through this project, I gained strong hands-on experience in building and maintaining a real-time web automation framework. Key learnings include:
* How real-world Selenium automation frameworks are designed in IT companies
* How to convert manual test cases into stable automation scripts
* Implementing framework-level retry mechanisms for flaky failures
* Designing data-driven and reusable test cases
* Applying clean coding standards and design principles
* Structuring automation projects for scalability and maintainability
* Integrating reporting and debugging mechanisms
This project demonstrates my practical experience in building a complete web automation framework from scratch, covering login, shopping, checkout, and order confirmation workflows, along with reporting and failure handling—following enterprise SDET best practices.

▶ Framework Execution
🔹 Maven Execution
Prerequisites
* JDK 8 or above
* Maven 3.6+
* Git

Commands
Run all tests:

mvn clean test
Run Regression Suite:

mvn clean test -suiteXmlFile=src/test/resources/testsuite/Regressiontestsuite.xml
Run Specific Suite (if applicable):

mvn clean test -suiteXmlFile=src/test/resources/testsuite/Smoketestsuite.xml

🔹 Execution Flow

clean → compile → test → report generation

🤖 Jenkins Execution
Job Type
* Freestyle Project
* Maven Pipeline

Build Step

clean test -suiteXmlFile=src/test/resources/testsuite/Regressiontestsuite.xml

Pipeline Flow

Git Checkout → Maven Build → Test Execution → Retry → Extent Report

Trigger
* Manual execution
* CRON-based scheduled execution

⚠ Notes & Limitations
* This project uses a public demo website for automation practice.
* Website data may reset periodically, affecting test stability.
* Some test data (users/products) may not persist permanently.
* Execution may fail if the website is under maintenance or slow.
* Network and browser updates may impact test execution.
Website Reference: https://www.automationexercise.com/

🌟 Highlights Covered
✔ End-to-end web automation using Selenium WebDriver ✔ Real-time SDET framework architecture with clean components ✔ Page Object Model (POM) implementation ✔ Data-driven testing using external files ✔ Environment-based execution (config-driven) ✔ Framework-level retry mechanism for flaky tests ✔ Soft and hard assertion strategy ✔ Screenshot capture on failure ✔ Detailed Extent HTML reports with logs ✔ Maven-based execution with Jenkins CI/CD readiness ✔ GitHub version control with interview-ready structure

Dipti Ranjan Dash
