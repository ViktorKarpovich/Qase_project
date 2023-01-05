package org.tms.pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class ProjectsPage extends BasePage{

    private final static String PROJECT_NAME = "testName1";
    private final static String PROJECT_CODE = "testcode1";

    @FindBy(xpath = "//button[@id='createButton']")
    private WebElement createNewProjectButton;
    @FindBy(xpath = "//span[@class='UdZcu9']")
    private WebElement textOfNewProjectButton;
    @FindBy(xpath = "//input[@id='project-name']")
    private WebElement projectNameField;
    @FindBy(xpath = "//input[@id='project-code']")
    private WebElement projectCodeField;
    @FindBy(xpath = "//button[contains(.,'Create project')]")
    private WebElement createProjectButton;
    @FindBy(xpath = "//span[@class='no-project mt-4']")
    private WebElement textOfEmptyProject;
    @FindBy(xpath = "//a[@href='/workspace']")
    private WebElement workspacePageButton;
    @FindBy(xpath = "//a[@href='/project/TTESTCODE1']")
    private WebElement nameOfExistingProject;
    @FindBy(xpath = "//button[@class='add-filter-button']")
    private WebElement addFilterButton;
    @FindBy(xpath = "//button[contains(.,'Milestones')]")
    private WebElement milestonesFilterOption;
    @FindBy(xpath = "//input[@id='milestones-0']")
    private WebElement noMilestonesOption;
    @FindBy(xpath = "//input[@name = 'title']")
    private WebElement searchField;
    @FindBy(xpath = "//span[contains(.,'Milestones: Without milestones')]")
    private WebElement selectedMilestonesOption;
    @FindBy(xpath = "//span[contains(.,'Settings')]")
    private WebElement settingsButton;
    @FindBy(xpath = "//span[contains(.,'Delete project')]")
    private WebElement deleteProjectButton;


    @Step("Step 1, clicking the 'new project' button")
    public void clickNewProjectButton(){
        log.info("Step 1, opening login page");
        createNewProjectButton.click();
    }
    public String getNewProjectButtonText(){
        return textOfNewProjectButton.getText();
    }
    @Step("Step 2, filling the 'project name' field")
    public void fillingProjectNameField(){
        log.info("Step 2, filling the 'project name' field");
        projectNameField.sendKeys(PROJECT_NAME);
    }
    @Step("Step 3, filling the 'project code' field")
    public void fillingProjectCodeField(){
        log.info("Step 3, filling the 'project code' field");
        projectCodeField.clear();
        projectCodeField.sendKeys(PROJECT_CODE);
    }
    @Step("Step 4, clicking on the 'create project' button")
    public void clickCreateProjectButton(){
        log.info("Step 4, clicking on the 'create project' button");
        createProjectButton.click();
        waitVisibilityOf(textOfEmptyProject);
    }
    public String getTextOfEmptyProject(){
        return textOfEmptyProject.getText();
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
        log.info("Step 1, clicking the 'Add filter' button");
        addFilterButton.click();
    }
    @Step("Step 2, clicking the 'Milestones' filter option")
    public void clickMilestonesFilterOption(){
        log.info("Step 2, clicking the 'Milestones' filter option");
        milestonesFilterOption.click();
    }
    @Step("Step 3, clicking the 'No milestones' option")
    public void clickNoMilestonesOption(){
        log.info("Step 3, clicking the 'No milestones' option");
        noMilestonesOption.click();
    }
    public void searchProjects(){
        searchField.sendKeys(PROJECT_NAME);

    }

    @Step("Step 1, clicking the 'Settings' button")
    public void clickSettingsButton(){
        settingsButton.click();
    }

    @Step("Step 2, clicking 'Delete project' button")
    public void clickDeleteProjectButton(){
        deleteProjectButton.click();
    }

    public boolean isProjectExist() {
        nameOfExistingProject.isDisplayed();
        return false;
    }

    public String getTextOfselectedMilestonesOption(){
        return selectedMilestonesOption.getText();
    }

}
