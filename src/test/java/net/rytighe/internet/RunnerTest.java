package net.rytighe.internet;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class) 
@CucumberOptions(
			format = {"pretty", "html:target/cucumber-html-report"},
			features = { "classpath:net/rytighe/cukes3/"},
			glue = {"net.rytighe.cukes3"}
			
			
		) 
public class RunnerTest { }
