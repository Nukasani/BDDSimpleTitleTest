package tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"C:\\Users\\user\\Desktop\\apitestingworkSpace\\BDDGoogleSimpleTitleTest\\src\\test\\resources\\featurefiles\\features1.feature"},
		glue= {"gluecode"},
		monochrome=true,
		plugin= {"pretty","html:target\\res1"}
		)
public class Runner1
{
}
