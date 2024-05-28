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

WebUI.openBrowser('https://www.google.com.vn/')

WebUI.setText(findTestObject('Object Repository/gamek/Page_Google/textarea_ng nhp_q'), 'sổ xố kienses thiết')

WebUI.navigateToUrl('https://www.google.com.vn/search?q=s%E1%BB%95+x%E1%BB%91+kienses+thi%E1%BA%BFt&sca_esv=8a43c4591a19e45c&sca_upv=1&source=hp&ei=6d1VZsbAMfKovr0PmNmFoQ0&iflsig=AL9hbdgAAAAAZlXr-eqlfoyhtzDZP5qAILAhBBvEh3_K&udm=&ved=0ahUKEwiG2YPLu7CGAxVylK8BHZhsIdQQ4dUDCA0&uact=5&oq=s%E1%BB%95+x%E1%BB%91+kienses+thi%E1%BA%BFt&gs_lp=Egdnd3Mtd2l6Ihlz4buVIHjhu5Ega2llbnNlcyB0aGnhur90MgkQABiABBgKGA0yCBAAGBYYChgeMggQABgWGAoYHjIIEAAYFhgKGB4yCBAAGBYYChgeMggQABiiBBiJBUi3SlDjEligN3AReACQAQSYAasCoAHAF6oBBjcuMTEuNLgBA8gBAPgBAZgCIqACtg-oAgrCAgoQABgDGOoCGI8BwgIKEC4YAxjqAhiPAcICCxAAGIAEGLEDGIMBwgIREC4YgAQYsQMY0QMYgwEYxwHCAgUQABiABMICBRAuGIAEwgIIEAAYgAQYsQPCAg4QLhiABBixAxjHARivAcICBBAAGAPCAg0QABiABBixAxiDARgKwgIKEAAYgAQYsQMYCsICBxAAGIAEGArCAgYQABgDGAqYAwiSBwcyMy4xMC4xoAe9qgE&sclient=gws-wiz')

WebUI.closeBrowser()

