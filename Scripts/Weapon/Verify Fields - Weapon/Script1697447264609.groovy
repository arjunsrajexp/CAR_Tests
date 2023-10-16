import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import org.openqa.selenium.Keys as Keys

if (!(GlobalVariable.isLoggedIn)) {
    WebUI.callTestCase(findTestCase('Login and Logout/Login'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('Weapon Create/Weapons Navigation Link'))

not_run: WebUI.click(findTestObject('Weapon Create/Create Weapon (Start) Button'))

not_run: WebUI.click(findTestObject('Weapon Create/Basic Details Locators/Weapon Status Dropdown'))

not_run: WebUI.verifyTextPresent('Issued', false)

not_run: WebUI.verifyTextPresent('Stored', false)

not_run: WebUI.verifyTextNotPresent('Destroyed', false)

not_run: WebUI.verifyTextNotPresent('Lost', false)

not_run: WebUI.verifyTextNotPresent('Marked to destroy', false)

not_run: WebUI.verifyTextNotPresent('Reclaimed by Clan', false)

not_run: WebUI.verifyTextNotPresent('Sold', false)

not_run: WebUI.verifyTextNotPresent('Unknown', false)

not_run: WebUI.refresh()

not_run: WebUI.click(findTestObject('Weapon Create/Basic Details Locators/Weapon Type Dropdown'))

not_run: WebUI.verifyTextPresent('AK-47', false)

not_run: WebUI.verifyTextPresent('Bistoolad', false)

not_run: WebUI.verifyTextPresent('Dhashiike', false)

not_run: WebUI.verifyTextPresent('G3', false)

not_run: WebUI.verifyTextPresent('Other', false)

not_run: WebUI.verifyTextPresent('PKM', false)

not_run: WebUI.verifyTextPresent('RPD', false)

not_run: WebUI.verifyTextPresent('RPG', false)

not_run: WebUI.verifyTextPresent('Tokarev', false)

not_run: WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Weapon Create/Basic Details Locators/Weapon Calibre Dropdown'))

not_run: WebUI.verifyTextPresent('7.62 x 25 mm', false)

not_run: WebUI.verifyTextPresent('7.62 x 39 mm', false)

not_run: WebUI.verifyTextPresent('7.62 x 51 mm', false)

not_run: WebUI.verifyTextPresent('7.62 x 54R mm', false)

not_run: WebUI.verifyTextPresent('9 x 18 mm', false)

not_run: WebUI.verifyTextPresent('9 x 19 mm', false)

not_run: WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Weapon Create/Basic Details Locators/Weapon Condition Dropdown'))

not_run: WebUI.verifyTextPresent('Serviceable', false)

not_run: WebUI.verifyTextPresent('Unserviceable', false)

not_run: WebUI.refresh()

not_run: WebUI.click(findTestObject('Weapon Create/Basic Details Locators/Is Serial No Available Dropdown'))

not_run: WebUI.verifyTextPresent('Yes', false)

not_run: WebUI.verifyTextPresent('No', false)

not_run: WebUI.click(findTestObject('Weapon Create/Basic Details Locators/Dropdown Choice - Yes'))

not_run: WebUI.verifyElementPresent(findTestObject('Weapon Create/Basic Details Locators/Enter Serial Number Text Box'), 
    30)

not_run: WebUI.click(findTestObject('Weapon Create/Basic Details Locators/Is Serial No Available Dropdown'))

not_run: WebUI.click(findTestObject('Weapon Create/Basic Details Locators/Dropdown Choice -No'))

not_run: WebUI.verifyElementNotPresent(findTestObject('Weapon Create/Basic Details Locators/Enter Serial Number Text Box'), 
    30)

not_run: WebUI.click(findTestObject('Weapon Create/Basic Details Locators/Is Govt User Mark Available Dropdown'))

not_run: WebUI.click(findTestObject('Weapon Create/Basic Details Locators/Dropdown Choice - Yes'))

not_run: WebUI.verifyElementPresent(findTestObject('Weapon Create/Basic Details Locators/Govt User Mark Text Box'), 30)

not_run: WebUI.click(findTestObject('Weapon Create/Basic Details Locators/Is Govt User Mark Available Dropdown'))

not_run: WebUI.click(findTestObject('Weapon Create/Basic Details Locators/Dropdown Choice -No'))

not_run: WebUI.verifyElementNotPresent(findTestObject('Weapon Create/Basic Details Locators/Govt User Mark Text Box'), 30)

not_run: WebUI.click(findTestObject('Weapon Create/Basic Details Locators/Weapon Ownership dropdown'))

