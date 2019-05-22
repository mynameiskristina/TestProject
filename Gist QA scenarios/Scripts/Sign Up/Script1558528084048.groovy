import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://github.com/')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Github/Homepage/input_Username_userlogin'), GlobalVariable.username)

WebUI.setText(findTestObject('Object Repository/Github/Homepage/input_Email_useremail'), GlobalVariable.email)

WebUI.setText(findTestObject('Object Repository/Github/Homepage/input_Password_userpassword'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Github/Homepage/button_Sign up for GitHub'))

WebUI.click(findTestObject('Github/Verify/Create Account button'))

'Please Verify the captcha'
WebUI.click(findTestObject('Object Repository/Github/Verify/canvas_Loading'))

'Please Verify the captcha'
WebUI.click(findTestObject('Object Repository/Github/Verify/canvas_Loading'))

'Please Verify the captcha'
WebUI.click(findTestObject('Object Repository/Github/Verify/canvas_Loading'))

'Please Verify the captcha'
WebUI.click(findTestObject('Object Repository/Github/Verify/canvas_Loading'))

WebUI.scrollToElement(findTestObject('Github/Join/button_Continue'), 0)

WebUI.click(findTestObject('Github/Join/button_Continue'))

WebUI.click(findTestObject('Object Repository/Github/Join/a_skip this step'))

'Please verify your account'
WebUI.delay(3)

WebUI.closeBrowser()

