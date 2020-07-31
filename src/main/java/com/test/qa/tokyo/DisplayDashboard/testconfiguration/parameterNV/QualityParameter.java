package com.test.qa.tokyo.DisplayDashboard.testconfiguration.parameterNV;

import utils.MethodBase;
import utils.PageBase;

public class QualityParameter extends PageBase {
    private static String TestConfig = ("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");
    private static String ParameterMenu = ("//*[@id=\"root\"]/div/section/section/header/ul/li[7]/a");
    private static String QualityParameterField = ("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/div[1]");
    private static String AddQuaParameter = ("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");
    private static String TxtQuaPara = ("parameter_name");
    private static String MaterialSubCat = ("//*[@id=\"materialSubCategoryId\"]/div/div");
    private static String ButSave = ("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]");


    public static void clickTestConfig() {
        MethodBase.isDisplayed_ByXpath(TestConfig);
        MethodBase.click_ByXpath(TestConfig);
    }

    public static void clickParameterMenu() {
        MethodBase.isDisplayed_ByXpath(ParameterMenu);
        MethodBase.click_ByXpath(ParameterMenu);
    }

    public static void clickQualityParameterField() {
        MethodBase.isDisplayed_ByXpath(QualityParameterField);
        MethodBase.click_ByXpath(QualityParameterField);
    }

    public static void clickAddQuaParameter() {
        MethodBase.isDisplayed_ByXpath(AddQuaParameter);
        MethodBase.click_ByXpath(AddQuaParameter);
    }

    public static void setParameter() throws Exception {
        MethodBase.sendKeys(TxtQuaPara, "Weight of the pan Trail");
        MethodBase.click_ByXpath("//*[@id=\"materialSubCategoryId\"]/div/div");
        PageBase.hitEnter();
    }
    public static void clickbutnSave() {

        MethodBase.click_ByXpath(ButSave);
    }


}