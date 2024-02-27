package Pages;

import Utilities.GWDD;
import io.reactivex.rxjava3.exceptions.Exceptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DialogCOntentttt extends Parent {
    public DialogCOntentttt() {
        PageFactory.initElements(GWDD.getDriver(), this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;
    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;
    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement lgnbttn;
    @FindBy(css = "span[class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement txtTechnostudy;
    ////div[text()='Sauce Labs Backpack']"));
    @FindBy(xpath = "(//ms-add-button[contains(@tooltip,'ADD')]//button)")
    public WebElement addbutton;
    @FindBy(xpath = "(//ms-text-field[@formcontrolname='name'])/input")
    public WebElement nameinput;
    @FindBy(xpath = "(//ms-text-field[@formcontrolname='code'])/input")
    public WebElement codeinput;
    @FindBy(xpath = "//ms-save-button/button")
    public WebElement savebutton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortname;
    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    public WebElement alreadyexists;
    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Name']")
    public WebElement searchinput;
    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchbtn;
    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteimagebtn;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deletedialogbtn;
    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.INTEGRATION_CODE']/input")
    public WebElement integrationcode;
    @FindBy(xpath = "//ms-integer-field[@placeholder='GENERAL.FIELD.PRIORITY']/input")
    public WebElement priority;
    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']")
    public WebElement toggle;
    @FindBy(xpath = "//mat-select[@formcontrolname='academicPeriod']")
    public WebElement academicperiod;
    @FindBy(xpath = "//mat-option//span[text()=' Test Batch 4 ']")
    public WebElement academicperiodtwo;
    @FindBy(xpath = "(//span[text()='Grade Level'])[1]")
    public WebElement gradelevelone;
    @FindBy(xpath = "//span[text()=' red _ i ']")
    public WebElement gradeleveltwo;


    public void deleteitem(String searchText) {
        sendkeysFunction(searchinput, searchText);
        clickFunction(searchbtn);
        wait.until(ExpectedConditions.elementToBeClickable(searchbtn));
        clickFunction(deleteimagebtn);
        clickFunction(deletedialogbtn);
    }

    public WebElement getWebElement(String str) {
        switch (str) {
            case "addbutton":
                return addbutton;
            case "savebutton":
                return savebutton;
            case "nameinput": return nameinput;
            case "codeinput":return codeinput;
            case "integrationcode":return integrationcode;
            case "priority":return priority;
            case "toggle":return toggle;
            case "academicperiod":return academicperiod;
            case "academicperiodtwo":return academicperiodtwo;
            case "gradelevelone":return gradelevelone;
            case "gradeleveltwo":return gradeleveltwo;

        }
        return null;


    }
}