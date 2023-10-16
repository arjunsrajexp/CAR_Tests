import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
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

if (!(GlobalVariable.isLoggedIn)) {
    WebUI.callTestCase(findTestCase('Login and Logout/Login'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('Object Repository/Create Personnel/Personnel Navigation Link'))

not_run: WebUI.refresh()

PersonnelNameList = WebUI.getText(findTestObject('View and Edit Personnel/First Personnel Name - List'))

WebUI.click(findTestObject('View and Edit Personnel/First Personnel view Button'))

PersonnelNameView = WebUI.getText(findTestObject('View and Edit Personnel/Personnel Name - View'))

WebUI.verifyEqual(PersonnelNameList, PersonnelNameView, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Common/Edit Button'))

WebUI.click(findTestObject('Create Personnel/Security Force Dropdown'))

WebUI.click(findTestObject('Common/SNA dropdown option'))

WebUI.click(findTestObject('Create Personnel/Division'))

WebUI.click(findTestObject('Create Personnel/Division 1st Option'))

WebUI.click(findTestObject('Create Personnel/Unit'))

WebUI.click(findTestObject('Create Personnel/Unit dropdown 1st value'))

WebUI.sendKeys(findTestObject('Create Personnel/First Name Text Box'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Create Personnel/First Name Text Box'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Create Personnel/First Name Text Box'), 'Test 1')

WebUI.sendKeys(findTestObject('Create Personnel/Middle Name Text Box'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Create Personnel/Middle Name Text Box'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Create Personnel/Middle Name Text Box'), 'Automation 1')

Timestamp = CustomKeywords.'DateTimeUtility.getCurrentDateTime'('IST', '')

WebUI.sendKeys(findTestObject('Create Personnel/Last Name Text Box'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Create Personnel/Last Name Text Box'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Create Personnel/Last Name Text Box'), Timestamp)

WebUI.sendKeys(findTestObject('Create Personnel/Forces ID Number Text Box'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Create Personnel/Forces ID Number Text Box'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Create Personnel/Forces ID Number Text Box'), 'FIDED001')

WebUI.sendKeys(findTestObject('Create Personnel/Forces AP Number Text Box'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Create Personnel/Forces AP Number Text Box'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Create Personnel/Forces AP Number Text Box'), 'FAPED001')

WebUI.sendKeys(findTestObject('Create Personnel/Biometric Reg No Text Box'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Create Personnel/Biometric Reg No Text Box'), Keys.chord(Keys.DELETE))

WebUI.click(findTestObject('Create Personnel/Rank'))

WebUI.click(findTestObject('Create Personnel/li_GDHE'))

WebUI.sendKeys(findTestObject('Create Personnel/Telephone Number'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Create Personnel/Telephone Number'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Create Personnel/Telephone Number'), '123667117')

WebUI.sendKeys(findTestObject('Create Personnel/Responsible Person Name Box'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Create Personnel/Responsible Person Name Box'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Create Personnel/Responsible Person Name Box'), 'Edited Gurantor')

WebUI.sendKeys(findTestObject('Create Personnel/Responsible Person Phone Box'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Create Personnel/Responsible Person Phone Box'), Keys.chord(Keys.DELETE))

WebUI.sendKeys(findTestObject('Create Personnel/Notes Box'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Create Personnel/Notes Box'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Create Personnel/Notes Box'), 'Test Note Edited')

CustomKeywords.'uploadFiles.uploadFile'(findTestObject('Create Personnel/Image_Upload'), 'C:\\Users\\arjun.s\\Desktop\\Test Images\\AK-47, 60008379-5.jpg')

WebUI.click(findTestObject('Common/Save Changes Button'))

WebUI.verifyElementPresent(findTestObject('View and Edit Personnel/Confirmation Pop up'), 30)

WebUI.click(findTestObject('Common/Yes Button'))

WebUI.verifyTextPresent('Personnel updated successfully', false)

if (!(GlobalVariable.RuninSuite)) {
    WebUI.closeBrowser()
}

