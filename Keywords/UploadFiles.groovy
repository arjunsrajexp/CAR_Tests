

import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Used when "Upload File" or "Send Keys" will not work
public class uploadFiles {
	@Keyword
	def uploadFile (TestObject to, String filePath) {
		WebUI.click(to)
		StringSelection ss = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(1000) //NOTE THE DELAY (500, 1000, 1500 MIGHT WORK FOR YOU)
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(1000) //NOTE THE DELAY (500, 1000, 1500 MIGHT WORK FOR YOU)
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}