package org.example;

import org.example.page.GoogleCloudPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class GoogleCloudTest {
    private static Browser browser;

    @BeforeAll//открывает браузер перед выполнением сценария suite
    public static void setup() {
        browser = Browser.getInstance();
    }

//    @AfterAll
//    public static void tearDown() {
//        browser.stopBrowser();
//    }
    @Test
    public void baseTest(){
        GoogleCloudPage page = new GoogleCloudPage();
        page.openPage();
        page.searchField();
        page.clickFirstSearchResult();
        page.clickComputeEngine();
        page.fillNumberOfInstances();
        page.fillOperatingSystem();
        page.fillMachineClass();
        page.fillSeries();
        page.fillMachineType();
        page.chooseAddGPUs();
        page.fillNumberOfGPUs();
        page.fillGPUType();
        page.fillLocalSSD();
        page.fillDatacenterlocation();
        page.fillCommitUsage();
        page.tabAddToEstimate();

        assertTrue(page.isVMClassCorrect());
        assertTrue(page.isInstanceTypeCorrect());
        assertTrue(page.isRegionCorrect());
        assertTrue(page.islocalSSDCorrect());
        assertTrue(page.isCommitMentTermCorrect());
        assertTrue(page.isTotalEstimatedCostCorrect());

    }

}
