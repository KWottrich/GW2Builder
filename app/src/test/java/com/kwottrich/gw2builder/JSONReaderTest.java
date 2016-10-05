package com.kwottrich.gw2builder;

import com.kwottrich.gw2builder.actions.JSONReader;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class JSONReaderTest {
    @Test
    public void testSkillConversion() throws Exception {
        JSONReader jsonReader = new JSONReader();
        jsonReader.testGson();
    }
}