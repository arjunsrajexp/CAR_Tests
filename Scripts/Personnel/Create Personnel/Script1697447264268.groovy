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

if (!(GlobalVariable.isLoggedIn)) {
    WebUI.callTestCase(findTestCase('Login and Logout/Login'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('Object Repository/Create Personnel/Personnel Navigation Link'))

Timestamp = CustomKeywords.'DateTimeUtility.getCurrentDateTime'('IST', '')

WebUI.click(findTestObject('Object Repository/Create Personnel/Create Personnel (Start) Button'))

WebUI.click(findTestObject('Object Repository/Create Personnel/Security Force Dropdown'))

WebUI.click(findTestObject('Object Repository/Common/SPF dropdown option'))

WebUI.click(findTestObject('Object Repository/Create Personnel/Division'))

WebUI.click(findTestObject('Create Personnel/Division 1st Option'))

WebUI.click(findTestObject('Object Repository/Create Personnel/Unit'))

WebUI.click(findTestObject('Object Repository/Create Personnel/Unit dropdown 1st value'))

WebUI.setText(findTestObject('Object Repository/Create Personnel/First Name Text Box'), 'Test')

WebUI.setText(findTestObject('Object Repository/Create Personnel/Middle Name Text Box'), 'Automation')

WebUI.setText(findTestObject('Object Repository/Create Personnel/Last Name Text Box'), Timestamp)

WebUI.setText(findTestObject('Create Personnel/Forces ID Number Text Box'), 'FID001')

WebUI.setText(findTestObject('Create Personnel/Forces AP Number Text Box'), 'FAP001')

WebUI.setText(findTestObject('Create Personnel/Biometric Reg No Text Box'), 'BMI001')

WebUI.setText(findTestObject('Object Repository/Create Personnel/Telephone Number Text Box'), '456 127 876')

WebUI.click(findTestObject('Object Repository/Create Personnel/Rank'))

WebUI.click(findTestObject('Object Repository/Create Personnel/li_KL'))

CustomKeywords.'uploadFiles.uploadFile'(findTestObject('Create Personnel/Image_Upload'), 'C:\\Users\\arjun.s\\Desktop\\Test Images\\AK-47, 4839351-5.jpg')

WebUI.setText(findTestObject('Create Personnel/Responsible Person Name Box'), 'Test Guranator')

WebUI.setText(findTestObject('Create Personnel/Responsible Person Phone Box'), '123 456 789')

WebUI.setText(findTestObject('Create Personnel/Notes Box'), 'Test Note')

WebUI.click(findTestObject('Object Repository/Create Personnel/Create Personnel (Finish) Button'))

WebUI.verifyElementText(findTestObject('Object Repository/Create Personnel/Personnel Creation Confirmation Message'), 'Personnel added successfully!')

WebUI.click(findTestObject('Create Personnel/Create Another Cancel Button'))

WebUI.verifyElementNotPresent(findTestObject('Create Personnel/Something Went Wrong Toast'), 30)

if (!(GlobalVariable.RuninSuite)) {
    WebUI.closeBrowser()
}

