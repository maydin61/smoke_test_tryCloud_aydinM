package com.project.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",

                "json:target/cucumber.json",


        },
        features = "src/test/resources/features",
        glue = "com/project/step_definitions",
        dryRun = false,
        tags = ""
)



public class CukesRunner {
}