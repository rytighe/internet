package net.rytighe.internet;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions
(
	format = {"pretty", "html:target/cucumber-html-report"},
	features = { "classpath:net/rytighe/internet/features"},
	glue = {"net.rytighe.internet.definitions"}
) 
public class RunnerTest { }
