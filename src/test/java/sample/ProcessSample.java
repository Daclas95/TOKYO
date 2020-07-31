package sample;


import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

public class ProcessSample extends TestBase {
    public SoftAssert softAssert;

    @Test(groups = {"smoke"})
    public void CustomerTest() throws Exception {
        softAssert = new SoftAssert();
        PageBase.staticWait(03);
        softAssert.assertTrue(MethodBase.isDisplayed_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[4]"), "Dashboard is not Displayed");
        PageBase.staticWait(03);

        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");           //Samlemenu

        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");                            //ProcessingSampleBtn

        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button"); //AddProcessingingSampleBt

        MethodBase.setText_ByXpath("//*[@id=\"processSample_code\"]", "JF001");                                 //CodeTxt

//        PageBase.staticWait(03);
//        MethodBase.click_ByXpath("//*[@id=\"incoming_sample_id\"]/div");//IncommingSampleDrop
//        MethodBase.hitEnter();
        PageBase.staticWait(05);
        MethodBase.click_ByXpath("//*[@id=\"incoming_sample_id\"]/div/div");
        PageBase.staticWait(05);
        MethodBase.setText_ByXpath("//*[@id=\"incoming_sample_id\"]/div/div","Sample");// Incoming Sample

        MethodBase.setText_ByXpath("//*[@id=\"processSample_quantity\"]", "07");                                 //QuantityTxt

//        PageBase.staticWait(03);
//        MethodBase.click_ByXpath("//*[@id=\"unit_id\"]/div");               //UnitDrop
//        MethodBase.hitEnter();

        MethodBase.setText_ByXpath("//*[@id=\"unit_id\"]/div/div","G");// Unit
        PageBase.staticWait(3);

        PageBase.staticWait(05);
        MethodBase.click_ByXpath("/html/body/div[6]/div/div[2]/div/div[2]/div[3]/button[2]");  // Submit Button
        PageBase.staticWait(05);



    }
}
