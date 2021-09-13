package Testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,features="src/test/resources/feature",glue={"stepdef"},monochrome=true,plugin= {"pretty","html:target/HtmlReports",
		"junit:target/JunitReports/report.xml"},
//tags="@FetchStudentById")
tags="(@FetchStudentById or @FetchAllStudents)")
public class Testrunner {
	
}