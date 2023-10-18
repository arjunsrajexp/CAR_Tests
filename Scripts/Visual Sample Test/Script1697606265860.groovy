import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.openBrowser('')

WebUI.navigateToUrl('https://app.qa.ims.experionglobal.dev/login')

WebUI.click(findTestObject('Object Repository/Home Page/Login with Google Button'))

WebUI.setText(findTestObject('Object Repository/Google Authentication Page/Username Box'), 'superadmintestusercar@experionglobal.dev')

WebUI.click(findTestObject('Google Authentication Page/Next Button'))

WebUI.setEncryptedText(findTestObject('Object Repository/Google Authentication Page/Password Box'), '7326p5kcqg39Yf9y5Lk4nA==')

WebUI.click(findTestObject('Object Repository/Google Authentication Page/Next Button'))

WebUI.verifyElementText(findTestObject('Object Repository/Home Page/First Navigation Item'), 'Home')

if (WebUI.verifyElementText(findTestObject('Object Repository/Home Page/First Navigation Item'), 'Home')) {
    GlobalVariable.isLoggedIn = true
}

WebUI.maximizeWindow()

WebUI.takeScreenshotAsCheckpoint('HomePage')

