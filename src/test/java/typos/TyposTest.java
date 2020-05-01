package typos;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.TyposPage;
import static org.testng.Assert.assertTrue;
public class TyposTest extends BaseTest {

    @Test
    public void checkContent()
    {
        TyposPage typosPage = homePage.clickTypos();
        assertTrue(typosPage.getText1()
                        .contains("Typos\n" +
                                "This example demonstrates a typo being introduced. It does it randomly on each page load.\n" +
                                "\n" +
                                "Sometimes you'll see a typo, other times you won't."),
                "alert text");
    }
}
