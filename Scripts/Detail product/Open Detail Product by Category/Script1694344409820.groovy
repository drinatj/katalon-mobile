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

Mobile.verifyElementText(findTestObject('Object Repository/Detail Product by Category/txt_Category'), 'Category')

Mobile.tap(findTestObject('Detail Product by Category/txt_Category'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Detail Product by Category/txt_Fashions'), 0)

Mobile.tap(findTestObject('Detail Product by Category/txt_Fashions'), 0)

Mobile.verifyElementText(findTestObject('Detail Product by Category/txtDisplay_Dolce and Gabbana Heels'), 'Dolce and Gabbana Heels')

Mobile.verifyElementText(findTestObject('Object Repository/Detail Product by Category/txtDisplay_100 USD'), '100 USD')

Mobile.tap(findTestObject('Detail Product by Category/txtDisplay_Dolce and Gabbana Heels'), 0)

Mobile.verifyElementVisible(findTestObject('Detail Product by Category/Image_View'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Detail Product by Category/txtDetail_Dolce and Gabbana Heels'), 
    'Dolce and Gabbana Heels')

Mobile.verifyElementText(findTestObject('Detail Product by Category/txtDisplay_100 USD'), '100 USD')

Mobile.verifyElementVisible(findTestObject('Checkout/btn_Add To Cart'), 0)

Mobile.closeApplication()

