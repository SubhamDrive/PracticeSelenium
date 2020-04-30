package ab;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AbTestingPage;

import static org.testng.Assert.assertTrue;

public class AbTest extends BaseTest {

    @Test
    public void checkContent()
    {
        AbTestingPage ab1 = homePage.clickAb();
        assertTrue(ab1.gettext().contains("Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through)."),
                "Alert text Incorrect");
    }
}
