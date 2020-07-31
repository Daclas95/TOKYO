package sample;


import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

public class IncommingSample extends TestBase {
    public SoftAssert softAssert;

    @Test(groups = {"smoke"})
    public void CustomerTest() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");           //Samlemenu
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]");                            //IncommingSampleBtn
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]"); //AddPIncommingSampleBt
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"supplierCategory\"]/div");               //SuplierCatageryDrop
        MethodBase.hitEnter();
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"supplierName\"]/div");               //SuplierDrop
        MethodBase.hitEnter();
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"rawMaterialId\"]/div");               //RawmaterialDrop
        MethodBase.hitEnter();
        MethodBase.setText_ByXpath("//*[@id=\"vehicleNo\"]", "VehicleNo");                                 //VehicleNoTxt

        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div");               //PlantDrop
        MethodBase.hitEnter();
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[6]/div/div[2]/div/div[2]/div[3]/button[2]");                          //SaveBtn



    }
}
