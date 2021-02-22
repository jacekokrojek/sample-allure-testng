package my.company;

import io.qameta.allure.Step;
import org.testng.annotations.Test;

import static io.qameta.allure.Allure.step;

/**
 * @author baev (Dmitry Baev)
 */
public class CompanyTest {

    @Test
    public void simpleTest() {
        step("step 1");
        step("step 2");
    }

    @Test
    public void otherTest() {
        step("step 1");
        step("step 2");
        step("dupa");
    }

}

