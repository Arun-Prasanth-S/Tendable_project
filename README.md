# Selenium Java TestNG Automation Project for Tendable Website

For more information on Tendable, visit the [Tendable website](https://www.tendable.com/).
This project includes automated tests for evaluating specific functionalities on the Tendable website. It tests the accessibility of top-level menus, the functionality of the "Request a Demo" button across different pages, and the form validation within the "Contact Us" section.

## Prerequisites

To run these tests, you will need:
- Java JDK (version 8 or higher)
- Maven (version 3.6.0 or higher)
- Selenium WebDriver for the browser you plan to test with (e.g., ChromeDriver for Chrome)
- Eclipse or another Java IDE (with Maven integration)

## Setting Up

1. **Install Java JDK** and set up the JAVA_HOME environment variable.
2. **Install Maven** and ensure the `mvn` command is available in your system's PATH.
3. **Clone the Repository**: Use `git clone` or download the ZIP file of the project and extract it.
4. **Import the Project into Eclipse**:
   - Open Eclipse and select `File > Import...`.
   - Choose `Existing Maven Projects` and navigate to the root directory of the project you cloned or downloaded.
   - Confirm the project is listed and click `Finish`.

## Running Tests

### Via Eclipse

1. In Eclipse, right-click on the `testng.xml` file or any test class in the `src/test/java` directory.
2. Choose `Run As > TestNG Test`.

The TestNG plugin for Eclipse should be installed for this option. If it's not installed, you can find it by searching for "TestNG" in the Eclipse Marketplace (`Help > Eclipse Marketplace...`).

### Using Maven Command

1. Open a terminal or command prompt.
2. Navigate to the project's root directory.
3. Run the following command:

```sh
mvn clean test
