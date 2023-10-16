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

WebUI.callTestCase(findTestCase('Login and Logout/Login'), [('username') : '', ('password') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_IMS/span_Ammunition'))

WebUI.click(findTestObject('Object Repository/Page_IMS/button_PlusCreate Ammunition'))

WebUI.click(findTestObject('Object Repository/Page_IMS/body_You need to enable JavaScript to run t_53a095'))

WebUI.click(findTestObject('Object Repository/Page_IMS/li_Small Arms Ammunition'))

WebUI.click(findTestObject('Object Repository/Page_IMS/button_Quality Assurance'))

WebUI.click(findTestObject('Object Repository/Page_IMS/svg_Quality Assurance_MuiSvgIcon-root MuiSv_5f9b6f'))

WebUI.click(findTestObject('Object Repository/Page_IMS/body_You need to enable JavaScript to run t_53a095_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_IMS/li_ADCOM Manufacturing Ltd'), 'ADCOM Manufacturing Ltd.')

