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

Mobile.verifyElementText(findTestObject('Checkout/txtDisplay_Samsung Galaxy S10 - Black'), 'Samsung Galaxy S10 - Black')

Mobile.verifyElementText(findTestObject('Object Repository/Checkout/txtDisplay_899 USD'), '899 USD')

Mobile.tap(findTestObject('Checkout/txtDisplay_Samsung Galaxy S10 - Black'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Checkout/txtDetail_Samsung Galaxy S10 - Black'), 0)

Mobile.verifyElementText(findTestObject('Checkout/txtDetail_Samsung Galaxy S10 - Black'), 'Samsung Galaxy S10 - Black')

Mobile.verifyElementText(findTestObject('Object Repository/Checkout/txtDetail_899 USD'), '899 USD')

Mobile.verifyElementVisible(findTestObject('Object Repository/Checkout/btn_Add To Cart'), 0)

Mobile.closeApplication()

