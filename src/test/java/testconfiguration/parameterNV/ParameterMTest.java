package testconfiguration.parameterNV;

import com.test.qa.tokyo.DisplayDashboard.testconfiguration.parameterNV.ParameterM;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;


import java.util.logging.Logger;

public class ParameterMTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(ParameterMTest.class));

    @Test(groups = {"Smoke"}, priority = 1)
    public void ParameterTest() throws Exception {
        ParameterM.clickTestConfig();
        ParameterM.clickParameterMenu();
        ParameterM.clickParameterField();
        ParameterM.clickAddParameter();
        ParameterM.setParameter();
        ParameterM.setDay("28");
        ParameterM.clickbtnSave();
    }
}
