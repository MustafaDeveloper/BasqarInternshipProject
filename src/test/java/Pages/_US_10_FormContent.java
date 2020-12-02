package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _US_10_FormContent extends _US_00_Parent{

    WebElement myElement;

    //buradaki driver silindi çünkü Parentten geliyor.gerek kalmadı
    public _US_10_FormContent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[2]")
    private WebElement gradeLevel;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[3]")
    private WebElement documentType;

    @FindBy(xpath = "//span[text()='Add']")
    private WebElement examsAddBtn;

    @FindBy (xpath="(//span[@class='mat-option-text'])[1]")
    private WebElement option1;

    @FindBy (xpath="(//span[@class='mat-option-text'])[2]")
    private WebElement option2;

    @FindBy (xpath="(//span[@class='mat-option-text'])[3]")
    private WebElement option3;

    @FindBy (xpath="(//span[@class='mat-option-text'])[4]")
    private WebElement option4;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='firstName']/input")
    private WebElement firstNameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='lastName']/input")
    private WebElement lastNameInput;

    @FindBy(css = "mat-select[formcontrolname='gender']")
    private WebElement genderDropdown;

    @FindBy(xpath="(//span[text()='School Department'])[1]")
    public WebElement schoolDepartmentDropdown;

    @FindBy(xpath="(//span[text()='Section'])[1]")
    public WebElement sectionDropdown;

    @FindBy(xpath="(//span[text()='Citizenship'])[1]")
    public WebElement citizenshipDropdown;

    @FindBy(xpath = "//span[text()='Document Type']")
    private WebElement studentDocumentType;

    @FindBy(xpath = "//input[@formcontrolname='documentNumber']")
    private WebElement studentDocumentNumber;

    @FindBy(xpath = "(//div[@class='mat-tab-label-content'])[2]")
    private WebElement representatives;

    @FindBy(xpath = "//ms-add-button[@class='ng-star-inserted']")
    private WebElement repAddBtn;

    @FindBy(xpath = "//span[text()='Representative']")
    private WebElement repSelect;

    @FindBy(xpath = "//input[@formcontrolname='firstName']")
    private WebElement repFirstName;

    @FindBy(xpath = "//input[@formcontrolname='lastName']")
    private WebElement repLastName;

    @FindBy(xpath = "//input[@formcontrolname='phone']")
    private WebElement repMobilPhone;

    @FindBy(xpath = "//span[text()=' Add ']")
    private WebElement repAddBtn2;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.DESCRIPTION']")
    private WebElement descriptionClick;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement descriptionText;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.YEAR']")
    private WebElement yearClick;

    @FindBy(xpath = "//input[@type='number']")
    private WebElement yearNumber;

    @FindBy(xpath = "(//span[text()='Budget Group'])[3]")
    private WebElement budgetGroup;

    @FindBy(xpath = "//mat-select[@formcontrolname='status']")
    private WebElement status;

    @FindBy(xpath = "(//span[text()='School'])[3]")
    private WebElement school;

    @FindBy(xpath = "//mat-select[@formcontrolname='type']")
    private WebElement type;

    @FindBy(xpath = "//span[text()='Approve']")
    private WebElement approve;


    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;


    public boolean findElementAndClickFunction(String ElementName) {

        switch (ElementName) {
            case "academicPeriod":
                 myElement = academicPeriod;
                break;

            case "gradeLevel":
                myElement = gradeLevel;
                break;

            case "documentType":
                myElement = documentType;
                break;

            case "examsAddBtn":
                myElement = examsAddBtn;
                break;

            case "option1":
                myElement = option1;
                break;

            case "option2":
                myElement = option2;
                break;

            case "option3":
                myElement = option3;
                break;

            case "option4":
                myElement = option4;
                break;

            case "saveButton":
                myElement = saveButton;
                break;

            case "genderDropdown":
                myElement = genderDropdown;
                break;

            case "schoolDepartmentDropdown":
                myElement = schoolDepartmentDropdown;
                break;

            case "sectionDropdown":
                myElement = sectionDropdown;
                break;

            case "citizenshipDropdown":
                myElement = citizenshipDropdown;
                break;

            case "studentDocumentType":
                myElement = studentDocumentType;
                break;

            case "representatives":
                myElement = representatives;
                break;

            case "repAddBtn":
                myElement = repAddBtn;
                break;

            case "repSelect":
                myElement = repSelect;
                break;

            case "repAddBtn2":
                myElement = repAddBtn2;
                break;


            case "descriptionClick":
                myElement = descriptionClick;
                break;
            case "yearClick":
                myElement = yearClick;
                break;
            case "budgetGroup":
                myElement = budgetGroup;
                break;
            case "status":
                myElement = status;
                break;
            case "school":
                myElement = school;
                break;
            case "type":
                myElement = type;
                break;
            case "approve":
                myElement = approve;
                break;
            case "closeDialog":
                myElement = closeDialog;
                break;

        }
        if(myElement.isEnabled()){
            clickFunction(myElement);
            return true;
        }else {
            return false;
        }
    }

    public boolean findElementAndSendKeysFunction(String ElementName, String value) {

        switch (ElementName) {
            case "nameInput":
                myElement = nameInput;
                break;

            case "firstNameInput":
                myElement = firstNameInput;
                break;

            case "lastNameInput":
                myElement = lastNameInput;
                break;

            case "studentDocumentNumber":
                myElement = studentDocumentNumber;
                break;

            case "repFirstName":
                myElement = repFirstName;
                break;

            case "repLastName":
                myElement = repLastName;
                break;

            case "repMobilPhone":
                myElement = repMobilPhone;
                break;

            case "descriptionText":
                myElement = descriptionText;
                break;

            case "yearNumber":
                myElement = yearNumber;
                break;

            case "budgetGroup":
                myElement = budgetGroup;
                break;
        }

        if(myElement.isEnabled()){
            sendKeysFunction(myElement, value);
            return true;
        }else {
            return false;
        }

    }



}
