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

Mobile.startApplication('/Users/fendrinayoarbarutjitra/Katalon Studio/Katalon-Mobile/APK/Solodroid_E-CommerceApp Demo_3.2.0.apk', 
    true)

Mobile.verifyElementVisible(findTestObject('Object Repository/Help/txt_Help'), 0)

Mobile.tap(findTestObject('Help/txt_Help'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Help/txt_How to order'), 0)

Mobile.verifyElementText(findTestObject('Help/txt_How to order'), 'How to order')

Mobile.verifyElementText(findTestObject('Object Repository/Help/txt_Payment'), 'Payment')

Mobile.verifyElementText(findTestObject('Object Repository/Help/txt_Shipping'), 'Shipping')

Mobile.verifyElementText(findTestObject('Object Repository/Help/txt_Profile'), 'Profile')

Mobile.verifyElementText(findTestObject('Object Repository/Help/txt_Contact us'), 'Contact us')

Mobile.tap(findTestObject('Object Repository/Help/btn_How to order'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Help/How to Order/txt_Header How to order'), 'How to order')

Mobile.verifyElementText(findTestObject('Object Repository/Help/How to Order/txt_How To Shop At Solomerce Apps'), 
    'How To Shop At Solomerce Apps :')

Mobile.verifyElementText(findTestObject('Object Repository/Help/How to Order/txt_Shopping through the shopping cart, select the items that will be purchased in accordance with your wishes'), 
    'Shopping through the shopping cart, select the items that will be purchased in accordance with your wishes.')

Mobile.verifyElementText(findTestObject('Object Repository/Help/How to Order/txt_Continue by filling the form e-mail with details of the total price'), 
    'Continue by filling the form e-mail with details of the total price.')

Mobile.verifyElementText(findTestObject('Object Repository/Help/How to Order/txt_Upon confirmation from us, please send transfer payment to one of the following bank account'), 
    'Upon confirmation from us, please send / transfer payment to one of the following bank account')

Mobile.verifyElementText(findTestObject('Object Repository/Help/How to Order/txt_We only accept cash payments by wire transfer to a bank account'), 
    'We only accept cash payments by wire transfer to a bank account.')

Mobile.tap(findTestObject('Object Repository/Help/btn_Back'), 0)

