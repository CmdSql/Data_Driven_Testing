import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demoaut.katalon.com/')

WebUI.click(findTestObject('Data Driven Testing 1/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Data Driven Testing 1/Page_CURA Healthcare Service/input_username'), Username)

WebUI.setText(findTestObject('Data Driven Testing 1/Page_CURA Healthcare Service/input_password'), Password)

WebUI.click(findTestObject('Data Driven Testing 1/Page_CURA Healthcare Service/button_Login'))

WebUI.setText(findTestObject('Data Driven Testing 1/Page_CURA Healthcare Service/input_visit_date'), '08/03/2018')

WebUI.setText(findTestObject('Data Driven Testing 1/Page_CURA Healthcare Service/textarea_comment'), 'Data driven test')

WebUI.setText(findTestObject('Data Driven Testing 1/Page_CURA Healthcare Service/textarea_comment'), 'Data driven testing 1')

WebUI.click(findTestObject('Data Driven Testing 1/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.closeBrowser()

