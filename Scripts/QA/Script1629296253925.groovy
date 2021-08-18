import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://qainterview.pythonanywhere.com/')

WebUI.setText(findTestObject('Object Repository/Page_Factoriall/input_The greatest factorial calculator_number'), '2')

WebUI.click(findTestObject('Object Repository/Page_Factoriall/button_Calculate'))

WebUI.setText(findTestObject('Object Repository/Page_Factoriall/input_The greatest factorial calculator_number'), '7')

WebUI.click(findTestObject('Object Repository/Page_Factoriall/button_Calculate'))

WebUI.setText(findTestObject('Object Repository/Page_Factoriall/input_The greatest factorial calculator_number'), '14')

WebUI.click(findTestObject('Object Repository/Page_Factoriall/button_Calculate'))

WebUI.setText(findTestObject('Object Repository/Page_Factoriall/input_The greatest factorial calculator_number'), '26')

WebUI.click(findTestObject('Object Repository/Page_Factoriall/button_Calculate'))

WebUI.setText(findTestObject('Object Repository/Page_Factoriall/input_The greatest factorial calculator_number'), '97')

WebUI.click(findTestObject('Object Repository/Page_Factoriall/button_Calculate'))

WebUI.setText(findTestObject('Object Repository/Page_Factoriall/input_The greatest factorial calculator_number'), '130')

WebUI.click(findTestObject('Object Repository/Page_Factoriall/button_Calculate'))

WebUI.setText(findTestObject('Object Repository/Page_Factoriall/input_The greatest factorial calculator_number'), '980')

WebUI.click(findTestObject('Object Repository/Page_Factoriall/button_Calculate'))

WebUI.setText(findTestObject('Object Repository/Page_Factoriall/input_The greatest factorial calculator_number'), '990')

WebUI.click(findTestObject('Object Repository/Page_Factoriall/button_Calculate'))

WebUI.click(findTestObject('Object Repository/Page_Factoriall/button_Calculate'))

WebUI.setText(findTestObject('Object Repository/Page_Factoriall/input_The greatest factorial calculator_number'), '1000')

WebUI.click(findTestObject('Object Repository/Page_Factoriall/button_Calculate'))

WebUI.click(findTestObject('Object Repository/Page_Factoriall/button_Calculate'))

WebUI.setText(findTestObject('Object Repository/Page_Factoriall/input_The greatest factorial calculator_number'), '222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222')

WebUI.click(findTestObject('Object Repository/Page_Factoriall/button_Calculate'))

WebUI.setText(findTestObject('Object Repository/Page_Factoriall/input_The greatest factorial calculator_number'), '0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000')

WebUI.click(findTestObject('Object Repository/Page_Factoriall/button_Calculate'))

WebUI.click(findTestObject('Object Repository/Page_Factoriall/a_Terms and Conditions'))

WebUI.click(findTestObject('Object Repository/Page_Factoriall/a_Privacy'))

WebUI.click(findTestObject('Object Repository/Page_Factoriall/a_Qxf2 Services'))

WebUI.setText(findTestObject('Object Repository/Page_Factoriall/input_The greatest factorial calculator_number'), '-2')

WebUI.click(findTestObject('Object Repository/Page_Factoriall/button_Calculate'))

WebUI.setText(findTestObject('Object Repository/Page_Factoriall/input_The greatest factorial calculator_number'), '3.7')

WebUI.click(findTestObject('Object Repository/Page_Factoriall/button_Calculate'))

WebUI.click(findTestObject('Object Repository/Page_Factoriall/body_The greatest factorial calculator     _1937cd'))

