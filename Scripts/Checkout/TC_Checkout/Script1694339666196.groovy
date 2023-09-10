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

Mobile.waitForElementPresent(findTestObject('Object Repository/Checkout/txtDisplay_Samsung Galaxy S10 - Black'), 0)

Mobile.verifyElementText(findTestObject('Checkout/txtDisplay_Samsung Galaxy S10 - Black'), 'Samsung Galaxy S10 - Black')

Mobile.verifyElementText(findTestObject('Object Repository/Checkout/txtDisplay_899 USD'), '899 USD')

Mobile.tap(findTestObject('Checkout/txtDisplay_Samsung Galaxy S10 - Black'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Checkout/txtDetail_Samsung Galaxy S10 - Black'), 0)

Mobile.verifyElementText(findTestObject('Checkout/txtDetail_Samsung Galaxy S10 - Black'), 'Samsung Galaxy S10 - Black')

Mobile.verifyElementText(findTestObject('Object Repository/Checkout/txtDetail_899 USD'), '899 USD')

Mobile.verifyElementText(findTestObject('Object Repository/Checkout/btn_Add To Cart'), 'ADD TO CART')

Mobile.tap(findTestObject('Checkout/btn_Add To Cart'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Checkout/txt_Number of order'), 'Number of order :')

Mobile.verifyElementVisible(findTestObject('Object Repository/Checkout/input_EditText'), 0)

Mobile.verifyElementText(findTestObject('Checkout/btn_Cancel'), 'CANCEL')

Mobile.verifyElementText(findTestObject('Checkout/btn_Add'), 'ADD')

Mobile.setText(findTestObject('Checkout/input_EditText'), '1', 0)

Mobile.tap(findTestObject('Checkout/btn_ADD'), 0)

Mobile.tap(findTestObject('Object Repository/Checkout/btn_Cart'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Checkout/img_Cart'), 0)

Mobile.verifyElementText(findTestObject('Checkout/txtDetail_Samsung Galaxy S10 - Black'), 'Samsung Galaxy S10 - Black')

Mobile.verifyElementText(findTestObject('Object Repository/Checkout/txt_899 USD x 1'), '899 USD x 1')

Mobile.verifyElementText(findTestObject('Object Repository/Checkout/txt_Price Cart 899 USD'), '899 USD')

Mobile.verifyElementVisible(findTestObject('Checkout/btn_Checkout'), 0)

Mobile.tap(findTestObject('Checkout/btn_Checkout'), 0)

Mobile.setText(findTestObject('Object Repository/Checkout/input_Name'), 'drina', 0)

Mobile.setText(findTestObject('Object Repository/Checkout/input_Email'), 'drina@gmail.com', 0)

Mobile.setText(findTestObject('Object Repository/Checkout/input_Phone Number'), '0897654321', 0)

Mobile.setText(findTestObject('Object Repository/Checkout/input_Address'), 'Jl. Suka automation', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Checkout/input_Order Detail'), '1 Samsung Galaxy S10 - Black 899 USD,\n\nOrder : 899 USD\nTax : 10 % : 90 USD\nTotal : 989 USD', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/Checkout/btn_Process Checkout'), 0)

Mobile.tap(findTestObject('Checkout/btn_Process Checkout'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Checkout/txt_Process Checkout'), 'Process Checkout')

Mobile.verifyElementText(findTestObject('Object Repository/Checkout/txt_Are you sure want to checkout'), 'Are you sure want to checkout?')

Mobile.verifyElementText(findTestObject('Checkout/btn_No'), 'NO')

Mobile.verifyElementText(findTestObject('Object Repository/Checkout/btn_Yes'), 'YES')

Mobile.tap(findTestObject('Checkout/btn_Yes'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Checkout/txt_Congratulation'), 'Congratulation')

Mobile.verifyElementText(findTestObject('Checkout/btn_Ok'), 'OK')

Mobile.tap(findTestObject('Checkout/btn_Ok'), 0)

