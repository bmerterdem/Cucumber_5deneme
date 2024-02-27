package Pages;

import Utilities.GWDD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNavv extends Parent{
    public LeftNavv() {
        PageFactory.initElements(GWDD.getDriver(),this);
    }
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;
    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;
    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countries;
    @FindBy(xpath = "//span[text()='Citizenships']")
    public WebElement citizenship;
    @FindBy(xpath = "//span[text()='Fees']")
    public WebElement fees;
    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    public WebElement entranceexamone;
    @FindBy(xpath="(//span[text()='Setup'])[2]")
    public WebElement setuptwo;
    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    public WebElement entranceexamtwo;


    public WebElement getWebElement(String str){
        switch (str){
            case "setup": return setup;
            case "parameters": return parameters;
            case "countries":return countries;
            case "fees":return fees;
            case "entranceexamone":return entranceexamone;
            case "setuptwo":return setuptwo;
            case "entranceexamtwo" :return entranceexamtwo;

        }
        return null;

    }
}
