package com.udacity.jwdnd.course1.cloudstorage.controller;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NoteControllerTest {
//    private WebDriver driver;
//    public NoteControllerTest() {
//
//    }
//
//    @BeforeEach
//    public void initWebDriver() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("http://localhost:8080/login");
//        driver.findElement(By.id("signup-link")).click();
//        //clear input text
//        driver.findElement(By.id("inputFirstName")).clear();
//        driver.findElement(By.id("inputLastName")).clear();
//        driver.findElement(By.id("inputUsername")).clear();
//        driver.findElement(By.id("inputPassword")).clear();
//        //register new user
//        driver.findElement(By.id("inputFirstName")).sendKeys("John");
//        driver.findElement(By.id("inputLastName")).sendKeys("Connor");
//        driver.findElement(By.id("inputUsername")).sendKeys("ResistanceLeader");
//        driver.findElement(By.id("inputPassword")).sendKeys("Connor123456@2024");
//        driver.findElement(By.id("buttonSignUp")).click();
//        List<WebElement> errorMsg = driver.findElements(By.className("alert"));
//
//        driver.findElement(By.id("login-link")).click();
//        driver.findElement(By.id("inputUsername")).clear();
//        driver.findElement(By.id("inputPassword")).clear();
//        driver.findElement(By.id("inputUsername")).sendKeys("ResistanceLeader");
//        driver.findElement(By.id("inputPassword")).sendKeys("Connor123456@2024");
//        driver.findElement(By.id("login-button")).click();
//
//        driver.findElement(By.id("nav-notes-tab")).click();
//        driver.findElements(By.cssSelector(".delete-note-button")).forEach(webElement -> {
//            webElement.click();
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.id("note-cancel-btn")).click();
//        });    }
//
//    @AfterEach
//    public void closeWebDriver() {
//        driver.quit();
//    }
//
//    @Test
//    public void checkCancelNote() throws InterruptedException {
//        List<WebElement> expectedRowList = driver.findElements(By.cssSelector("#noteTable tbody tr"));
//        createNoteAction(true);
//        assertTrue(driver.findElement(By.className("modal")).findElements(By.className("text-danger")).isEmpty());
//        List<WebElement> currentRowList = driver.findElements(By.cssSelector("#noteTable tbody tr"));
//        assertEquals(expectedRowList.size(),currentRowList.size());
//    }
//
//    @Test
//    public void checkNoteCreatedSuccessfully() throws InterruptedException {
//        createNoteAction(false);
//        assertTrue(driver.findElement(By.className("modal")).findElements(By.className("text-danger")).isEmpty());
//        WebElement expectedRow = driver.findElement(By.cssSelector("#noteTable tbody tr"));
//        assertEquals("test", expectedRow.findElement(By.cssSelector("th")).getText());
//        assertEquals("test", expectedRow.findElement(By.cssSelector("td:last-child")).getText());
//    }
//
//    @Test
//    public void checkNoteUpdateSuccessfully() throws InterruptedException {
//        createNoteAction(false);
//        updateNoteAction(false);
//        assertTrue(driver.findElement(By.className("modal")).findElements(By.className("text-danger")).isEmpty());
//        List<WebElement> expectedRowList = driver.findElements(By.cssSelector("#noteTable tbody tr"));
//        assertEquals("test2", expectedRowList.get(0).findElement(By.cssSelector("th")).getText());
//        assertEquals("test2", expectedRowList.get(0).findElement(By.cssSelector("td:last-child")).getText());
//    }
//
//    @Test
//    public void checkNoteDeleteSuccessfully() throws InterruptedException {
//        createNoteAction(false);
//        String rowId = deleteNoteAction();
//        assertTrue(driver.findElement(By.className("modal")).findElements(By.className("text-danger")).isEmpty());
//        List<WebElement> expectedRowList = driver.findElements(By.cssSelector("#noteTable tbody tr"));
//        boolean isRowNotExist  = expectedRowList.stream().noneMatch(webElement -> Objects.equals(webElement.getAttribute("id"), rowId));
//        assertTrue(isRowNotExist);
//    }
//
//    private void createNoteAction(boolean isCancel) throws InterruptedException {
//        WebElement createNoteButton = driver.findElement(By.id("create-note-btn"));
//        createNoteButton.click();
//        Thread.sleep(500);
//        driver.findElement(By.id("note-title")).sendKeys("test");
//        driver.findElement(By.id("note-description")).sendKeys("test");
//        if (!isCancel)
//        {
//            driver.findElement(By.id("note-save-btn")).click();
//        } else {
//            driver.findElement(By.id("note-cancel-btn")).click();
//        }
//    }
//
//    private void updateNoteAction(boolean isCancel) throws InterruptedException {
//        List<WebElement> expectedRowList = driver.findElements(By.cssSelector("#noteTable tbody tr"));
////        driver.findElement(By.id("note-cancel-btn")).click();
//        expectedRowList.get(0).findElement(By.cssSelector("td:first-child .update-note-button")).click();
//        Thread.sleep(500);
//        driver.findElement(By.id("note-title")).clear();
//        driver.findElement(By.id("note-description")).clear();
//        driver.findElement(By.id("note-title")).sendKeys("test2");
//        driver.findElement(By.id("note-description")).sendKeys("test2");
//        if (!isCancel)
//        {
//            driver.findElement(By.id("note-save-btn")).click();
//        } else {
//            driver.findElement(By.id("note-cancel-btn")).click();
//        }
//    }
//
//    private String deleteNoteAction() throws InterruptedException {
//        List<WebElement> expectedRowList = driver.findElements(By.cssSelector("#noteTable tbody tr"));
//        WebElement expectedRow = expectedRowList.get(0);
////        driver.findElement(By.id("note-cancel-btn")).click();
//        String rowId = expectedRow.getAttribute("id");
//        expectedRow.findElement(By.id("delete-note-button")).click();
//        return rowId;
//    }
}
