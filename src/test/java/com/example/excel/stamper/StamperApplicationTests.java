package com.example.excel.stamper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.excel.stamper.pdfstamper.IPdfStamper;

import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@SpringBootTest
class StamperApplicationTests {

	@Autowired
    private IPdfStamper stamperApp;

	@Test
	void contextLoads() {
	}

 	@Test
	public void testCreateTemplate() {		

		try {
			stamperApp.getPdfTemplate("template");

		} catch (Exception e) {
			assertTrue(false);
		}
		assertTrue(true);
	}

	@Test
	public void testSetEncryption() {		
		
		try {
			//stamperApp.setEncryption("pass", "pass");
		} catch (Exception e) {
			assertTrue(false);
		}
		assertTrue(true);
	}

	@Test
	public void testCreateContent() {		
		
		try {

			stamperApp.setDraft(1);
			stamperApp.insertPage("page", 2);
			stamperApp.insertPage("page", 3);
			stamperApp.setRandomGrid(2);
			stamperApp.removePages(3);
		} catch (Exception e) {
			assertTrue(false);
		}
		assertTrue(true);
	}

	@Test
	public void testSavePdf() {		
		
		try {
			stamperApp.savePdf("instance");

		} catch (Exception e) {
			assertTrue(false);
		}
		assertTrue(true);
	}

	@Test
	public void testAssertEquals() {

	  assertEquals("failure - strings are not equal", "text", "text");
	}
  
	@Test
	public void testAssertFalse() {

	  assertFalse("failure - should be false", false);
	}

}
