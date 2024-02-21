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

WebUI.navigateToUrl('https://www.saucedemo.com/')

CustomKeywords.'loginkeyword.Login.login'()

String actual_result = WebUI.getText(findTestObject('Object Repository/Page_Swag Labs/span_Products'))

WebUI.verifyMatch(actual_result, 'Products', false)

System.out.println(WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/span_Products'), 5))

//
//WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_user-name'))
//
//WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Accepted usernames arestandard_userlock_0d4679'))
//
//WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_user-name'), 'standard_user')
//
//WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Password for all userssecret_sauce'))
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_password'), 'qcu24s4901FyWDTwXGr6XA==')
//
//WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_login-button'))
//WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart'))
//
//WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart_1'))
//
//WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_2'))
//
//WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Checkout'))
//
//WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_firstName'), 'win')
//
//WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_lastName'), 'napit')
//
//WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_postalCode'), '123')
//
//WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Cancel_continue'))
//
//WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Finish'))
//
//WebUI.closeBrowser()

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/button_Remove'), 0)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/div_29.99'), 29.99)

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/button_Remove_1'), 0)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/div_9.99'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/a_2'), 2)

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/button_Remove'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/button_Remove_1'), 0)

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_firstName'), 'win')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_lastName'), 'napit')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_postalCode'), '122')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Cancel_continue'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Finish'))

String actual_result2 = WebUI.getText(findTestObject('Object Repository/Page_Swag Labs/span_Checkout Complete'))

WebUI.verifyMatch(actual_result2, 'Checkout: Complete!', false)

System.out.println(WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/span_Checkout Complete'), 5))


