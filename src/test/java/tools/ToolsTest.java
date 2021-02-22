package tools;

import org.testng.annotations.Test;

import static io.qameta.allure.Allure.step;

/**
 * @author baev (Dmitry Baev)
 */
public class ToolsTest {

    @Test
    public void simpleTest() {
        step("step 1");
        step("step 2");
    }

    @Test
    public void otherTest() {
        step("step 1");
        step("step 2");
    }
}

