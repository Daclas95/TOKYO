package com.test.qa.tokyo.DisplayDashboard.testconfiguration.parameterNV;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utils.MethodBase;
import utils.PageBase;

import static java.awt.event.KeyEvent.VK_ENTER;

public class ParameterM extends PageBase {

    private static String TestConfig = ("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");
    private static String ParameterMenu = ("//*[@id=\"root\"]/div/section/section/header/ul/li[11]");

    private static String ParameterField = ("//*[@id=\"root\"]/div/section/section/header/ul/li[7]/a");
    private static String AddParameter = ("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");
    private static String TxtParameter = ("parameter_name");
    private static String ParameterType = ("//*[@id=\" parameterType\"]/div/div");
    private static String Days = ("days");
    private static String btnSave = ("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]");

    public static void clickTestConfig() {
        MethodBase.isDisplayed_ByXpath(TestConfig);
        MethodBase.click_ByXpath(TestConfig);
    }

    public static void clickParameterMenu() {
        MethodBase.isDisplayed_ByXpath(ParameterMenu);
        MethodBase.click_ByXpath(ParameterMenu);
    }

    public static void clickParameterField() {
        MethodBase.isDisplayed_ByXpath(ParameterField);
        MethodBase.click_ByXpath(ParameterField);
    }

    public static void clickAddParameter() {
        MethodBase.isDisplayed_ByXpath(AddParameter);
        MethodBase.click_ByXpath(AddParameter);
    }

    public static void setParameter() throws Exception {
        MethodBase.sendKeys(TxtParameter, "Weight of the pan Traill");
        MethodBase.click_ByXpath("//*[@id=\" parameterType\"]/div/div");
        PageBase.hitEnter();
    }

    public static void setDay(String day) {
        MethodBase.click_ById(Days);
    }

    public static void clickbtnSave() {

        MethodBase.click_ByXpath(btnSave);
    }
}







