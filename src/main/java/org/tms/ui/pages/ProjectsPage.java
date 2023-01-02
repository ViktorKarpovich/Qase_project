package org.tms.ui.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectsPage extends BasePage{

    private final static String PROJECT_NAME = "testName1";
    private final static String PROJECT_CODE = "testcode1";
    private final static String PROJECT_DESCRIPTION = "testDescription1";

    @FindBy(xpath = "//button[@id='createButton']")
    private WebElement createNewProjectButton;
    @FindBy(xpath = "//span[@class='UdZcu9']")
    private WebElement textOfNewProjectButton;
    @FindBy(xpath = "//input[@id='project-name']")
    private WebElement projectNameField;
    @FindBy(xpath = "//input[@id='project-code']")
    private WebElement projectCodeField;
    @FindBy(xpath = "//textarea[@id='description-area']")
    private WebElement projectDescriptionField;
    @FindBy(xpath = "//input[@value='public']")
    private WebElement projectAccessTypePublicOption;
    @FindBy(xpath = "//button[contains(.,'Create project')]")
    public WebElement createProjectButton;
    @FindBy(xpath = "//span[@class='no-project mt-4']")
    public WebElement textOfEmptyProject;
    @FindBy(xpath = "//a[@href='/workspace']")
    public WebElement workspacePageButton;
    @FindBy(xpath = "//a[@href='/project/TTESTCODE1']")
    public WebElement nameOfExistingProject;
    @FindBy(xpath = "//button[@class='add-filter-button']")
    public WebElement addFilterButton;
    @FindBy(xpath = "//button[contains(.,'Milestones')]")
    public WebElement milestonesFilterOption;
    @FindBy(xpath = "//input[@id='milestones-0']")
    public WebElement noMilestonesOption;
    @FindBy(xpath = "//input[@name = 'title']")
    public WebElement searchField;
    @FindBy(xpath = "//span[contains(.,'Milestones: Without milestones')]")
    public WebElement selectedMilestonesOption;


    @Step("Step 1, clicking the 'new project' button")
    public void clickNewProjectButton(){
        createNewProjectButton.click();
    }
    public String getNewProjectButtonText(){
        return textOfNewProjectButton.getText();
    }
    @Step("Step 2, filling the 'project name' field")
    public void fillingProjectNameField(){
        projectNameField.sendKeys(PROJECT_NAME);
    }
    @Step("Step 3, filling the 'project code' field")
    public void fillingProjectCodeField(){
        projectCodeField.clear();
        projectCodeField.sendKeys(PROJECT_CODE);
    }
    public void fillingProjectDescriptionField(){
        projectDescriptionField.sendKeys(PROJECT_DESCRIPTION);
    }
    public WebElement selectionProjectAccessType(){
        projectAccessTypePublicOption = projectAccessTypePublicOption;
        return projectAccessTypePublicOption;
    }
    @Step("Step 4, clicking on the 'create project' button")
    public void clickCreateProjectButton(){
        createProjectButton.click();
    }
    public String getTextOfEmptyProject(){
        return textOfEmptyProject.getText();
    }
    public ProjectsPage waitTextIsLoaded() {
        waitVisibilityOf(textOfEmptyProject);
        return this;
    }
    public void clickWorkspaceButton(){
        workspacePageButton.click();
    }
    public String getName0fExistingProject(){
        return nameOfExistingProject.getText();
    }
    public void clickExistingProject(){
        nameOfExistingProject.click();
    }
    @Step("Step 1, clicking the 'Add filter' button")
    public void clickAddFilterButton(){
        addFilterButton.click();
    }
    @Step("Step 2, clicking the 'Milestones' filter option")
    public void clickMilestonesFilterOption(){
        milestonesFilterOption.click();
    }
    @Step("Step 3, clicking the 'No milestones' option")
    public void clickNoMilestonesOption(){
        noMilestonesOption.click();
    }
    public void searchProjects(){
        searchField.sendKeys(PROJECT_NAME);
    }
    public ProjectsPage waitNameOfProjectLoaded(){
        waitVisibilityOf(nameOfExistingProject);
        return this;
    }
    public String getTextOfselectedMilestonesOption(){
        return selectedMilestonesOption.getText();
    }





}
