import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Gist QA scenarios')

suiteProperties.put('name', 'Gist QA scenarios')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\user1\\Katalon Studio\\Gist QA scenarios\\Reports\\Gist QA scenarios\\20190522_230949\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Gist QA scenarios', suiteProperties, [new TestCaseBinding('Test Cases/Sign Up', 'Test Cases/Sign Up',  null), new TestCaseBinding('Test Cases/CreateGist', 'Test Cases/CreateGist',  null), new TestCaseBinding('Test Cases/SeeMyGist', 'Test Cases/SeeMyGist',  null), new TestCaseBinding('Test Cases/Edit Gist', 'Test Cases/Edit Gist',  null), new TestCaseBinding('Test Cases/Delete Gist', 'Test Cases/Delete Gist',  null)])
