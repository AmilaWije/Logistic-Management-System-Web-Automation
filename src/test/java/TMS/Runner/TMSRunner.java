package TMS.Runner;

import Utility.EmailGenerator;
import Utility.PropertyFileHandler;
import Utility.WebDriverHelper;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/resources/Features/"}, glue = {"TMS/StepDefinition"}, tags = {"@export"}, strict = true)
public class TMSRunner {
    public static ExtentReports extent;
    public static ExtentSparkReporter reporter;
    public static ExtentTest test;

    @BeforeClass
    public static void setup() throws FileNotFoundException, IOException {
        // extent report generator
        extent = new ExtentReports();
        reporter = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(reporter);
        // web driver initiator
        PropertyFileHandler.getPropertyFileHandler();
        PropertyFileHandler.loadPropertyFile("src/resources/testData/data.properties");
        WebDriverHelper.getWebDriverHelper();
        WebDriverHelper.startUpWebDriver(PropertyFileHandler.readProperty("Browser"), PropertyFileHandler.readProperty("OS"));
    }

    @AfterClass
    public static void teamDown() throws InterruptedException {
        if (WebDriverHelper.getWebDriver() != null) {
            WebDriverHelper.getWebDriver().quit();
            // extent report generator
            extent.flush();
            // call email generator
            EmailGenerator emailSender = new EmailGenerator();
            emailSender.recipientFileReader();
        }
    }
}
