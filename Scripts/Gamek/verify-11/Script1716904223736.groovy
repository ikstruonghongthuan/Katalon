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

WebUI.openBrowser('https://genk.vn/')

WebUI.navigateToUrl('https://genk.vn/kham-pha.chn')

WebUI.click(findTestObject('Object Repository/gamek/Page_Khm ph khoa hc v cng ngh ton cu cp nht 247/a_B n v ngi cha g cao nht th gii, c xy dng _3a22eb'))

WebUI.selectOptionByValue(findTestObject('Object Repository/gamek/Page_B n v ngi cha g cao nht th gii, c xy d_f187c5/select_Ngy123456789101112131415161718192021_8e03e4'), 
    '28', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/gamek/Page_B n v ngi cha g cao nht th gii, c xy d_f187c5/select_ThngThng 1Thng 2Thng 3Thng 4Thng 5Th_e54b33'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/gamek/Page_B n v ngi cha g cao nht th gii, c xy d_f187c5/select_20242023202220212020'), 
    '2024', true)

WebUI.closeBrowser()

