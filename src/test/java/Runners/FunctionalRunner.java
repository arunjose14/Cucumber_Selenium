package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Features/Register.feature",glue="Utils",monochrome=true,
plugin={ "html:target/Report.html"},
tags="@arun")

public class FunctionalRunner extends AbstractTestNGCucumberTests{

}
