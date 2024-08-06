package runners;

import org.testng.TestNG;

import java.util.Collections;

public class TestNGXmlRunner {
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestSuites(Collections.singletonList("src/test/resources/testng.xml"));
        testng.run();
    }
}