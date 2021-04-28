package com.lotr.qa.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(
		features= {"src/test/resources/features"}
		,glue={"com.lotr.qa.test"}
		,plugin = {"pretty"}
		,tags = {"@UItest"}
	//	,dryRun = true									// if true it will check if the mapping between step definition and feature file is correct
		,monochrome = true)

public class TestRunner {}
