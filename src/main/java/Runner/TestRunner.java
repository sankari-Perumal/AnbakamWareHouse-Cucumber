package Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:/Users/SivaSankari/eclipse-workspace/Sample1/src/main/java/Features/"
		,glue={"C:/Users/SivaSankari/eclipse-workspace/Sample1/src/main/java/stepDefinitions"}
		)

public class TestRunner {
	

}
