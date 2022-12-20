package org.tms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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

    public ProjectsPage waitTextIsLoaded() {
        waitVisibilityOf(textOfEmptyProject);
        return this;
    }

    @FindBy(xpath = "//a[contains(.,'testName1')]")
    public WebElement nameOfExistingProject;

    public String getName0fExistingProject(){
        return nameOfExistingProject.getText();
    }

    @FindBy(xpath = "//button[@class='add-filter-button']")
    public WebElement addFilterButton;

    public void clickAddFilterButton(){
        addFilterButton.click();
    }

    @FindBy(xpath = "//button[contains(.,'Milestones')]")
    public WebElement milestonesFilterOption;

    public void clickMilestonesFilterOption(){
        milestonesFilterOption.click();
    }

    @FindBy(xpath = "//input[@id='milestones-0']")
    public WebElement noMilestonesOption;

    public void clickNoMilestonesOption(){
        noMilestonesOption.click();
    }

    @FindBy(xpath = "//input[@name = 'title']")
    public WebElement searchField;

    public void searchProjects(){
        searchField.sendKeys(projectName);
    }

    public ProjectsPage waitNameOfProjectLoaded(){
        waitVisibilityOf(nameOfExistingProject);
        return this;
    }

    @FindBy(xpath = "//span[contains(.,'Milestones: Without milestones')]")
    public WebElement selectedMilestonesOption;

    public String getTextOfselectedMilestonesOption(){
        return selectedMilestonesOption.getText();
    }



}
