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

//Mobile.startApplication('wigbubble.apk', true)
Mobile.startExistingApplication(GlobalVariable.APP_ID)

//Mobile.tap(findTestObject(''), 0)

//Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Create Here'), 0)

//Mobile.tap(findTestObject('Object Repository/android.widget.Button (2)'), 0)
Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - e.g. namemail.com'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - e.g. namemail.com (1)'), 'tester', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - e.g. janedoe'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - e.g. janedoe (1)'), 'tester timedoor', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Password'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Password (1)'), '1234 5678', 0)

Mobile.scrollToText('next')

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Confirm Password'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Confirm Password (1)'), '1234 5678', 0)

Mobile.scrollToText('email')

Mobile.scrollToText('create new account')

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - tester'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - tester (1)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - tester (1)'), 'tester@gmail.com', 0)

Mobile.scrollToText('next')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView -'), 0)

Mobile.scrollToText('create new account')

Mobile.hideKeyboard()

//Mobile.takeScreenshot('/var/folders/8h/ffqxqf5d67v83b9r4bsnypj80000gn/T/screenshot16879780430179041991.png')

Mobile.tap(findTestObject('Object Repository/android.widget.Button (2)'), 0)

Mobile.pressBack()

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (2)'), 0)

//Mobile.closeApplication()

