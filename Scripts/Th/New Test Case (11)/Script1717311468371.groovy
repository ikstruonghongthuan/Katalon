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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com.vn/?hl=vi')

WebUI.click(findTestObject('Object Repository/Thuan/Page_Google/a_Hnh nh'))

WebUI.click(findTestObject('Object Repository/Thuan/Page_Google Hnh nh/span_hnh nh_ly0Ckb'))

WebUI.click(findTestObject('Object Repository/Thuan/Page_Google Hnh nh/div_qwertyuiop'))

WebUI.click(findTestObject('Object Repository/Thuan/Page_Google Hnh nh/button_e'))

WebUI.click(findTestObject('Object Repository/Thuan/Page_Google Hnh nh/button_r'))

WebUI.click(findTestObject('Object Repository/Thuan/Page_Google Hnh nh/span_t'))

WebUI.click(findTestObject('Object Repository/Thuan/Page_Google Hnh nh/button_y'))

WebUI.click(findTestObject('Object Repository/Thuan/Page_Google Hnh nh/span_u'))

WebUI.click(findTestObject('Object Repository/Thuan/Page_Google Hnh nh/span_r'))

WebUI.click(findTestObject('Object Repository/Thuan/Page_Google Hnh nh/span_t'))

WebUI.click(findTestObject('Object Repository/Thuan/Page_Google Hnh nh/button_u'))

WebUI.click(findTestObject('Object Repository/Thuan/Page_Google Hnh nh/button_4'))

WebUI.click(findTestObject('Object Repository/Thuan/Page_Google Hnh nh/div_1234567890-'))

WebUI.doubleClick(findTestObject('Object Repository/Thuan/Page_Google Hnh nh/button_q'))

WebUI.click(findTestObject('Object Repository/Thuan/Page_Google Hnh nh/button_q'))

WebUI.click(findTestObject('Object Repository/Thuan/Page_Google Hnh nh/button_q'))

WebUI.doubleClick(findTestObject('Object Repository/Thuan/Page_Google Hnh nh/div_zxcvbnm,'))

WebUI.click(findTestObject('Object Repository/Thuan/Page_Google Hnh nh/button_concat(, , )_K16'))

WebUI.click(findTestObject('Object Repository/Thuan/Page_Google Hnh nh/div_Ting Vit Telex_vk-t-btn ita-kd-img vk-s_94cfdb'))

WebUI.click(findTestObject('Object Repository/Thuan/Page_Google Hnh nh/svg'))

WebUI.setText(findTestObject('Object Repository/Thuan/Page_Google Hnh nh/textarea_hnh nh_q'), 'zzxcsds')

WebUI.click(findTestObject('Object Repository/Thuan/Page_Google Hnh nh/svg'))

WebUI.click(findTestObject('Object Repository/Thuan/Page_zzxcsds - Tm trn Google/span_Ddos attacks'))

WebUI.closeBrowser()

