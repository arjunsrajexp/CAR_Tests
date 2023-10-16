import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

if (!(GlobalVariable.isLoggedIn)) {
    WebUI.callTestCase(findTestCase('Login and Logout/Login'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('Object Repository/Create Personnel/Personnel Navigation Link'))

WebUI.click(findTestObject('Object Repository/Create Personnel/Create Personnel (Start) Button'))

WebUI.click(findTestObject('Object Repository/Create Personnel/Create Personnel (Finish) Button'))

WebUI.mouseOver(findTestObject('Object Repository/Create Personnel/Security Force Dropdown'))

WebUI.verifyTextPresent('Security force is required.', false)

WebUI.mouseOver(findTestObject('Create Personnel/Division'))

WebUI.verifyTextPresent('Sector/Division is required.', false)

WebUI.mouseOver(findTestObject('Create Personnel/Unit'))

WebUI.verifyTextPresent('Unit is required.', false)

WebUI.mouseOver(findTestObject('Create Personnel/First Name Text Box'))

WebUI.verifyTextPresent('First name is required.', false)

WebUI.mouseOver(findTestObject('Create Personnel/Last Name Text Box'))

WebUI.verifyTextPresent('Last name is required.', false)

WebUI.mouseOver(findTestObject('Create Personnel/Telephone Number'))

WebUI.verifyTextPresent('Telephone is required.', false)

WebUI.mouseOver(findTestObject('Create Personnel/Rank'))

WebUI.verifyTextPresent('Rank is required.', false)

WebUI.verifyElementPresent(findTestObject('Create Personnel/Profile Picture Required message'), 30)

if (!(GlobalVariable.RuninSuite)) {
	WebUI.closeBrowser()
}


