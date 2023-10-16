import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

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

