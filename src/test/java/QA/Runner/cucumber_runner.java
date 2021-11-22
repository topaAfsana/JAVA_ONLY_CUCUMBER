package QA.Runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
    @CucumberOptions(
            features = {"src/test/java/QA/Features"},
//            glue= {""},
            glue= {"QA/Stepdefs"},
            tags = "",
            plugin = { "pretty", "html:target/cucumber-reports.html" ,"pretty", "json:target/cucumber-report.json"}
//            monochrome = true)
    )

    public class cucumber_runner {

}


//Run Command
// source ~/.bash_profile
// mvn clean install
// mvn test
// mvn test -Dcucumber.options='--tags @SMOKE'

//cucumber.api.cli.Main
//io.cucumber.core.cli.Main





//PRE REQ:
//1.FEATURE FILES NEEDS TO BE IN TEST RESOURCE FOLDER OR TEST JAVA FOLDER
//2.GLUE MUST NOT MENTIONED OR SPECIFY ONLY THE PACKAGE NAME NOT FROM SRC
//3.SUREFIRE PLUGIN MUST BE 2.12.4 VERSION AND INCLUDE THE RUNNER PATH
//4.COMPILER MUST COMPATIBLE OF JAVA FUNCTION VERSION LEVEL(lamda only works jdk 12)
//CUCUMBER JAVA AND JUNIT MUST BE SAME(cucumber core-needed for intellij,cucumber java and junit same, junit neede for intellij)


//features = {"src/test/java/QA/Features/"},
//glue= {"QA/Stepdefs/"},
//ALSO TAG HAS TO MATCH


//ISSUE:JRE/JDK/COMPILER ISSUE
//
//        SOLUTION:
//        1.CHANGE BUILD PATH IN ECLIPSE JRE TO JDK
//        ADD JDK AS  ALTERNATE INSTALLED ONE AND AS EXECUTE JDK
//        2.ADD SETTINGS FILE TO .M2 FOLDER
//        UNDER USER FOLDER
//        3.MAVEN COMPILER PLUG IN TO RIGHT JAVA VERSION 1.8 OR SO
//        IN POM FILE PLUG IN SECTION
//<plugin>
//<groupId>org.apache.maven.plugins</groupId>
//<artifactId>maven-compiler-plugin</artifactId>
//<version>3.8.1</version>
//<configuration>
//<source>1.8</source>
//<target>1.8</target>
//</configuration>
//</plugin>