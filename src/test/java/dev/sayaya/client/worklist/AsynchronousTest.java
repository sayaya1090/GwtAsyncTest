package dev.sayaya.client.worklist;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.Timer;
import junit.framework.TestCase;

public class AsynchronousTest extends GWTTestCase {
    @Override
    public String getModuleName() {
        return "dev.sayaya.AsyncTest";
    }
    public void test1() {
        Timer timer = new Timer() {
            @Override
            public void run() {
                TestCase.fail();
            }
        };
        delayTestFinish(500);
        timer.schedule(100);
    }
    public void test2() {
        Timer timer = new Timer() {
            @Override
            public void run() {
                finishTest();
            }
        };
        delayTestFinish(500);
        timer.schedule(100);
    }
}
