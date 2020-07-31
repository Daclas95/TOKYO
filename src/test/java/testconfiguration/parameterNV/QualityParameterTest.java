package testconfiguration.parameterNV;

import com.test.qa.tokyo.DisplayDashboard.testconfiguration.parameterNV.QualityParameter;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import utils.PageBase;

import java.util.logging.Logger;

public class QualityParameterTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(QualityParameterTest.class));

    @Test(groups = {"Smoke"}, priority = 1)
    public void QualityParameterTest() throws Exception {
        QualityParameter.clickTestConfig();
        PageBase.staticWait(5);
        QualityParameter.clickParameterMenu();
        QualityParameter.clickQualityParameterField();
        QualityParameter.clickAddQuaParameter();
        PageBase.staticWait(5);
        QualityParameter.setParameter();
        PageBase.staticWait(5);
        QualityParameter.clickbutnSave();
        PageBase.staticWait(5);

    }
}
