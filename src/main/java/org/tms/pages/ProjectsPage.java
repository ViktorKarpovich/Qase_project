package org.tms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectsPage extends BasePage{

    private String projectName = "testName1";
    private String projectCode = "testcode1";
    private String projectDescription = "testDescription1";

    private boolean projectAccessTypePublic = true;

    @FindBy(xpath = "//button[@id='createButton']")
    private WebElement createNewProjectButton;

    public void clickNewProjectButton(){
        createNewProjectButton.click();
    }

    @FindBy(xpath = "//span[@class='UdZcu9']")
    private WebElement textOfNewProjectButton;

    public String getNewProjectButtonText(){
        return textOfNewProjectButton.getText();
    }

    @FindBy(xpath = "//input[@id='project-name']")
    private WebElement projectNameField;

    public void fillingProjectNameField(){
        projectNameField.sendKeys(projectName);
    }

    @FindBy(xpath = "//input[@id='project-code']")
    private WebElement projectCodeField;

    public void fillingProjectCodeField(){
        projectCodeField.clear();
        projectCodeField.sendKeys(projectCode);
    }

    @FindBy(xpath = "//textarea[@id='description-area']")
    private WebElement projectDescriptionField;

    public void fillingProjectDescriptionField(){
        projectDescriptionField.sendKeys(projectDescription);
    }

    @FindBy(xpath = "//input[@value='public']")
    private WebElement projectAccessTypePublicOption;

    public WebElement selectionProjectAccessType(){
        projectAccessTypePublicOption = projectAccessTypePublicOption;
        return projectAccessTypePublicOption;
    }

    @FindBy(xpath = "//button[contains(.,'Create project')]")
    public WebElement createProjectButton;

    public void clickCreateProjectButton(){
        createProjectButton.click();
    }

    @FindBy(xpath = "//span[@class='no-project mt-4']")
    public WebElement textOfEmptyProject;

    public String getTextOfEmptyProject(){
        return textOfEmptyProject.getText();
    }

}
