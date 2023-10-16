import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

if (!(GlobalVariable.isLoggedIn)) {
    WebUI.callTestCase(findTestCase('Login and Logout/Login'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('Create Units/Units Navigation Link'))

WebUI.click(findTestObject('Create Units/Create Unit (Start Button)'))

WebUI.click(findTestObject('Create Units/Security Force Dropdown'))

WebUI.click(findTestObject('Common/SNA dropdown option'))

WebUI.click(findTestObject('Create Units/Sector Division Dropdown'))

WebUI.click(findTestObject('Create Units/Gorgor Division Option'))

Timestamp = CustomKeywords.'DateTimeUtility.getCurrentDateTime'('IST', '')

WebUI.sendKeys(findTestObject('Create Units/Unit Name Text Box'), Timestamp)

WebUI.click(findTestObject('Create Units/Lat and Long Selection Icon'))

