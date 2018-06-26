package cucumberJava; /**
 * Created by Ibermatica on 05/05/2017.
 */

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
//@Cucumber.Options(format = {"pretty", "html:target/cucumber","json:target/cucumber.json"})
@CucumberOptions(plugin  = {"html:target/cucumber-reports", "json:target/cucumber-reports.json" },tags = {"@login-ok"})
//@CucumberOptions(plugin  = {"html:target/cucumber-reports", "json:target/cucumber-reports.json"})


public class    runTest { }


