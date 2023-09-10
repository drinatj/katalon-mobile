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

Mobile.tap(findTestObject('Object Repository/Help/Payment/btn_Payment'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Help/Payment/txt_Solomerce will send information on the number of total expenditures and postage to your email address, for details please check your email'), 
    0)

Mobile.verifyElementText(findTestObject('Help/Payment/txt_Solomerce will send information on the number of total expenditures and postage to your email address, for details please check your email'), 
    'Solomerce will send information on the number of total expenditures and postage to your email address, for details please check your email!')

Mobile.verifyElementText(findTestObject('Object Repository/Help/Payment/txt_Payment can be made by transfer to'), 'Payment can be made by transfer to :')

Mobile.verifyElementText(findTestObject('Object Repository/Help/Payment/txt_PayPal'), 'PayPal')

Mobile.verifyElementText(findTestObject('Object Repository/Help/Payment/txt_E-Mail  dimas.yanpradiptagmail.com'), 'E-Mail : dimas.yanpradipta@gmail.com')

Mobile.verifyElementText(findTestObject('Object Repository/Help/Payment/txt_BANK BCA'), 'BANK BCA')

Mobile.verifyElementText(findTestObject('Object Repository/Help/Payment/txt_Account Number  12345678'), 'Account Number : 12345678')

Mobile.verifyElementText(findTestObject('Object Repository/Help/Payment/txt_Account Name  Solodroid Developer'), 'Account Name : Solodroid Developer')

Mobile.verifyElementText(findTestObject('Object Repository/Help/Payment/txt_BANK MANDIRI'), 'BANK MANDIRI')

Mobile.verifyElementText(findTestObject('Object Repository/Help/Payment/txt_Account Number  12345678 (1)'), 'Account Number : 12345678')

Mobile.verifyElementText(findTestObject('Object Repository/Help/Payment/txt_Account Name  Solodroid Developer (1)'), 'Account Name : Solodroid Developer')

Mobile.verifyElementText(findTestObject('Object Repository/Help/Payment/txt_BANK BRI'), 'BANK BRI')

Mobile.verifyElementText(findTestObject('Object Repository/Help/Payment/txt_Account Number  12345678 (2)'), 'Account Number : 12345678')

Mobile.verifyElementText(findTestObject('Object Repository/Help/Payment/txt_Account Name  Solodroid Developer (2)'), 'Account Name : Solodroid Developer')

Mobile.verifyElementText(findTestObject('Object Repository/Help/Payment/txt_BANK BNI'), 'BANK BNI')

Mobile.verifyElementText(findTestObject('Object Repository/Help/Payment/txt_Account Number  12345678 (3)'), 'Account Number : 12345678')

Mobile.verifyElementText(findTestObject('Object Repository/Help/Payment/txt_Account Name  Solodroid Developer (3)'), 'Account Name : Solodroid Developer')

Mobile.verifyElementText(findTestObject('Object Repository/Help/Payment/txt_Please note'), 'Please note :')

Mobile.verifyElementText(findTestObject('Object Repository/Help/Payment/txt_Transfer between accounts BCA, Mandiri, BNI and BRI, is a way of sending money the fastest we have received and to be confirmed soon'), 
    'Transfer between accounts BCA, Mandiri, BNI and BRI, is a way of sending money the fastest we have received and to be confirmed soon')

Mobile.tap(findTestObject('Help/btn_Back'), 0)

Mobile.closeApplication()

