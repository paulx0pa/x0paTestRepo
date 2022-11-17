package stepdef;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Stepdef {
	
		public static WebDriver driver;
		public static String linktoapply;
		public static String job_id;
		@Given("^Launch Application using valid URL$")
		public void launch_Application_using_valid_URL() throws Throwable {
			/*System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
	        driver.manage().deleteAllCookies();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.get("http://staging.x0pa.ai/app/roboroy");*/
	        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("headless");
			options.addArguments("disable-gpu");
			driver=new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
			 driver.get("http://staging.x0pa.ai/app/roboroy");
		}
		@Then("^accept cookies and choose login type$")
		public void accept_cookies_and_choose_login_type() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.id("hs-eu-confirmation-button")).click();
	        //driver.findElement(By.linkText("Candidate Login")).click(); 
			driver.findElement(By.linkText("Employer Login")).click();
		}
		@Then("^accept cookies and click on register$")
		public void accept_cookies_and_click_on_register() throws Throwable {
			
			driver.findElement(By.id("hs-eu-confirmation-button")).click();
			driver.findElement(By.linkText("Candidate Login")).click();
			driver.findElement(By.xpath("//a[text()='Register']")).click();
			
		}
		@When("^enters valid credentials \"([^\"]*)\" and \"([^\"]*)\"$")
		public void enters_valid_credentials_and(String email, String password) throws Throwable {
			driver.findElement(By.name("username")).sendKeys(email);
			driver.findElement(By.name("password")).sendKeys(password); 
		}

		@Then("^verify captcha and click on Login button$")
		public void verify_captcha_and_click_on_Login_button() throws Throwable {
			driver.findElement(By.xpath("//button[text()='Login']")).click();
		}

		@Given("^Click on Logout Button$")
		public void click_on_Logout_Button() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(3000);
			WebElement logout=driver.findElement(By.xpath("//button[@aria-label='Logout']"));
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.elementToBeClickable(logout));
			Thread.sleep(2000); 
		    driver.findElement(By.xpath("//button[@aria-label='Logout']")).click();
		}
		@Given("^Recruiter clicks on Jobs Menu$")
		public void recruiter_clicks_on_Jobs_Menu() throws Throwable {
			Thread.sleep(9000);
			driver.findElement(By.xpath("(//a[@class='bx--header__menu-item'])[2]")).click();
		}

		@Then("^select create new job section$")
		public void select_create_new_job_section() throws Throwable {
//			Thread.sleep(2000);
			
		    driver.findElement(By.xpath("//div[text()='Create New Job']")).click();
//			driver.findElement(By.linkText("Create New Job")).click();
			 Thread.sleep(2000); 
		}

		@When("^click on Start button of form$")
		public void click_on_Start_button_of_form() throws Throwable {
			driver.findElement(By.xpath("//div[@class='mt-3']//child::button[contains(text(),'Start')]")).click(); 
//			Thread.sleep(4000);
		}

		@When("^choose office address \"([^\"]*)\"$")
		public void choose_office_address(String address) throws Throwable {
			WebElement OfficeAddress=driver.findElement(By.xpath("//input[@id='react-select-3-input']"));
		    OfficeAddress.sendKeys(address);
		    Thread.sleep(2000);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			OfficeAddress.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			OfficeAddress.sendKeys(Keys.ENTER);
		}

		@When("^add Job Title as \"([^\"]*)\"$")
		public void add_Job_Title_as(String title) throws Throwable {
			WebElement jobtitle=driver.findElement(By.xpath("//input[@placeholder='Job Title']"));
			jobtitle.sendKeys(title);
//			Thread.sleep(2000); 
		}
		@When("^add internal code for job \"([^\"]*)\"$")
		public void add_internal_code_for_job(String intrnlcode) throws Throwable {
			driver.findElement(By.id("internalCode")).sendKeys(intrnlcode);
		}
	     
		

		@When("^select Job Status as \"([^\"]*)\"$")
		public void select_Job_Status_as(String js) throws Throwable {
			WebElement jobstatus=driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
			jobstatus.sendKeys(js);
			jobstatus.sendKeys(Keys.ARROW_DOWN);
//			Thread.sleep(2000);
			jobstatus.sendKeys(Keys.ENTER);
//			Thread.sleep(2000);
		}

		@When("^choose candidates from other countries$")
		public void choose_candidates_from_other_countries() throws Throwable {
			driver.findElement(By.xpath("(//span[@class='bx--toggle__switch'])[3]")).click();	
			  
		}

		@When("^enable rank and file job$")
		public void enable_rank_and_file_job() throws Throwable {
			driver.findElement(By.xpath("(//span[@class='bx--toggle__switch'])[4]")).click();
		}

		@When("^Select Country Location \"([^\"]*)\"$")
		public void select_Country_Location(String countryname) throws Throwable {
			WebElement countrylocation=driver.findElement(By.xpath("//input[@id='react-select-5-input']"));
			countrylocation.sendKeys(countryname);
			countrylocation.sendKeys(Keys.ARROW_DOWN);
//			Thread.sleep(2000);
			countrylocation.sendKeys(Keys.ENTER);
//			Thread.sleep(2000); 
		}

		@When("^Select City location \"([^\"]*)\"$")
		public void select_City_location(String cityname) throws Throwable {
			WebElement citylocation=driver.findElement(By.id("react-select-6-input"));
			citylocation.sendKeys(cityname);
			Thread.sleep(2000);
			citylocation.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			citylocation.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
		}

		@When("^add skills \"([^\"]*)\" and \"([^\"]*)\"$")
		public void add_skills_and(String skill1, String skill2) throws Throwable {
			WebElement skills=driver.findElement(By.id("react-select-7-input"));
			skills.sendKeys(skill1);
			skills.sendKeys(Keys.ARROW_DOWN);
//			Thread.sleep(2000);
			skills.sendKeys(Keys.ENTER);
//			Thread.sleep(2000);
			skills.sendKeys(skill2);
			skills.sendKeys(Keys.ARROW_DOWN);
//			Thread.sleep(2000);
			skills.sendKeys(Keys.ENTER);
//			Thread.sleep(2000);
		}

		@When("^add Qualification \"([^\"]*)\"$")
		public void add_Qualification(String degree) throws Throwable {
			WebElement qualification=driver.findElement(By.xpath("//input[@id='react-select-8-input']"));
		     qualification.sendKeys(degree);
		     qualification.sendKeys(Keys.ARROW_DOWN);
//		     Thread.sleep(2000);
		     qualification.sendKeys(Keys.ENTER);
//		     Thread.sleep(2000);
		}

		@When("^add job type in emp details as \"([^\"]*)\"$")
		public void add_job_type_in_emp_details_as(String jt) throws Throwable {
			WebElement jobtype=driver.findElement(By.xpath("//input[@id='react-select-9-input']"));
			jobtype.sendKeys(jt);
		    jobtype.sendKeys(Keys.ARROW_DOWN);
//		    Thread.sleep(2000);
		    jobtype.sendKeys(Keys.ENTER);
//		    Thread.sleep(2000);
		}

		@When("^select minimum experience as \"([^\"]*)\"$")
		public void select_minimum_experience_as(String minxp) throws Throwable {
			driver.findElement(By.xpath("//input[@id='minExp']")).sendKeys(minxp);;
//			Thread.sleep(2000);
		}

		@When("^select maximum experience as \"([^\"]*)\"$")
		public void select_maximum_experience_as(String maxxp) throws Throwable {
			driver.findElement(By.id("maxExp")).sendKeys(maxxp);
//			Thread.sleep(2000);
		}

		@When("^choose Employment type as \"([^\"]*)\"$")
		public void choose_Employment_type_as(String emptyp) throws Throwable {
			WebElement emptype=driver.findElement(By.xpath("//input[@id='react-select-10-input']"));
			emptype.sendKeys(emptyp);
			emptype.sendKeys(Keys.ARROW_DOWN);
//			Thread.sleep(2000);
			emptype.sendKeys(Keys.ENTER);
//			Thread.sleep(2000);
		}

		@When("^choose no of vacancies \"([^\"]*)\"$")
		public void choose_no_of_vacancies(String vac) throws Throwable {
			WebElement vacancies=driver.findElement(By.xpath("//input[@id='noOfVacancies']"));
			vacancies.click();
//			Thread.sleep(2000);
			vacancies.sendKeys(vac);
//			Thread.sleep(3000);
		}

		@When("^choose close date of job \"([^\"]*)\"$")
		public void choose_close_date_of_job(String closedate) throws Throwable {
			WebElement closejob=driver.findElement(By.xpath("//input[@placeholder='End Date']"));
			 closejob.sendKeys(closedate);
			 closejob.sendKeys(Keys.ENTER);
//			 Thread.sleep(3000);
		}


		@When("^add Job Description \"([^\"]*)\"$")
		public void add_Job_Description(String jd) throws Throwable {
			driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys(jd);
//			Thread.sleep(2000);
		}

		@When("^add Job Requirements \"([^\"]*)\"$")
		public void add_Job_Requirements(String jr) throws Throwable {
			driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys(jr);
//			Thread.sleep(2000);
		}
		@When("^choose primary recruiter \"([^\"]*)\"$")
		public void choose_primary_recruiter(String recname) throws Throwable {
			WebElement prrec=driver.findElement(By.id("react-select-12-input"));
			prrec.sendKeys(recname);
//		    Thread.sleep(2000);
			prrec.sendKeys(Keys.ARROW_DOWN);
//			Thread.sleep(3000);
			prrec.sendKeys(Keys.ENTER);
//			Thread.sleep(4000);
		}

		@When("^click on submit button of job$")
		public void click_on_submit_button_of_job() throws Throwable {
			driver.findElement(By.xpath("//div[@class='ml-2']//child::button[contains(text(),'Submit')]")).click(); 
		}
		@When("^click on view job button$")
		public void click_on_view_job_button() throws Throwable {
			Thread.sleep(5000);
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			WebElement viewjob=driver.findElement(By.xpath("//button[text()='View job']"));
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.elementToBeClickable(viewjob));
			driver.findElement(By.xpath("//button[text()='View job']")).click();
		}

		@Then("^copy the job link$")
		public void copy_the_job_link() throws Throwable {
			driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			WebElement jbid=driver.findElement(By.xpath("//small[@class='ml-0 ']"));
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.elementToBeClickable(jbid)); 
			String strMain=driver.findElement(By.xpath("//small[@class='ml-0 ']")).getText();
			String[] arrSplit = strMain.split(": ");
			job_id=arrSplit[1];
			System.out.println(job_id);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			linktoapply=driver.findElement(By.xpath("//a[@id='public-hash-job-link']")).getAttribute("href");
			Thread.sleep(4000);
		}
		@Then("^click on back button$")
		public void click_on_back_button() throws Throwable {
		  driver.navigate().back();
//		  COLLABORATORS
		  
		  
	    	 
	    	
	    	 
		}
		@Then("^recruiter clicks on add collaborators button$")
		public void recruiter_clicks_on_add_collaborators_button() throws Throwable {
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//			driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			Thread.sleep(3000);
			  driver.findElement(By.xpath("(//button[@id='add-collab-btn'])[1]")).click(); 
			  Select collabrole=new Select(driver.findElement(By.xpath("//select[@name='selectedRoleId']"))); 
//		    	 Thread.sleep(2000);
		    	 collabrole.selectByVisibleText("Team Member");
//		    	 Thread.sleep(2000);
		    	driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
//		    	Thread.sleep(3000);
		    	driver.findElement(By.xpath("//div[text()='Sai  Charan (saicharan@trainingqa.com)']")).click();
//		    	    Thread.sleep(2000);
//					seluser.sendKeys("(saicharan@trainingqa.com)");
//				    Thread.sleep(2000);
//					seluser.sendKeys(Keys.ARROW_DOWN);
//					Thread.sleep(3000);
//					seluser.sendKeys(Keys.ENTER);
//					Thread.sleep(4000);
//		    	 driver.findElement(By.xpath("//div[text()='Sai  Charan (saicharan@trainingqa.com)']")).click();
		    	 Thread.sleep(2000);//div[@id='react-select-14-option-0']
		    	 driver.findElement(By.xpath("//button[text()='Add']")).click();
		}

		@When("^recruiter set up pre screening questions$")
		public void recruiter_set_up_pre_screening_questions() throws Throwable {
//			Thread.sleep(3000);
			driver.findElement(By.xpath("//label[@for='showPreScreeningQuest']")).click();
	    	 driver.findElement(By.xpath("//button[@id='jc-sel-ques-btn']")).click();
//	    	 Thread.sleep(3000);   
//	    	 driver.findElement(By.xpath("//label[@for='data-table-5__select-row-row_572']")).click();  
	    	 driver.findElement(By.xpath("(//label[@class='bx--checkbox-label'])[2]")).click();
	    	 driver.findElement(By.xpath("//button[text()='Add Selected']")).click();
//	    	 Thread.sleep(2000);
	    	 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	    	   JavascriptExecutor js=(JavascriptExecutor)driver;
		 		js.executeScript("window.scrollBy(0,300)");
		 		Thread.sleep(3000);
	    	 driver.findElement(By.xpath("(//button[@id='save-points-oreder-btn'])[1]")).click();
		}

		@Then("^recruiter set up passing points$")
		public void recruiter_set_up_passing_points() throws Throwable {
			Thread.sleep(4000);
			 driver.findElement(By.xpath("(//label[@for='showPassingPoints'])[1]")).click();  
	         driver.findElement(By.xpath("(//input[@id='passingPoints'])[1]")).sendKeys("0");
	         Thread.sleep(3000);
	    	 driver.findElement(By.xpath("(//button[@id='submit-passing-pts-btn'])[1]")).click();
		}

		@Then("^recruiter set up Interview$")
		public void recruiter_set_up_Interview() throws Throwable {
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//label[@for='showAssessments'])[1]")).click();
	    	 driver.findElement(By.xpath("(//button[@id='add-int-stage-btn'])[1]")).click();
	    	 driver.findElement(By.xpath("//label[@for='radio-3']")).click();
	 		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 		Select interviewround=new Select(driver.findElement(By.id("workflowStage")));
	 		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 		interviewround.selectByVisibleText("Phone Interview");
	 		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 		driver.findElement(By.xpath("//input[@id='stageName']")).sendKeys("phone Round");
	 		driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
	 		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 		JavascriptExecutor js1=(JavascriptExecutor)driver;
	 		js1.executeScript("window.scrollBy(0,300)");
	 		driver.findElement(By.xpath("//div[@id='InterviewStage']")).click();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 		 driver.findElement(By.xpath("//label[@for='directInviteSent']")).click(); 
	 		 driver.findElement(By.xpath("(//button[text()='Add slot'])[1]")).click(); 
	 		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,100)");
			driver.findElement(By.xpath("(//input[@placeholder='Select start date and time'])[1]")).sendKeys("18th Dec, 2022 08:00");  
//			Thread.sleep(3000);
			Actions act=new Actions(driver);
			WebElement endtime=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
			act.click(endtime).perform();
//			Thread.sleep(2000);
			WebElement enddate=driver.findElement(By.xpath("//li[text()='08:15']"));
			JavascriptExecutor jt=(JavascriptExecutor)driver;
		    jt.executeScript("window.scrollBy(0,200)");
	           act.moveToElement(enddate);
			enddate.click();
			driver.findElement(By.xpath("(//button[text()='Schedule Interview'])[1]")).click(); 
		}
		@When("^clicks on skills and education section$")
		public void clicks_on_skills_and_education_section() throws Throwable {
//			Thread.sleep(3000);
			 driver.findElement(By.xpath("(//button[@type='button'])[43]")).click();
		}

		@When("^recruiter add industry field \"([^\"]*)\"$")
		public void recruiter_add_industry_field(String indus) throws Throwable {
//			Thread.sleep(2000);
			WebElement industry=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		    industry.sendKeys(indus);
			industry.sendKeys(Keys.ARROW_DOWN);
//			Thread.sleep(2000);
			industry.sendKeys(Keys.ENTER);
//			Thread.sleep(2000); 
		}

		@When("^add keywords for AI to vote CV \"([^\"]*)\"$")
		public void add_keywords_for_AI_to_vote_CV(String kwd) throws Throwable {
			Thread.sleep(2000);
			WebElement keyword =driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		    keyword.sendKeys(kwd);
			keyword.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			keyword.sendKeys(Keys.ENTER);
			Thread.sleep(2000);  
		}

		@When("^recruiter add Education \"([^\"]*)\"$")
		public void recruiter_add_Education(String edu) throws Throwable {
			Thread.sleep(2000);
			WebElement education=driver.findElement(By.xpath("(//input[@type='text'])[5]"));
			education.sendKeys(edu);
			education.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			education.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		}

		@When("^recruiter clicks on Additional Information$")
		public void recruiter_clicks_on_Additional_Information() throws Throwable {
//			 Thread.sleep(5000);
		    driver.findElement(By.xpath("//button[text()='Additional Information']")).click();   
		}

		@When("^recruiter add Work Location \"([^\"]*)\"$")
		public void recruiter_add_Work_Location(String wl) throws Throwable {
//			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@id='workLocation']")).sendKeys(wl);
		}

		@When("^recruiter add working Hours \"([^\"]*)\"$")
		public void recruiter_add_working_Hours(String hrs) throws Throwable {
//			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@name='workHours']")).sendKeys(hrs);
		}

		@When("^enter minimal Annual Salary \"([^\"]*)\"$")
		public void enter_minimal_Annual_Salary(String minsal) throws Throwable {
//			Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@id='minSalary']")).sendKeys(minsal);
		}

		@When("^enter maximum Annual Salary \"([^\"]*)\"$")
		public void enter_maximum_Annual_Salary(String maxsal) throws Throwable {
//			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='maxSalary']")).sendKeys(maxsal);
		}

		@Given("^recruiter clicks on pre screening questionaire$")
		public void recruiter_clicks_on_pre_screening_questionaire() throws Throwable {
//			Thread.sleep(2000);
		   driver.findElement(By.xpath("(//li[@class='sui-single-option-facet__item inactive'])[3]")).click();
		}
		@When("^recruiter clicks on select questions button$")
		public void recruiter_clicks_on_select_questions_button() throws Throwable {
			Thread.sleep(2000);
		   driver.findElement(By.xpath("//button[text()='Select Questions']")).click();
		}
		@When("^recruiter clicks on Add Question button$")
		public void recruiter_clicks_on_Add_Question_button() throws Throwable {
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.findElement(By.xpath("//button[text()='Add Question']")).click();
		   
		}
		@When("^recruiter adds essay text type question$")
		public void recruiter_adds_essay_text_type_question() throws Throwable {
//			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@name='question']")).sendKeys("done any course on java?");
//			Thread.sleep(2000);
		    driver.findElement(By.xpath("(//span[@class='bx--radio-button__appearance'])[1]")).click();
//			Thread.sleep(2000);
			WebElement category=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			category.sendKeys("hr");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			Thread.sleep(3000);
			category.sendKeys(Keys.ARROW_DOWN);
//			Thread.sleep(2000);
			category.sendKeys(Keys.ENTER);
//			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Submit')])[1]")).click(); 
		}
		@When("^recruiter adds numeric type question$")
		public void recruiter_adds_numeric_type_question() throws Throwable {
//			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Add Question']")).click();
//			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@name='question']")).sendKeys("what is your % in graduation ?");
//			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class='bx--radio-button__appearance'])[2]")).click();
//			Thread.sleep(2000);
			WebElement category=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			category.sendKeys("hr");
//			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			category.sendKeys(Keys.ARROW_DOWN);
//			Thread.sleep(2000);
			category.sendKeys(Keys.ENTER);
//			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Submit')])[1]")).click(); 
			
		}

		@When("^recruiter adds yes or no question$")
		public void recruiter_adds_yes_or_no_question() throws Throwable {
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[text()='Add Question']")).click();
//			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@name='question']")).sendKeys("are you willing to relocate ?");
//			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class='bx--radio-button__appearance'])[3]")).click();
//			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class='bx--toggle__switch']")).click();
//			Thread.sleep(2000);
			WebElement category=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			category.sendKeys("hr");
//			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			category.sendKeys(Keys.ARROW_DOWN);
//			Thread.sleep(2000);
			category.sendKeys(Keys.ENTER);
//			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Submit')])[1]")).click(); 
		}

		@When("^recruiter adds multiple choice question$")
		public void recruiter_adds_multiple_choice_question() throws Throwable {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Add Question']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@name='question']")).sendKeys("what is your previous salary range ?");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class='bx--radio-button__appearance'])[4]")).click();
			Thread.sleep(2000);
			WebElement option=driver.findElement(By.xpath("//div[text()='Enter options here...']"));
			option.sendKeys("5LPA-10LPA");
			Thread.sleep(3000);
			option.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			option.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			WebElement chooseOa=driver.findElement(By.xpath("//div[text()='Select...']"));
			chooseOa.sendKeys("5LPA-10LPA");
			Thread.sleep(3000);
			chooseOa.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			chooseOa.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			WebElement category=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			category.sendKeys("hr");
			Thread.sleep(3000);
			category.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			category.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Submit')])[1]")).click();
		}

		@When("^recruiter adds weighted choice question$")
		public void recruiter_adds_weighted_choice_question() throws Throwable {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Add Question']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@name='question']")).sendKeys("how many hours can you to work for a day?");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class='bx--radio-button__appearance'])[5]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='rating-option-0']")).sendKeys("8hrs");
			driver.findElement(By.xpath("//input[@id='optionScore-0']")).sendKeys("20");
			Thread.sleep(3000);
			WebElement chooseopt=driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[1]"));
			chooseopt.sendKeys("8hrs");
			Thread.sleep(3000);
			chooseopt.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			chooseopt.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			WebElement category=driver.findElement(By.xpath("//input[@id='react-select-20-input']"));
			category.sendKeys("hr");
			Thread.sleep(3000);
			category.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			category.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Submit')])[1]")).click();	
		}

		@When("^recruiter adds file type question$")
		public void recruiter_adds_file_type_question() throws Throwable {
			Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[text()='Add Question']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@name='question']")).sendKeys("upload aaddhar");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class='bx--radio-button__appearance'])[6]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='bx--file__drop-container']")).click();
			Thread.sleep(2000);
			Robot rbt = new Robot(); 
		    StringSelection str = new StringSelection("C:\\Users\\paul\\Downloads\\VinayResume.docx");
		    Thread.sleep(2000);
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		    rbt.keyPress(KeyEvent.VK_CONTROL);
		    rbt.keyPress(KeyEvent.VK_V);
		    rbt.keyRelease(KeyEvent.VK_CONTROL);
		    rbt.keyRelease(KeyEvent.VK_V);
		    rbt.keyPress(KeyEvent.VK_ENTER);
		    rbt.keyRelease(KeyEvent.VK_ENTER);
		    Thread.sleep(2000);
		    WebElement fileformat=driver.findElement(By.xpath("//div[text()='Select...']"));
			fileformat.sendKeys(".pdf");
			Thread.sleep(3000);
			fileformat.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			fileformat.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		    WebElement category=driver.findElement(By.xpath("//input[@id='react-select-20-input']"));
			category.sendKeys("hr");
			Thread.sleep(3000);
			category.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			category.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Submit')])[1]")).click();
		}

		@When("^Select questions from displayed List$")
		public void select_questions_from_displayed_List() throws Throwable {
//			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[@class='bx--table-column-checkbox'])[1]")).click();
			}

		@Then("^click on Add Selected option$")
		public void click_on_Add_Selected_option() throws Throwable {
//			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Add Selected']")).click();  
		}

		@Given("^recruiter Clicks on Attachments section$")
		public void recruiter_Clicks_on_Attachments_section() throws Throwable {
//			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='Attachments'])")).click();
//			Thread.sleep(2000);
			
		}

		@When("^recruiter uploads Attachment file$")
		public void recruiter_uploads_Attachment_file() throws Throwable {
//			Thread.sleep(3000);
			//driver.findElement(By.xpath("//div[@class='bx--file__drop-container']")).click();
			WebElement blkupload=driver.findElement(By.xpath("//input[@type='file']"));
			String absolutepath=new File("Uploadfiles\\jr.docx").getAbsolutePath();
			blkupload.sendKeys(absolutepath);
//			Thread.sleep(2000);
//			Robot rb = new Robot(); 
//		    StringSelection str = new StringSelection("C:\\Users\\paul\\Downloads\\VinayResume.docx");
//		    Thread.sleep(2000);
//		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//		     rb.keyPress(KeyEvent.VK_CONTROL);
//		     rb.keyPress(KeyEvent.VK_V);
//		     rb.keyRelease(KeyEvent.VK_CONTROL);
//		     rb.keyRelease(KeyEvent.VK_V);
//		     rb.keyPress(KeyEvent.VK_ENTER);
//		     rb.keyRelease(KeyEvent.VK_ENTER);

		}

		@Then("^click on submit after uploading file$")
		public void click_on_submit_after_uploading_file() throws Throwable {
			driver.findElement(By.xpath("(//button[@class='bx--btn bx--btn--primary'])[1]")).click();
			 Thread.sleep(3000);
		}
		
		
		//sign in apply
		
		
		
		@Given("^Candidate clicks on job link$")
		public void candidate_clicks_on_job_link() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		    driver = new ChromeDriver();
//		    driver.manage().deleteAllCookies();
//		    driver.manage().window().maximize();
//		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			   System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
				ChromeOptions options=new ChromeOptions();
				options.addArguments("headless");
				options.addArguments("disable-gpu");
				driver=new ChromeDriver(options);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		    driver.navigate().to(linktoapply);
		}

		@When("^Candidate clicks on apply button of Job$")
		public void candidate_clicks_on_apply_button_of_Job() throws Throwable {
			driver.findElement(By.xpath("//a[@id='hs-eu-confirmation-button']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[contains(text(),'Apply Now')]")).click();   
		}

		@When("^candidate choose sign in option to apply$")
		public void candidate_choose_sign_in_option_to_apply() throws Throwable {
			 driver.findElement(By.xpath("(//span[@class='bx--radio-button__appearance'])[2]")).click();  
		}

		@Given("^candidate click on register Link$")
		public void candidate_click_on_register_Link() throws Throwable {
			driver.findElement(By.xpath("//a[text()='Register']")).click();
		}

		@When("^candidate enter first name \"([^\"]*)\"$")
		public void candidate_enter_first_name(String fname) throws Throwable {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(fname);
		}

		@When("^candidate enter last name \"([^\"]*)\"$")
		public void candidate_enter_last_name(String lname) throws Throwable {
			driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lname); 
		}

		@When("^candidate enters email \"([^\"]*)\"$")
		public void candidate_enters_email(String email) throws Throwable {
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);  
		}

		@When("^candidate enters password \"([^\"]*)\"$")
		public void candidate_enters_password(String pwd) throws Throwable {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		}

		@When("^candidate enters conformpassword \"([^\"]*)\"$")
		public void candidate_enters_conformpassword(String cnfmpwd) throws Throwable {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='confirmpassword']")).sendKeys(cnfmpwd);  
		}

		@When("^candidate accepts terms and conditions$")
		public void candidate_accepts_terms_and_conditions() throws Throwable {
			driver.findElement(By.xpath("//label[@class='bx--checkbox-label']")).click();  
		}

		@When("^candidate enters submit button of registration$")
		public void candidate_enters_submit_button_of_registration() throws Throwable {
			Thread.sleep(4000);
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
		}

		@Then("^candidate clicks on click here to login$")
		public void candidate_clicks_on_click_here_to_login_span_class_xpa_link() throws Throwable {
			driver.findElement(By.xpath("//span[@class='xpa-link']")).click();   
		}
		@When("^candidate enters mail \"([^\"]*)\" to login$")
		public void candidate_enters_mail_to_login(String email) throws Throwable {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(email);  
		}

		@When("^candidate enters password \"([^\"]*)\" to login$")
		public void candidate_enters_password_to_login(String pwd) throws Throwable {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);  
		}
	     //captcha included in below step
		@When("^candidate clicks on login button$")
		public void candidate_clicks_on_login_button() throws Throwable {
		//driver.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		}
		@Then("^Signed in Candidate click on Apply button of Job$")
		public void signed_in_Candidate_click_on_Apply_button_of_Job() throws Throwable {
			Thread.sleep(2000);
			driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(3000);
			WebElement applybtn=driver.findElement(By.xpath("//span[text()='Apply']"));
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.elementToBeClickable(applybtn));
			Thread.sleep(2000); 
			driver.findElement(By.xpath("//span[text()='Apply']")).click();
			Thread.sleep(2000);
		}

		@When("^Candidate enters first name \"([^\"]*)\"$")
		public void candidate_enters_first_name(String fname) throws Throwable {
			driver.findElement(By.xpath("//input[@id='candidateFirstName']")).sendKeys(fname); 
		}

		@When("^Candidate enters last name \"([^\"]*)\"$")
		public void candidate_enters_last_name(String lname) throws Throwable {
			WebElement lastname=driver.findElement(By.xpath("//input[@id='candidateLastName']"));
			 lastname.sendKeys(lname); 
		}

		@When("^Candidate  chooses Country \"([^\"]*)\"$")
		public void candidate_chooses_Country(String arg1) throws Throwable {
			Select country=new Select(driver.findElement(By.xpath("//select[@class='bx--select-input']")));
			country.selectByValue("105");   
		}

		@When("^Candidate enters phone no \"([^\"]*)\"$")
		public void candidate_enters_phone_no(String phno) throws Throwable {
			driver.findElement(By.id("candidatePhoneNumber")).sendKeys(phno);   
		}

		@When("^Candidate enters Email Address \"([^\"]*)\"$")
		public void candidate_enters_Email_Address(String email) throws Throwable {
			driver.findElement(By.id("candidateEmail")).sendKeys(email);  
		}
        // ----------------------SIGN IN APPLY -----------------------------
		@When("^click on checkbox to recieve whatsapp notifications$")
		public void click_on_checkbox_to_recieve_whatsapp_notifications() throws Throwable {
		driver.findElement(By.xpath("//label[@class='bx--checkbox-label consent-whatsapp-notif-2']")).click();	   
		}
		@When("^Candidate uploads his resume$")
		public void candidate_uploads_his_resume() throws Throwable {
			Thread.sleep(2000);
			WebElement blkupload=driver.findElement(By.xpath("//input[@type='file']"));
			String absolutepath=new File("Uploadfiles\\VinayResume.docx").getAbsolutePath();
			blkupload.sendKeys(absolutepath);
			//driver.findElement(By.className("bx--file__drop-container")).click();
//			Robot rb = new Robot();
//			StringSelection str = new StringSelection("C:\\Users\\paul\\Downloads\\VinayResume.docx");
//			Thread.sleep(2000);
//			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//			rb.keyPress(KeyEvent.VK_CONTROL);
//			rb.keyPress(KeyEvent.VK_V);
//			rb.keyRelease(KeyEvent.VK_CONTROL);
//			rb.keyRelease(KeyEvent.VK_V);
//			rb.keyPress(KeyEvent.VK_ENTER);
//			rb.keyRelease(KeyEvent.VK_ENTER); 
		}
		@Then("^signedin Candidate accepts t and c by clicking on checkbox$")
		public void signedin_Candidate_accepts_t_and_c_by_clicking_on_checkbox() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(3000);
			JavascriptExecutor jq=(JavascriptExecutor)driver;
			jq.executeScript("document.querySelector(\"label[for=agree-privacy-policy-2]\").click();");  
		}
		@Then("^Candidate accepts terms and conditions by clicking on checkbox$")
		public void candidate_accepts_terms_and_conditions_by_clicking_on_checkbox() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(3000);
			JavascriptExecutor jq=(JavascriptExecutor)driver;
			jq.executeScript("document.querySelector('label.bx--checkbox-label',':before').click();");
		}
	    //--------------APPLY------AS-----------GUEST------------------------
		@When("^candidate choose to apply as guest$")
		public void candidate_choose_to_apply_as_guest() throws Throwable {
		Thread.sleep(2000);
	    driver.findElement(By.xpath("(//span[@class='bx--radio-button__appearance'])[1]")).click();
		}
		@Then("^clicks on Next Button$")
		public void clicks_on_Next_Button() throws Throwable {
			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		}

		@When("^candidate fills about me text field$")
		public void candidate_fills_about_me_text_field() throws Throwable {
			driver.findElement(By.xpath("(//textarea[@id='summary'])[1]")).sendKeys("My name is Vinay.Icompleted my graduation in xyz university & trained on testing tools");
		}

		@When("^Candidate clicks on edit option of EducationA$")
		public void candidate_clicks_on_edit_option_of_EducationA() throws Throwable {
			driver.findElement(By.xpath("//a[@id='editEdu-1']")).click(); 
		}

		@When("^enters InstituteA Name \"([^\"]*)\"$")
		public void enters_InstituteA_Name(String insa) throws Throwable {
			driver.findElement(By.xpath("(//input[@id='institution'])[1]")).sendKeys(insa); 
		}

		@When("^choose country of instituteA$")
		public void choose_country_of_instituteA() throws Throwable {
			Select Country=new Select(driver.findElement(By.xpath("(//select[@class='bx--select-input'])[1]")));
			Country.selectByValue("India");  
		}

		@When("^choose city of instituteA \"([^\"]*)\"$")
		public void choose_city_of_instituteA(String citya) throws Throwable {
			driver.findElement(By.xpath("(//input[@placeholder='Enter City'])[1]")).sendKeys(citya); 
		}

		@When("^select Qualification from InstituteA \"([^\"]*)\"$")
		public void select_Qualification_from_InstituteA(String qual1) throws Throwable {
			Select Edulevel=new Select(driver.findElement(By.xpath("(//select[@class='bx--select-input'])[2]")));
			Edulevel.selectByVisibleText(qual1);
		}

		@When("^Enter CGPA got in InstituteA \"([^\"]*)\"$")
		public void enter_CGPA_got_in_InstituteA(String cgpa1) throws Throwable {
			driver.findElement(By.xpath("(//input[@id='gpa'])[1]")).sendKeys(cgpa1);
		}

		@When("^choose start date of InstituteA \"([^\"]*)\"$")
		public void choose_start_date_of_InstituteA(String sd1) throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//input[@placeholder='Start Date'])[1]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Select moji1=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
			moji1.selectByValue("5");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Select yoji1=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
			yoji1.selectByVisibleText("2018");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//div[@role='option'])[9]")).click();
		}

		@When("^choose ending date of InstitueA \"([^\"]*)\"$")
		public void choose_ending_date_of_InstitueA(String ed1) throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//input[@placeholder='End Date'])[1]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Select moji1=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
			moji1.selectByValue("4");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Select yoji1=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
			yoji1.selectByVisibleText("2021");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//div[@role='option'])[10]")).click();
		}

		@When("^Click on Save Button of EduA$")
		public void click_on_Save_Button_of_EduA() throws Throwable {
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[text()='Save'])[1]")).click();
		}
		
		@When("^candidate clicks on delete Qb and Qc$")
		public void candidate_clicks_on_delete_Qb_and_Qc() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@id='delEdu-2']")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@id='delEdu-2']")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			Thread.sleep(3000);
		}
		

		@When("^Candidate clicks on edit option of EducationB$")
		public void candidate_clicks_on_edit_option_of_EducationB() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@id='editEdu-2']")).click();
		}

		@When("^enters InstituteB Name \"([^\"]*)\"$")
		public void enters_InstituteB_Name(String insb) throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//input[@id='institution'])[1]")).sendKeys(insb);
		}

		@When("^choose country of instituteB$")
		public void choose_country_of_instituteB() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Select CountryC2=new Select(driver.findElement(By.xpath("//select[@id='country']")));
			CountryC2.selectByValue("India");
		}

		@When("^choose city of instituteB \"([^\"]*)\"$")
		public void choose_city_of_instituteB(String cityb) throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//input[@placeholder='Enter City'])[1]")).sendKeys(cityb); 
		}

		@When("^select Qualification from InstituteB \"([^\"]*)\"$")
		public void select_Qualification_from_InstituteB(String arg1) throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Select EdulevelE2=new Select(driver.findElement(By.xpath("//select[@id='degree']")));
			EdulevelE2.selectByVisibleText("Diploma");
		}

		@When("^Enter CGPA got in InstituteB \"([^\"]*)\"$")
		public void enter_CGPA_got_in_InstituteB(String cgpa) throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//input[@id='gpa'])[1]")).sendKeys(cgpa);
		}

		@When("^choose start date of InstituteB \"([^\"]*)\"$")
		public void choose_start_date_of_InstituteB(String sd2) throws Throwable {
			
			driver.findElement(By.xpath("(//input[@placeholder='Start Date'])[1]")).click();
			Thread.sleep(3000);
			Select moj=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
			moj.selectByValue("5");
			Thread.sleep(3000);
			Select yoj=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
			yoj.selectByVisibleText("2015");
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[@role='option'])[9]")).click();
		}

		@When("^choose ending date of InstitueB \"([^\"]*)\"$")
		public void choose_ending_date_of_InstitueB(String ed2) throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//input[@placeholder='End Date'])[1]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Select moj=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
			moj.selectByValue("5");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Select yoj=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
			yoj.selectByVisibleText("2018");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//div[@role='option'])[9]")).click();
		}

		@When("^Click on Save Button of EduB$")
		public void click_on_Save_Button_of_EduB() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[text()='Save']")).click(); 
		}

		@When("^Candidate clicks on edit option of EducationC$")
		public void candidate_clicks_on_edit_option_of_EducationC() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@id='editEdu-3']")).click();
		}

		@When("^enters InstituteC Name \"([^\"]*)\"$")
		public void enters_InstituteC_Name(String insc) throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//input[@id='institution'])[1]")).sendKeys(insc); 
		}

		@When("^choose country of instituteC$")
		public void choose_country_of_instituteC() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Select CountryC3=new Select(driver.findElement(By.xpath("//select[@id='country']")));
			CountryC3.selectByValue("India");
		}

		@When("^choose city of instituteC \"([^\"]*)\"$")
		public void choose_city_of_instituteC(String cityc) throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//input[@placeholder='Enter City'])[1]")).sendKeys(cityc);
		}

		@When("^select Qualification from InstituteC \"([^\"]*)\"$")
		public void select_Qualification_from_InstituteC(String Q3) throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Select EdulevelE3=new Select(driver.findElement(By.xpath("//select[@id='degree']")));
			EdulevelE3.selectByVisibleText(Q3);
		}

		@When("^Enter CGPA got in InstituteC \"([^\"]*)\"$")
		public void enter_CGPA_got_in_InstituteC(String cgpa) throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//input[@id='gpa'])[1]")).sendKeys(cgpa); 
		}

		@When("^choose start date of InstituteC \"([^\"]*)\"$")
		public void choose_start_date_of_InstituteC(String sd3) throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//input[@placeholder='Start Date'])[1]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Select moj=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
			moj.selectByValue("5");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Select yoj=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
			yoj.selectByVisibleText("2013");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//div[@role='option'])[9]")).click();
		}

		@When("^choose ending date of InstitueC \"([^\"]*)\"$")
		public void choose_ending_date_of_InstitueC(String ed3) throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//input[@placeholder='End Date'])[1]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Select moj=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
			moj.selectByValue("4");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Select yoj=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
			yoj.selectByVisibleText("2015");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//div[@role='option'])[9]")).click();
		}

		@When("^Click on Save Button of EduC$")
		public void click_on_Save_Button_of_EduC() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[text()='Save']")).click(); 
		}
		@When("^candidate adds work experience$")
		public void candidate_adds_work_experience() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='addExp']")).click();
		driver.findElement(By.xpath("//input[@id='position']")).sendKeys("Sr Tester");
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("XYZ");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Select CountryC3=new Select(driver.findElement(By.xpath("//select[@id='country']")));
		CountryC3.selectByValue("India");
		driver.findElement(By.xpath("//input[@id='location']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("(//textarea[@id='summary'])[2]")).sendKeys("exp in cucumber frame work");
		driver.findElement(By.xpath("(//input[@placeholder='Start Date'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Select moj=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
		moj.selectByValue("5");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Select yoj=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
		yoj.selectByVisibleText("2019");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[@role='option'])[9]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//input[@placeholder='End Date'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Select moc=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
		moc.selectByValue("4");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Select yoc=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
		yoc.selectByVisibleText("2022");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[@role='option'])[9]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[@for='curr-company-0']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		
		}

		@When("^candidate adds certifications$")
		public void candidate_adds_certifications() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@id='addCert']")).click();
			driver.findElement(By.xpath("//input[@id='Title']")).sendKeys("Certification");
			driver.findElement(By.xpath("//input[@id='abbreviation']")).sendKeys("Abbrevation");
			driver.findElement(By.xpath("//input[@id='type']")).sendKeys("tempo");
			driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("organization");
			driver.findElement(By.xpath("(//input[@id='location'])[1]")).sendKeys("city");
			driver.findElement(By.xpath("(//button[text()='Save'])[1]")).click();
		}

		@Then("^candidate clicks on add button of project$")
		public void candidate_clicks_on_add_button_of_project() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@id='addProject']")).click(); 
		}

		@When("^candidate enters project title \"([^\"]*)\"$")
		public void candidate_enters_project_title(String projtitle) throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@id='project']")).sendKeys(projtitle); 
		}

		@When("^candidate enters Description of project \"([^\"]*)\"$")
		public void candidate_enters_Description_of_project(String projdisc) throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//textarea[@id='summary'])[2]")).sendKeys(projdisc); 
		}

		@When("^Candidate selects project start and end dates$")
		public void candidate_selects_project_start_and_end_dates() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
			driver.findElement(By.xpath("//input[@placeholder='Start Date']")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Select mos=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
			mos.selectByValue("5");
			Select yos=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
			yos.selectByVisibleText("2021");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//div[@role='option'])[9]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@placeholder='End Date']")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Select moc=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
			moc.selectByValue("8");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Select yoc=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
			yoc.selectByVisibleText("2021");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//div[@role='option'])[9]")).click();
		}

		@When("^Click on Save button of project$")
		public void click_on_Save_button_of_project() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[text()='Save']")).click();
		}
		@When("^signed in Candidate click on Submit Button$")
		public void signed_in_Candidate_click_on_Submit_Button() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[text()='Submit']")).click();   
		}
		@When("^Candidate click on next Button$")
		public void candidate_click_on_next_Button() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[text()='Next']")).click();
		}

		@When("^candidate rate for skills$")
		public void candidate_rate_for_skills() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//i[@class='fa fa-star'])[2]")).click();
			driver.findElement(By.xpath("(//i[@class='fa fa-star'])[7]")).click();
		}

		@When("^candidate click on submit button of Application$")
		public void candidate_click_on_submit_button_of_Application() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			
		}

		@Given("^close Browser$")
		public void close_Browser() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.close();
		}
		
		
		
		//---------------APPLICATION INFO------------------------------------
		
		
		
		@Then("^Recruiter clicks on source menu$")
		public void recruiter_clicks_on_source_menu() throws Throwable {
			Thread.sleep(5000);
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//a[@class='bx--header__menu-item'])[3]")).click();
		}

		@Then("^Recruiter clicks on all applicants section$")
		public void recruiter_clicks_on_all_applicants_section() throws Throwable {
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.linkText("All Applicants")).click();
           }
		@Then("^Recruiter clicks on any Application$")
		public void recruiter_clicks_on_any_Application() throws Throwable {
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//       	 Thread.sleep(2000); 
//       	 driver.findElement(By.xpath("//i[@class='fa fa-filter']")).click();
//       	 driver.findElement(By.xpath("//span[text()='Application ID']")).click();
//       	 Thread.sleep(2000);
//       	 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("657239");//---------------------------------------APPLICATION ID
//       	 Thread.sleep(2000);
//       	 driver.findElement(By.xpath("(//button[text()='Apply'])[1]")).click();
//       	 Thread.sleep(2000);
//       	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	    driver.findElement(By.xpath("(//span[text()='uday a3'])[1]")).click();//---------------------------------------------APPLICATION INFO
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Select filterby=new Select(driver.findElement(By.xpath("(//select[@id='select-1'])[1]")));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			filterby.selectByValue("appIdDsc");                                              //  
			Thread.sleep(2000);                            //(//span[text()='Thomas light'])[1]
			driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);          
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[text()='uday a10'])[1]")).click();  //---------------------------------------APPLICATION INFO
			
		}                                

		@Then("^Recruiter downloads cv of applicant$")
		public void recruiter_downloads_cv_of_applicant() throws Throwable {
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.linkText("Download CV")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Set<String> ids=driver.getWindowHandles();
			Iterator<String> it=ids.iterator();
			String parentid=it.next();
			String childid=it.next();
			driver.switchTo().window(childid).close();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.switchTo().window(parentid);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		}

		@Then("^Recruiter downloads report of candidate$")
		public void recruiter_downloads_report_of_candidate() throws Throwable {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@class='bx--btn bx--btn--tertiary']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[@class='bx--btn bx--btn--primary'])[1]")).click(); 
		}
		@When("^Recruiter clicks on candidates Resume$")
		public void recruiter_clicks_on_candidates_Resume() throws Throwable {
			Thread.sleep(9000);
			JavascriptExecutor js1=(JavascriptExecutor)driver;
			js1.executeScript("window.scrollBy(0,700)");//above steps only required when we skip downloads
			Thread.sleep(2000);
			WebElement resume=driver.findElement(By.xpath("//a[@id='resume']"));
			Actions act=new Actions(driver);
			act.moveToElement(resume);
			resume.click();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,400)");
		}

		@When("^Recruiter clicks on candidates Interview Status$")
		public void recruiter_clicks_on_candidates_Interview_Status() throws Throwable {
//			driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@id='is']")).click();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
		}
		@Then("^Recruiter enables autosend pre screening Questions$")
		public void recruiter_enables_autosend_pre_screening_Questions() throws Throwable {
			Thread.sleep(2000);
//			driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[@for='sendPreInterviewQuestionToCandApplicant']")).click();
  		
		}

		@Then("^Recruiter shortlists the candidate$")
		public void recruiter_shortlists_the_candidate() throws Throwable {
//			driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//button[text()='Shortlist'])[2]")).click();  
		}

		@Then("^Recruiter sends shortlist Mail$")
		public void recruiter_sends_shortlist_Mail() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//label[@for='sendEmalOnShortlist']")).click();
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);
//		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		}

		@Then("^Recruiter choose already have concent option$")
		public void recruiter_choose_already_have_concent_option() throws Throwable {
			Thread.sleep(5000);
			Thread.sleep(3000);
//			WebElement AHC=driver.findElement(By.xpath("//button[@id='have-consent-btn']"));
////			driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//			WebDriverWait wait=new WebDriverWait(driver,20);
//			wait.until(ExpectedConditions.elementToBeClickable(AHC));
			driver.findElement(By.xpath("//button[@id='have-consent-btn']")).click();	
		    		}

		@Then("^Recruiter clicks on add pre interview stage button$")
		public void recruiter_clicks_on_add_pre_interview_stage_button() throws Throwable { 
			WebElement addpreint=driver.findElement(By.xpath("//button[text()='Add Pre Interview Stage']"));
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);                          // ENHANCE
			Thread.sleep(2000);
			addpreint.click();   
		}

		@Then("^Recruiter clicks on add interview stage button$")
		public void recruiter_clicks_on_add_interview_stage_button() throws Throwable {
			Thread.sleep(3000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,400)");
			Thread.sleep(2000);
            WebElement adintstag=driver.findElement(By.xpath("(//button[text()='Add Interview Stage'])[1]")); 
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			adintstag.click();
		}

		@Then("^Recruiter chooses Interview type phone round$")
		public void recruiter_chooses_Interview_type() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='radio-3']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Select interviewround=new Select(driver.findElement(By.id("workflowStage")));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		interviewround.selectByVisibleText("Phone Interview");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='stageName']")).sendKeys("phone Round");
		driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();  
		}
		@Then("^Recruiter again clicks on add interview stage button$")
		public void recruiter_again_clicks_on_add_interview_stage_button() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(3000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,-1500)");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@id='interviewStage'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[text()='Add Interview Stage'])[1]")).click(); 
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//div[@id='interviewStage'])[2]")).click();
//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		@Then("^Recruiter chooses Interview type Onsite$")
		public void recruiter_chooses_Interview_type_Onsite() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//label[@for='radio-3']")).click();
//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//			driver.findElement(By.xpath("//select[@class='bx--select-input']")).click();
//			driver.findElement(By.xpath("(//option[@class='bx--select-option'])[3]")).click();
//			Select stage=new Select(driver.findElement(By.id("workflowStage")));
//			stage.selectByValue("Onsite Interview");
//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			    
		}

         @Then("^again recruiter clicks on add interview stage button$")
         public void again_recruiter_clicks_on_add_interview_stage_button() throws Throwable {
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 			Thread.sleep(3000);
 			JavascriptExecutor js=(JavascriptExecutor)driver;
 			js.executeScript("window.scrollBy(0,-1500)");
 			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 			Thread.sleep(3000);
 			driver.findElement(By.xpath("(//div[@id='interviewStage'])[2]")).click();
 			Thread.sleep(3000);
 			driver.findElement(By.xpath("(//button[text()='Add Interview Stage'])[1]")).click(); 
 			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 			Thread.sleep(2000);
        }
         @Then("^recruiter chooses Coding or Whiteboard Assessment$")
         public void recruiter_chooses_Coding_or_Whiteboard_Assessment() throws Throwable {
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  			Thread.sleep(3000);
  			JavascriptExecutor js=(JavascriptExecutor)driver;
  			js.executeScript("window.scrollBy(0,-1500)");
  			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  			Thread.sleep(3000);
  			driver.findElement(By.xpath("(//div[@id='interviewStage'])[3]")).click();
  			Thread.sleep(3000);
  			driver.findElement(By.xpath("(//button[text()='Add Interview Stage'])[1]")).click(); 
  			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  			Thread.sleep(4000); 
   			driver.findElement(By.xpath("//label[@for='radio-4']")).click();
   			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         	Thread.sleep(3000);
         	driver.findElement(By.xpath("//input[@id='codingAssessName']")).sendKeys("Coding Questions");
         	driver.findElement(By.xpath("//textarea[@id='codingQues']")).sendKeys("where can we use if else statement ?");
         	driver.findElement(By.xpath("//button[text()='Submit']")).click();
         	Thread.sleep(2000);
         	JavascriptExecutor js1=(JavascriptExecutor)driver;
  			js1.executeScript("window.scrollBy(0,300)");
  			Thread.sleep(2000);
  			driver.findElement(By.xpath("(//span[text()='Skip'])[4]")).click();
  			Thread.sleep(2000);
  			
         }
          @Then("^Recruiter chooses Interview type Online$")
          public void recruiter_chooses_Interview_type_Online() throws Throwable {
        	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  			Thread.sleep(3000);
  			driver.findElement(By.xpath("//label[@for='radio-3']")).click();
  			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	Thread.sleep(3000);
        	Select stage=new Select(driver.findElement(By.id("workflowStage")));
        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        	Thread.sleep(2000);
        	stage.selectByVisibleText("Online Interview");
        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        	Thread.sleep(2000);
        	driver.findElement(By.xpath("//input[@id='stageName']")).sendKeys("online Round");
//        	Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@id='interviewStage'])[3]")).click();
//			Thread.sleep(2000);
        }
          @When("^recruiter choose meeting type$")
          public void recruiter_choose_meeting_type() throws Throwable {
        	Select meettype=new Select(driver.findElement(By.xpath("//select[@id='meetingType']")));
          	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
          	Thread.sleep(2000);
          	meettype.selectByVisibleText("Zoom Meeting");
          }
//TRIAL ONSITE
        @Then("^recruiter chooses onsite round$")
         public void recruiter_chooses_onsite_round() throws Throwable {
        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	Thread.sleep(3000);
        	Select stage=new Select(driver.findElement(By.id("workflowStage")));
        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	Thread.sleep(2000);
        	stage.selectByVisibleText("Onsite Interview");
        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        	Thread.sleep(2000);
        	driver.findElement(By.xpath("//input[@id='stageName']")).sendKeys("onsite Round");
//        	Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@id='interviewStage'])[2]")).click();
//			Thread.sleep(2000);
			
         }

		@Then("^Recruiter schedules interview by clicking on blue arrow$")
		public void recruiter_schedules_interview_by_clicking_on_blue_arrow() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='interviewStage']")).click();      //div[@id='interviewStage']
		}

		@Then("^Recruiter clicks on checkbox to directly send invite$")
		public void recruiter_clicks_on_checkbox_to_directly_send_invite() throws Throwable {
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[@for='directInviteSent']")).click();  
		}

		@Then("^Recruiter chooses Interview date and time$")
		public void recruiter_chooses_Interview_date_and_time() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,200)");
			driver.findElement(By.xpath("(//input[@placeholder='Select start date and time'])[1]")).sendKeys("18th Dec, 2022 08:00");
			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@title='End time']")).click();
//			Thread.sleep(2000);
		}
		@Then("^recruiter selects end date and time$")
		public void recruiter_selects_end_date_and_time() throws Throwable {
			Thread.sleep(3000);
			Actions act=new Actions(driver);
		    driver.findElement(By.xpath("(//input[@placeholder='Select end date and time'])[1]")).click();
		    JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,200)");
//			act.click(endtime).perform();
			Thread.sleep(2000);
			WebElement enddate=driver.findElement(By.xpath("//li[text()='08:15']"));
	        act.moveToElement(enddate);
			enddate.click();
			
		}
		
        @Then("^Recruiter clicks on schedule an interview button$")
        public void recruiter_clicks_on_schedule_an_interview_button() throws Throwable {
        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[text()='Schedule an interview'])[1]")).click();
        }
        @Then("^recruiter clicks on start meeting button$")
        public void recruiter_clicks_on_start_meeting_button() throws Throwable {
        	JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,-200)");
			 Thread.sleep(3000);
			WebElement link1=driver.findElement(By.xpath("(//a[text()='Start Meeting'])[1]"));
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.elementToBeClickable(link1));
			link1.click();
			Set<String> ids=driver.getWindowHandles();
			Iterator<String> it=ids.iterator();
			String parentid=it.next();
			String childid=it.next();
			driver.switchTo().window(childid).close();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.switchTo().window(parentid);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
        }
        @Then("^recruiter enables already have consent from candidate$")
        public void recruiter_enables_already_have_consent_from_candidate() throws Throwable {
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("(//button[text()='Schedule Interview'])[1]")).click(); //schedule interview button
        	Thread.sleep(3000);
        	JavascriptExecutor js=(JavascriptExecutor)driver;
        	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        	driver.findElement(By.xpath("(//span[@class='bx--toggle__switch'])[14]")).click(); 
        }
        @Then("^Recruiter clicks on yes if candidate attended interview$")
        public void recruiter_clicks_on_yes_if_candidate_attended_interview() throws Throwable {
        	Thread.sleep(3000);
        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(0,500)");
		    Thread.sleep(5000);   
//		    WebElement chooseyn=driver.findElement(By.xpath("(//input[@type='text'])[5]"));
     	    WebElement chooseyn=driver.findElement(By.xpath("(//div[@class=' css-yk16xz-control'])[5]"));    
		    chooseyn.click();
		    Thread.sleep(3000);      
		    driver.findElement(By.xpath("//div[text()='Yes']")).click();
		    Thread.sleep(3000);
        }

        @Then("^Recruiter clicks on mark this stage as complete$")
        public void recruiter_clicks_on_mark_this_stage_as_complete() throws Throwable {
        	Thread.sleep(2000);
        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	Thread.sleep(3000);
    		driver.findElement(By.xpath("//button[text()='Mark this stage as complete']")).click();   
        }
        @Then("^recruiter gives feedback on interview$")
        public void recruiter_gives_feedback_on_interview() throws Throwable {
        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	Thread.sleep(2000);
        	 driver.findElement(By.xpath("(//textarea[@id='test5'])[1]")).sendKeys("good"); 
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
        }

        @Then("^recruiter rates candidate$")
        public void recruiter_rates_candidate() throws Throwable {
        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	Thread.sleep(2000);
        	driver.findElement(By.xpath("(//i[@class='fa fa-star'])[2]")).click();
        	Thread.sleep(2000);
        	JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,200)");
        }

        @Then("^recruiter accepts candidate$")
        public void recruiter_accepts_candidate() throws Throwable 
        {
        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	Thread.sleep(2000);
        	driver.findElement(By.xpath("//button[text()='Accept']")).click();
        	Thread.sleep(3000);
        }
        @Then("^recruiter takes final decision on interview$")
        public void recruiter_takes_final_decision_on_interview() throws Throwable {
        	Thread.sleep(5000);
        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	driver.findElement(By.xpath("(//span[@class='bx--toggle__switch'])[3]")).click();
//        	final decision dropdown to provide feedback
        	Thread.sleep(4000);
        	driver.findElement(By.xpath("//div[text()='Final Decision']")).click();
        	//feedback text field
        	JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,700)");
//			WebElement feedback=driver.findElement(By.xpath("(//div[@class='bx--form-item'])[2]"));
//			WebDriverWait wait=new WebDriverWait(driver,20);
//			wait.until(ExpectedConditions.elementToBeClickable(feedback));
//			Thread.sleep(2000)
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	driver.findElement(By.xpath("(//textarea[@class='bx--text-area some-class'])[1]")).sendKeys("Good");
        	Thread.sleep(3000);
        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
        	//ratin
        	Thread.sleep(3000);
        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	driver.findElement(By.xpath("(//i[@class='fa fa-star'])[12]")).click();
        	//accept
        	Thread.sleep(3000);
        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	driver.findElement(By.xpath("//button[text()='Accept']")).click();
        	Thread.sleep(3000);
        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	JavascriptExecutor jt=(JavascriptExecutor)driver;
			jt.executeScript("window.scrollBy(0,400)");
        	
        }
        	//sendofferconcent
        	@Then("^recruiter sends offer concent$")
        	public void recruiter_sends_offer_concent() throws Throwable {
//        		WebElement soc=driver.findElement(By.linkText("Send Offer Consent"));
//        		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        	    Thread.sleep(2000);
        		Thread.sleep(5000);
        		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    			driver.findElement(By.xpath("//button[text()='Send Offer Consent']")).click(); 
        	    Thread.sleep(3000);
    			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	    driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
        	    Thread.sleep(3000);
        	}
        
        	@Then("^recruiter resends offer concent$")
        	public void recruiter_resends_offer_concent() throws Throwable {
        		WebElement ofrcnsnt=driver.findElement(By.xpath("//button[text()='Resend Offer Consent']"));
        		WebDriverWait wait=new WebDriverWait(driver,20);
        		wait.until(ExpectedConditions.elementToBeClickable(ofrcnsnt));
        		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        		Thread.sleep(2000); 
            	driver.findElement(By.xpath("//button[text()='Resend Offer Consent']")).click();
            	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            	Thread.sleep(4000);
            	driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click(); 
        	}

        	@Then("^recruiter skips offer concent$")
        	public void recruiter_skips_offer_concent() throws Throwable {
        		Thread.sleep(4000);
        		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        		WebElement skipcnsnt=driver.findElement(By.xpath("//button[text()='Skip Offer Concent']"));
        		WebDriverWait wait=new WebDriverWait(driver,10);
        		wait.until(ExpectedConditions.elementToBeClickable(skipcnsnt));
        		Thread.sleep(2000);
        		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            	driver.findElement(By.xpath("//button[text()='Skip Offer Concent']")).click();
            	Thread.sleep(3000); 
        	}
        	@Then("^recruiter clicks on add offer to add offer details$")
        	public void recruiter_clicks_on_add_offer_to_add_offer_details() throws Throwable {
        	Thread.sleep(5000);
        		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
           WebElement offer=driver.findElement(By.xpath("//button[text()='Add Offer']"));
           Actions act=new Actions(driver);
           act.moveToElement(offer);
        	driver.findElement(By.xpath("//button[text()='Add Offer']")).click();
        	Thread.sleep(3000);
        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	driver.findElement(By.xpath("//input[@name='joiningDate']")).click();
        	//doj
        	Thread.sleep(2000);
        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
            Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//span[text()='25']")).click();
            Thread.sleep(3000);
            //manager name
            driver.findElement(By.xpath("//input[@name='managerName']")).sendKeys("Good Manager");
            //salary
            driver.findElement(By.xpath("//input[@name='salary']")).sendKeys("500000");
            //choose currency
            Select choosecurrency=new Select(driver.findElement(By.name("currencyId")));
            choosecurrency.selectByVisibleText("INR");
            Thread.sleep(4000);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            Select salarytype=new Select(driver.findElement(By.name("salaryTypeId")));
            salarytype.selectByVisibleText("yearly");
            //equity
            driver.findElement(By.name("equity")).sendKeys("2");
            //equity period
            driver.findElement(By.name("equityVestingPeriod")).sendKeys("3");
            //frequency
            Select frequency=new Select(driver.findElement(By.name("equityVestingInterval")));
            frequency.selectByVisibleText("yearly");
            //bonus
            driver.findElement(By.name("bonus")).sendKeys("5");
            //sickDaysAllowance
            driver.findElement(By.name("sickDaysAllowance")).sendKeys("5");
            //save
            driver.findElement(By.xpath("(//button[text()='Save'])[1]")).click();
        	}
            @Then("^recruiter clicks on send offer added$")
            public void recruiter_clicks_on_send_offer_added() throws Throwable {
            Thread.sleep(5000);
            	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS); 
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//button[text()='Send'])[1]")).click();
            Thread.sleep(4000);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
            Thread.sleep(3000);
            }  
           @When("^Recruiter clicks on candidates Approvals Table$")
		   public void recruiter_clicks_on_candidates_Approvals_Table() throws Throwable {
        	Thread.sleep(5000);
        	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	Thread.sleep(3000);
        	JavascriptExecutor je=(JavascriptExecutor)driver;
			je.executeScript("window.scrollBy(0,400)");
			Thread.sleep(2000);          
			driver.findElement(By.xpath("//a[@id='approvals']")).click(); 
//			Actions act=new Actions(driver);
//	        act.moveToElement(approvals);
//	        approvals.click();
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='Add Approver'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("approverEmail")).sendKeys("srrecruiter@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.name("shareMessage")).sendKeys("please take care of this interview");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
			Thread.sleep(3000);
			
		}

		@When("^Recruiter clicks on candidates Collaborators$")
		public void recruiter_clicks_on_candidates_Collaborators() throws Throwable {
			Thread.sleep(5000);
			driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			WebElement collab=driver.findElement(By.xpath("//a[@id='applCollabs']"));
			Actions act=new Actions(driver);
	        act.moveToElement(collab);
	        collab.click();
	        Thread.sleep(3000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='Add Collaborator'])[1]")).click();
			//select use
			Thread.sleep(3000);
			 WebElement selectuser=driver.findElement(By.xpath("//div[@class=' css-1hwfws3']"));
			 selectuser.click();
			 driver.findElement(By.xpath("//div[@class=' css-1n7v3ny-option']")).click();
			 Thread.sleep(2000);
				driver.findElement(By.xpath("//button[text()='Add']")).click();
		    Thread.sleep(3000);
		}

		@When("^Recruiter clicks on candidates Applicant Notes$")
		public void recruiter_clicks_on_candidates_Applicant_Notes() throws Throwable {
			Thread.sleep(4000);
			WebElement applicantnotes =driver.findElement(By.xpath("//a[@id='an']"));
			Actions act=new Actions(driver);
	        act.moveToElement(applicantnotes);
	        applicantnotes.click();
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
			driver.findElement(By.name("applNotes")).sendKeys("good candidate");
			driver.findElement(By.xpath("//button[text()='Add Note']")).click();
			Thread.sleep(3000);
			
		
		}

		@When("^Recruiter clicks on candidates References$")
		public void recruiter_clicks_on_candidates_References() throws Throwable {
			Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			WebElement references =driver.findElement(By.xpath("//a[@id='references']"));
			Actions act=new Actions(driver);
	        act.moveToElement(references);
	        references.click();
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='Invite Candidate']")).click();
			Thread.sleep(3000);
		}

		@When("^Recruiter clicks on candidates Offer Information$")
		public void recruiter_clicks_on_candidates_Offer_Information() throws Throwable {
			Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			WebElement offerinfo =driver.findElement(By.xpath("//a[@id='offer']"));
			Actions act=new Actions(driver);
	        act.moveToElement(offerinfo);
	        offerinfo.click();
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);	
		}

		@When("^Recruiter clicks on candidates Other Jobs Applied$")
		public void recruiter_clicks_on_candidates_Other_Jobs_Applied() throws Throwable {
			Thread.sleep(4000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			WebElement jobsapplied =driver.findElement(By.xpath("//a[@id='oja']"));
			Actions act=new Actions(driver);
	        act.moveToElement(jobsapplied);
	        jobsapplied.click();
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
		}

		@When("^Recruiter clicks on candidates Suitable Jobs$")
		public void recruiter_clicks_on_candidates_Suitable_Jobs() throws Throwable {
			Thread.sleep(4000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			WebElement suitablejobs =driver.findElement(By.xpath("//a[@id='sb']"));
			Actions act=new Actions(driver);
	        act.moveToElement(suitablejobs);
	        suitablejobs.click();
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
		}

		@When("^Recruiter clicks on candidates Chat with candidate$")
		public void recruiter_clicks_on_candidates_Chat_with_candidate() throws Throwable {
			Thread.sleep(4000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			WebElement chat =driver.findElement(By.xpath("//a[@id='inbox']"));
			Actions act=new Actions(driver);
	        act.moveToElement(chat);
	        chat.click();
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,1000)");
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(3000);
			WebElement cht=driver.findElement(By.xpath("//div[@class='MessageField regular']"));
			cht.click();
			Thread.sleep(2000);
			cht.sendKeys("Congratulations");
			Thread.sleep(3000);
//			JavascriptExecutor jt=(JavascriptExecutor)driver;
//			jt.executeScript("document.querySelector('p.Say something...',':before').click();");
//			Actions acti=new Actions(driver);
//	        acti.moveToElement(msg);//form[@class='entry-form has-emoji-btn']
//	        msg.sendKeys("Hi");
//	        Thread.sleep(2000);    
//			driver.findElement(By.xpath("(//button[@aria-label='Send'])[1]")).click();
//			Thread.sleep(4000);
		}

		@When("^Recruiter clicks on candidates Post Hire Feedback$")
		public void recruiter_clicks_on_candidates_Post_Hire_Feedback() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(4000);
			WebElement posthirefb =driver.findElement(By.xpath("//a[@id='fb']"));
			Actions act=new Actions(driver);
	        act.moveToElement(posthirefb);
	        posthirefb.click();
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);	
			driver.findElement(By.xpath("//label[@for='1_4']")).click();
			//driver.findElement(By.xpath("//label[@for='683_4']")).click();
			//driver.findElement(By.xpath("//label[@for='251517_4']")).click();
			driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}

		@When("^Recruiter clicks on candidates Onboarding$")
		public void recruiter_clicks_on_candidates_Onboarding() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(4000);
			WebElement onboarding =driver.findElement(By.xpath("//a[@id='app-ob']"));
			Actions act=new Actions(driver);
	        act.moveToElement(onboarding);
	        onboarding.click();
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
		}
		
		
		
		//ONBOARDING - ADD TEMPLATE
		
		
		
		
		@Then("^recruiter clicks on Add template$")
		public void recruiter_clicks_on_Add_template() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Add Template'])[1]")).click();
		}

		@Then("^recruiter clicks on create new template$")
		public void recruiter_clicks_on_create_new_template() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Create New Template']")).click();
		}

		@Then("^recruiter names the template and submit$")
		public void recruiter_names_the_template_and_submit() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='obTemplateName']")).sendKeys("template i");
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
		}
		

		@Then("^recruiter clicks on add stage$")
		public void recruiter_clicks_on_add_stage() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Add Stage']")).click();
		}

		@Then("^recruiter names the stage Instructions to candidate Submit$")
		public void recruiter_names_the_stage_Instructions_to_candidate_Submit() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='obStageName']")).sendKeys("stage i");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("welcome");
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			
			
		}

		@Then("^recruiter clicks on stage dropdown and click on add doc$")
		public void recruiter_clicks_on_stage_dropdown_and_click_on_add_doc() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[@class='bx--table-expand']")).click();
			driver.findElement(By.xpath("//button[text()='Add Document']")).click();
		}

		@Then("^recruiter gives name to doc and add notes then submit$")
		public void recruiter_gives_name_to_doc_and_add_notes_then_submit() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='obDocumentName']")).sendKeys("document i");
			driver.findElement(By.xpath("//textarea[@name='notes']")).sendKeys("doc notes");
			driver.findElement(By.xpath("//button[text()='Submit']")).click();  
		}

		@Then("^recruiter clicks on onboarding link available at TLC$")
		public void recruiter_clicks_on_onboarding_link_available_at_TLC() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Onboarding']")).click();   
		}

		@Then("^recruiter clicks on add candidate$")
		public void recruiter_clicks_on_add_candidate() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='Add Candidate'])[1]")).click();   
		}

		@Then("^select job select candidate select template$")
		public void select_job_select_candidate_select_template() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			WebElement selectjob=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			selectjob.sendKeys("Automation test engineer");
			Thread.sleep(3000);
			selectjob.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			selectjob.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			WebElement selcandidate=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
			selcandidate.sendKeys("load runner");
			Thread.sleep(3000);
			selcandidate.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			selcandidate.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			WebElement choosetemp=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
			choosetemp.sendKeys("template i");
			Thread.sleep(3000);
			choosetemp.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			choosetemp.sendKeys(Keys.ENTER);
			
		}

		@Then("^click on invite candidate$")
		public void click_on_invite_candidate() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Invite Candidate']")).click();  
		}
		//select Onboarding Template and Submit
		@Then("^recruiter select required template and submit$")
		public void recruiter_select_required_template_and_submit() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(4000);
		  WebElement choosetmplt=driver.findElement(By.xpath("//input[@aria-autocomplete='list']"));
		  choosetmplt.sendKeys("template i");
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			choosetmplt.sendKeys(Keys.ARROW_DOWN);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			choosetmplt.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}

		
		//      TIMELINE
		
		
		@When("^Recruiter clicks on candidates Timeline$")
		public void recruiter_clicks_on_candidates_Timeline() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(4000);
			WebElement timeline=driver.findElement(By.xpath("//a[@id='Timeline']"));
			Actions act=new Actions(driver);
	        act.moveToElement(timeline);
	        timeline.click();
			Thread.sleep(2000);
     		JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(0,500)");
		    
			//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
			
		}

		@When("^Recruiter clicks on candidates Contact Numbers$")
		public void recruiter_clicks_on_candidates_Contact_Numbers() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(4000);
			WebElement contacts=driver.findElement(By.xpath("//a[@id='contactNumbers']"));
			Actions act=new Actions(driver);
	        act.moveToElement(contacts);
	        contacts.click();
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
     		js.executeScript("window.scrollBy(0,500)");
     		Thread.sleep(2000);
     		driver.findElement(By.xpath("(//button[text()='Add New Contact'])[1]")).click();
     		Thread.sleep(3000);
			Select country=new Select(driver.findElement(By.name("countryCode")));
			country.selectByVisibleText("India (+91)");
			Thread.sleep(2000);
			driver.findElement(By.name("currContactNumber")).sendKeys("9865320137");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='Add']"));
		}

          //----------------------BULK-----UPLOAD-------------------------
		@Then("^Recruiter clicks on download bulk upload template$")
		public void recruiter_clicks_on_download_bulk_upload_template() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[text()='Download Template']")).click();
		    Thread.sleep(2000);
		}

		@When("^recruiter clicks on upload button of Bulk Jobs$")
		public void recruiter_clicks_on_upload_button_of_Bulk_Jobs() throws Throwable {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Upload']")).click();
			Thread.sleep(2000);
			WebElement blkupload=driver.findElement(By.xpath("//input[@type='file']"));
			String absolutepath=new File("Uploadfiles\\Bulkupload.xlsx").getAbsolutePath();
			blkupload.sendKeys(absolutepath);
			Thread.sleep(3000);
			WebElement viewjobs=driver.findElement(By.xpath("//button[text()='View Jobs']"));
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.elementToBeClickable(viewjobs));
			Thread.sleep(2000); 
			viewjobs.click();
//			driver.findElement(By.xpath("//label[@aria-label='Select all rows']")).click();   
//			driver.findElement(By.xpath("(//label[@aria-label='Select row'])[1]")).click(); 
			
		}

        @When("^recruiter selects Job or jobs using Checkbox$")
        public void recruiter_selects_Job_or_jobs_using_Checkbox() throws Throwable {
        	Thread.sleep(5000);
        	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
          	 Thread.sleep(2000);
        	driver.findElement(By.xpath("(//label[@aria-label='Select row'])[1]")).click();
         }
		
		//-----------------------------APP LIST--------------------------------
		
		@Then("^click on Job postings link$")
		public void click_on_Job_postings_link() throws Throwable {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[text()='Job Postings']")).click();
		}

		@Then("^click on applications button of any posted Job$")
		public void click_on_applications_button_of_any_posted_Job() throws Throwable {
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       	 Thread.sleep(2000); 
       	 driver.findElement(By.xpath("//i[@class='fa fa-filter']")).click();
       	 driver.findElement(By.xpath("//span[text()='Job ID']")).click();
       	 Thread.sleep(2000);
       	 driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("609100");  //------------------------------------------JOB ID
//      	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(job_id);
       	 driver.findElement(By.xpath("//button[@id='apply-btn']")).click();
       	 driver.findElement(By.xpath("(//*[local-name()='svg' and @id='close-portal-btn'])[1]")).click();
       	 driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
       	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       	Thread.sleep(5000);
		  driver.findElement(By.xpath("(//div[text()='Applications'])[1]")).click();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
//		    JavascriptExecutor jq=(JavascriptExecutor)driver;
//		    Thread.sleep(2000);
//			jq.executeScript("document.querySelector(\"label[for=data-table-5__select-all]\").click();");
			Thread.sleep(3000);
		}
		//---------------------UPLOAD RESUME--------------------
		@Given("^recruiter clicks on upload resume$")
		public void recruiter_clicks_on_upload_resume() throws Throwable {
//		Thread.sleep(3000);
		  JavascriptExecutor jq=(JavascriptExecutor)driver;
		  jq.executeScript("window.scrollBy(0,-400)");
//		  Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()='UPLOAD RESUME']")).click();
//		 Thread.sleep(2000);
		 WebElement uploadresume=driver.findElement(By.xpath("//input[@type='file']"));
		String absolutepath=new File("Uploadfiles\\Ambareesh Bhaiya PDF.pdf").getAbsolutePath();
		uploadresume.sendKeys(absolutepath);
		 Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		 
		}
        //----------------------QUICK APPLICANT ADD------------------------
		@Then("^recruiter can add candidate using quick applicant add$")
		public void recruiter_can_add_candidate_using_quick_applicant_add() throws Throwable {
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//strong[text()='Back to job posting']")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement adaplicant=driver.findElement(By.xpath("//button[text()='QUICK APPLICANT ADD']"));
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(adaplicant));
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//button[text()='QUICK APPLICANT ADD']")).click();
		
		
		
		}
		@When("^enter quick applicant first name and last name \"([^\"]*)\" and \"([^\"]*)\"$")
		public void enter_quick_applicant_first_name_and_last_name_and(String fname, String lname) throws Throwable {
//			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='fName']")).sendKeys(fname);
//			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='lName']")).sendKeys(lname);
		}

		@When("^enter quick applicant email and phone no \"([^\"]*)\" and \"([^\"]*)\"$")
		public void enter_quick_applicant_email_and_phone_no_and(String phno, String mail) throws Throwable {
//			Thread.sleep(2000);
			WebElement cno=driver.findElement(By.xpath("//input[@id='contactNumber']"));
			Actions act=new Actions(driver);
            act.moveToElement(cno);
            cno.sendKeys(phno);
			Select country=new Select(driver.findElement(By.id("countryId")));
			Thread.sleep(2000);
			country.selectByVisibleText("India (+91)");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(mail);
			driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
		}
		@Then("^recruiter clicks on bulk import applicants$")
		public void recruiter_clicks_on_bulk_import_applicants() throws Throwable {
		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement blkupload=driver.findElement(By.xpath("//button[text()='BULK IMPORT APPLICANTS']"));
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(blkupload));
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//button[text()='BULK IMPORT APPLICANTS']")).click();
		Thread.sleep(2000);
		 WebElement uploadresume=driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		String absolutepath=new File("Uploadfiles\\quickbulk.xlsx").getAbsolutePath();
		uploadresume.sendKeys(absolutepath);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
	driver.findElement(By.xpath("(//*[local-name()='svg' and @aria-label='Close the modal'])[1]")).click();

	  		
		}

		@Then("^recruiter clicks on select from talent pool$")
		public void recruiter_clicks_on_select_from_talent_pool() throws Throwable {
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@id='sel-from-tp-btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@role='searchbox'])[3]")).sendKeys("deeven@f.com"); //-----------------------------email
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@id='search-btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[@aria-label='Select row']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='pipeline']")).click();
			driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
//			driver.findElement(By.xpath("(//button[text()='Add to Job'])[2]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//input[@role='searchbox'])[4]")).sendKeys("609100");// -----------------------------------JOB ID 
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("(//button[text()='Add'])[1]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//button[@title='Close'])[3]")).click();   
//			Thread.sleep(2000);            
//			driver.navigate().back();
			
//			   
			
		}
		


		//-------------------------------TAG--------------------------------

         @When("^recruiter adds tag to list of applications and submit$")
         public void recruiter_adds_tag_to_list_of_applications_and_submit() throws Throwable {
        Thread.sleep(5000);
        JavascriptExecutor jq=(JavascriptExecutor)driver;
    	jq.executeScript("window.scrollBy(0,400)");
//    	Thread.sleep(2000);
//    	driver.findElement(By.xpath("//input[@name='select-all']")).click();
//    	JavascriptExecutor jr=(JavascriptExecutor)driver;
//  		jq.executeScript("document.querySelector(\"label[for=data-table-10__select-all]\").click();");
    	driver.findElement(By.xpath("(//label[@class='bx--checkbox-label'])[1]")).click();
   		Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Tag']")).click();
        Thread.sleep(2000);
        WebElement tag=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	   tag.sendKeys("hire 1");
	   tag.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		tag.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
			
			
         }
       //-------------------------------SHORTLIST---------------
		@Then("^Shortlist the selected Application$")
		public void shortlist_the_selected_Application() throws Throwable {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[text()='Shortlist']")).click();  
		}

		@Then("^add additional email recipients$")
		public void add_additional_email_recipients() throws Throwable {
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@id='emailshare']")).sendKeys("paulindia637@gmail.com");  
		}

		@Then("^click on Submit button to send email to candidate$")
		public void click_on_Submit_button_to_send_email_to_candidate() throws Throwable {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click(); 
		}
		//----------------------------TALENT POOL

         @Given("^recruiter clicks on add to talent pool button$")
         public void recruiter_clicks_on_add_to_talent_pool_button() throws Throwable {
        	 Thread.sleep(1000);
 			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         driver.findElement(By.xpath("//button[text()='Talent Pool']")).click();
         }
         @When("^recruiter chooses add applicant to default talentpool$")
         public void recruiter_chooses_add_applicant_to_default_talentpool() throws Throwable {
        	 Thread.sleep(2000);
        	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        	 driver.findElement(By.xpath("//label[@for='default-radio-btn']")).click();  
        	 
         }

         @When("^recruiter chooses add applicant to existing bucket$")
         public void recruiter_chooses_add_applicant_to_existing_bucket() throws Throwable {
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("//label[@for='sel-bkt-radio-btn']")).click();   
        	 Select emailtemp=new Select(driver.findElement(By.name("selectedBucketId"))); 
        	 Thread.sleep(3000);
        	 emailtemp.selectByValue("vip a007");
         }
         @Then("^recruiter add applicant to new bucket \"([^\"]*)\"$")
         public void recruiter_add_applicant_to_new_bucket(String bktname) throws Throwable {
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("//label[@for='create-bkt-radio-btn']")).click(); 
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("//input[@id='bucketName']")).sendKeys(bktname);
         }
         @Then("^Click on Submit Button of Talent pool$")
         public void click_on_Submit_Button_of_Talent_pool() throws Throwable {
//        	 Thread.sleep(2000);
//  			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//  			Thread.sleep(3000);
        	 driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();    
         }
         //-------------------KIV----------------
         @Given("^recruiter clicks on add to kiv button$")
         public void recruiter_clicks_on_add_to_kiv_button() throws Throwable {
//        	 Thread.sleep(2000);
  			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//  			Thread.sleep(3000); 
        	 driver.findElement(By.xpath("//button[@id='is_liked']")).click();   
         }

         @Then("^add or remove applications from kiv using toggle and submit$")
         public void add_or_remove_applications_from_kiv_using_toggle_and_submit() throws Throwable {
//         	 Thread.sleep(2000);
  			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//  			Thread.sleep(3000); 
        	 driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();  
         }
         @Given("^recruiter clicks on change stage button$")
         public void recruiter_clicks_on_change_stage_button() throws Throwable {
        	 Thread.sleep(2000);    
//        	 driver.findElement(By.xpath("//button[@id='changeApplicationStage']")).click();
        	 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        	 driver.findElement(By.xpath("//button[text()='Change Stage']")).click(); 
         }

         @Then("^choose application stage from dropdown list$")
         public void choose_application_stage_from_dropdown_list() throws Throwable {
        	 Thread.sleep(3000);
         WebElement choosestage=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
			choosestage.sendKeys("interview");
			Thread.sleep(3000);
			choosestage.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			choosestage.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			WebElement iround=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			iround.sendKeys("final decision");
			Thread.sleep(3000);
			iround.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			iround.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			WebElement substage=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
			substage.sendKeys("interview");
			Thread.sleep(3000);
			substage.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			substage.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
        	 
         }
         @Given("^recruiter clicks on Add Email Button$")
         public void recruiter_clicks_on_Add_Email_Button() throws Throwable {
 			Thread.sleep(3000);
 			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        	 driver.findElement(By.xpath("//button[@id='email']")).click();
         }

         @Then("^choose Shortlist Email template to send candidates$")
         public void choose_Shortlist_Email_template_to_send_candidates() throws Throwable {
        	 Thread.sleep(3000);
        	 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        	 Select emailtemp=new Select(driver.findElement(By.xpath("//select[@id='email-templates-list']"))); 
        	 Thread.sleep(3000);
        	 emailtemp.selectByValue("1_shortlist");
         }

         @Then("^click on Submit button of EmailTemplates$")
         public void click_on_Submit_button_of_EmailTemplates() throws Throwable {
        	 Thread.sleep(3000);
        	 driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click(); 
         }

         @Given("^recruiter clicks on download option$")
          public void recruiter_clicks_on_download_option() throws Throwable {
        	 Thread.sleep(4000);
        	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        	 Thread.sleep(3000);
        	 driver.findElement(By.xpath("//button[@id='download_applications']")).click(); 
         }

         @Then("^recruiter clicks on submit to download cvs$")
         public void recruiter_clicks_on_submit_to_download_cvs() throws Throwable {
        	 Thread.sleep(3000);
        	 driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click(); 	 
         }

         @Then("^recruiter selects xopa report from dropdown and submit$")
         public void recruiter_selects_xopa_report_from_dropdown_and_submit() throws Throwable {
        	 Thread.sleep(2000);
 			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
 			Thread.sleep(2000);
        	 Select emailtemp=new Select(driver.findElement(By.xpath("//select[@id='downloadReportType']"))); 
        	 Thread.sleep(2000);
        	 emailtemp.selectByValue("download-x0pa-report");
        	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        	 Thread.sleep(3000);
        	 driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click(); 
        	 
         }
         @Given("^recruiter clicks on delete option and submit$")
         public void recruiter_clicks_on_delete_option_and_submit() throws Throwable {
//        	 Thread.sleep(2000);
// 			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
// 			Thread.sleep(2000);
          driver.findElement(By.xpath("//button[text()='Delete']")).click();
//          Thread.sleep(2000);
          driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
          
         }

         //--------------------------JOB LIST-------------------------------------
         @Then("^recruiter chooses jobs posted by all$")
         public void recruiter_chooses_jobs_posted_by_all() throws Throwable {
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 Thread.sleep(3000);
        	 driver.findElement(By.xpath("(//span[@class='bx--radio-button__appearance'])[2]")).click(); 
         }
         @Then("^recruiter filters the jobs required$")
         public void recruiter_filters_the_jobs_required() throws Throwable {
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 Thread.sleep(2000); 
        	 driver.findElement(By.xpath("//i[@class='fa fa-filter']")).click();
        	 driver.findElement(By.xpath("//span[text()='Job ID']")).click();
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("608877");
        	 driver.findElement(By.xpath("(//button[text()='Apply'])[2]")).click(); 
         }
         @Then("^recruiter selects any job or list of jobs$")
         public void recruiter_selects_any_job_or_list_of_jobs() throws Throwable {
             Thread.sleep(2000);
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 Thread.sleep(2000);
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 Thread.sleep(2000); 
        	 driver.findElement(By.xpath("//i[@class='fa fa-filter']")).click();
        	 driver.findElement(By.xpath("//span[text()='Job ID']")).click();
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(job_id);
//        	 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("609438");//----------------------------------JOB LIST JOB ID
        	 driver.findElement(By.xpath("(//button[text()='Apply'])[2]")).click();
        	 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 driver.findElement(By.xpath("//label[@aria-label='Select all rows']")).click();
//             driver.findElement(By.xpath("//label[@for='data-table-1__select-row-609438']")).click();
//        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        	 Thread.sleep(3000);
//        	 driver.findElement(By.xpath("//label[@for='data-table-1__select-row-608877']")).click();
         }

         @Then("^recruiter clicks on Batch actions button$")
         public void recruiter_clics_on_Batch_actions_button() throws Throwable {
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 Thread.sleep(3000);
        	 driver.findElement(By.xpath("//button[text()='Batch Actions']")).click();
        	 
        	
         }
         @Then("^recruiter chooses job visibility from batch actions dd$")
         public void recruiter_chooses_job_visibility_from_batch_actions_dd() throws Throwable {
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 Thread.sleep(3000);
        	 Select emailtemp=new Select(driver.findElement(By.xpath("//select[@id='batch-actions']"))); 
        	 Thread.sleep(2000);
        	 emailtemp.selectByVisibleText("Job Visibility");
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("(//span[@class='bx--radio-button__appearance'])[3]")).click();
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();   
         }

         @Then("^recruiter chooses job status from batch actions dd$")
         public void recruiter_chooses_job_status_from_batch_actions_dd() throws Throwable {
        	 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 Thread.sleep(3000);
        	 Select emailtemp=new Select(driver.findElement(By.xpath("//select[@id='batch-actions']"))); 
        	 Thread.sleep(2000);
        	 emailtemp.selectByVisibleText("Job Status");
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("(//span[@class='bx--radio-button__appearance'])[3]")).click();
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click(); 
        	 Thread.sleep(5000);
         }

         @Then("^recruiter chooses transfer ownership from batch actions dd$")
         public void recruiter_chooses_transfer_ownership_from_batch_actions_dd() throws Throwable {
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 Thread.sleep(3000);
        	 Select emailtemp=new Select(driver.findElement(By.xpath("//select[@id='batch-actions']"))); 
        	 Thread.sleep(2000);
        	 emailtemp.selectByVisibleText("Transfer Ownership");
        	 Thread.sleep(2000);
        	 WebElement transowner=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
    			transowner.sendKeys("Sai  Charan (saicharan@trainingqa.com)");
    			Thread.sleep(2000);
    			transowner.sendKeys(Keys.ARROW_DOWN);
    			transowner.sendKeys(Keys.ENTER);
    			Thread.sleep(2000); 
        	 driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
         }
         @Then("^recruiter clicks on add tag button and add tag name \"([^\"]*)\"$")
         public void recruiter_clicks_on_add_tag_button_and_add_tag_name(String tagname) throws Throwable {
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 Thread.sleep(2000);   
        	 driver.findElement(By.xpath("//button[text()='Add Tag']")).click();
        	 Thread.sleep(2000);
        	 WebElement tag=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
 			tag.sendKeys(tagname); //--------------------------------------------------------------------------------------TAG NAME
 			Thread.sleep(2000);
 			tag.sendKeys(Keys.ARROW_DOWN);
 			Thread.sleep(2000);
 			tag.sendKeys(Keys.ENTER);
 			Thread.sleep(2000); 
     	    driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
         }
         //----------------------------JOB INFO---------------------------------------
         @Then("^recruiter clicks on any job$")
         public void recruiter_clicks_on_any_job() throws Throwable {
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 Thread.sleep(3000);     		 
//        	 driver.findElement(By.xpath("(//span[@class='bx--radio-button__appearance'])[1]")).click();//jobs posted by me
//        	 driver.findElement(By.xpath("(//button[@id='jobs-refresh-btn'])[1]")).click();
//        	 Thread.sleep(3000);
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 driver.findElement(By.xpath("//i[@class='fa fa-filter']")).click();
        	 driver.findElement(By.xpath("//span[text()='Job ID']")).click();
        	 Thread.sleep(2000);
//        	 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("608851");//-------------------------------------JOB INFO
        	 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(job_id);
        	 driver.findElement(By.xpath("(//button[text()='Apply'])[2]")).click();
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 Thread.sleep(5000);
        	 driver.findElement(By.xpath("(//button[@id='jobs-refresh-btn'])[1]")).click();
        	 Thread.sleep(5000);
             driver.findElement(By.xpath("(//a[text()='software Engineer'])[1]")).click();//-------------------------------------INFO XPATH
         }
         @When("^recruiter clicks on edit job$")
         public void recruiter_clicks_on_edit_job() throws Throwable {
        	 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS); 
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("//button[text()='Edit Job']")).click();
         }
         @When("^recruiter clicks on collaborators section of job posted$")
         public void recruiter_clicks_on_collaborators_section_of_job_posted() throws Throwable {
         Thread.sleep(2000);
         driver.findElement(By.xpath("//a[text()='Collaborators']")).click();
         driver.findElement(By.xpath("(//button[text()='Add Collaborator'])[1]")).click();
         Select collabrole=new Select(driver.findElement(By.xpath("//select[@name='selectedRoleId']"))); 
    	 Thread.sleep(2000);
    	 collabrole.selectByVisibleText("Team Member");
    	 driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();  
    	 driver.findElement(By.xpath("//div[text()='Sai  Charan (saicharan@trainingqa.com)']")).click();
//    	 selectuser.sendKeys("Sai Charan (saicharan@trainingqa.com)");
//			Thread.sleep(2000);
//			selectuser.sendKeys(Keys.ARROW_DOWN);
//			Thread.sleep(2000);
//			selectuser.sendKeys(Keys.ENTER);
  	    driver.findElement(By.xpath("//button[text()='Add']")).click();
         }

         @When("^recruiter clicks on job approvers section of job posted$")
         public void recruiter_clicks_on_job_approvers_section_of_job_posted() throws Throwable {
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("//a[text()='Job Approvers']")).click();  
         }

         @When("^recruiter clicks on work flow automation of job$")
         public void recruiter_clicks_on_work_flow_automation_of_job() throws Throwable {
        	 Thread.sleep(2000);
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("//a[@id='was']")).click();
        	 Select collabrole=new Select(driver.findElement(By.xpath("//select[@name='applyRoleType']"))); 
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 collabrole.selectByVisibleText("Both"); //As a signed-in user    As a guest
        	 Select cvo=new Select(driver.findElement(By.xpath("//select[@name='candidateValidation']"))); 
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 cvo.selectByVisibleText("No validation");//Email validation   Talentpool Validation
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("//label[@for='jobOpenForever']")).click();
        	 //enable pre screening
        	 Thread.sleep(2000);
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("//label[@for='showPreScreeningQuest']")).click();
        	 //select questions
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 driver.findElement(By.xpath("//button[text()='Select Questions']")).click();
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
          	 driver.findElement(By.xpath("(//label[@class='bx--checkbox-label'])[2]")).click();
          	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 driver.findElement(By.xpath("//button[text()='Add Selected']")).click();
        	 Thread.sleep(2000);
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 driver.findElement(By.xpath("//label[@for='toggleChatBotDisplay']")).click();
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 driver.findElement(By.xpath("//label[@for='disableKnockout']")).click();               
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   
        	 driver.findElement(By.xpath("(//button[text()='Save'])[1]")).click();   
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
        	 Thread.sleep(2000);
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("//label[@for='showPassingPoints']")).click();                       
        	 Thread.sleep(2000);
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 driver.findElement(By.xpath("//input[@id='passingPoints']")).sendKeys("0");
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
        	 //auto shortlist all applicants
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("//label[@for='toggleAutoShortlistAll']")).click();              
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 driver.findElement(By.xpath("//label[@for='toggleAutoShortlist']")).click();            
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 driver.findElement(By.xpath("//label[@for='toggleSkipConsentAll']")).click();
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 driver.findElement(By.xpath("//label[@for='sendPreInterviewQuestionToCandJob']")).click();
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 driver.findElement(By.xpath("//button[text()='Add Pre Interview Stage']")).click();             //label[@for='showPassingPoint0']
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 driver.findElement(By.xpath("//div[@class='bx--accordion__title']")).click();   
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 driver.findElement(By.xpath("//button[text()='Select Questions']")).click();
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 driver.findElement(By.xpath("(//label[@class='bx--checkbox-label'])[6]")).click();
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 driver.findElement(By.xpath("//button[text()='Add Selected']")).click();
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 driver.findElement(By.xpath("(//button[text()='Save'])[3]")).click();
         }
         @Then("^recruiter enables assesments and interview setup toggle$")
         public void recruiter_enables_assesments_and_interview_setup_toggle() throws Throwable {
        	 Thread.sleep(5000);
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("//label[@for='showAssessments']")).click();
        	 Thread.sleep(2000);
//        	 driver.findElement(By.xpath("(//input[@id='passingPoints'])[2]")).sendKeys("0");
//        	 Thread.sleep(2000);
//        	 driver.findElement(By.xpath("(//button[text()='Save'])[4]")).click(); //trial
//        	 Thread.sleep(2000);
//        	 driver.findElement(By.xpath("(//span[@class='bx--toggle__switch'])[12]")).click();
//        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("(//button[text()='Add Interview Stage'])[1]")).click();
         }
         //temporary
         @Then("^Recruiter chooses Interview type phone round in job info$")
         public void recruiter_chooses_Interview_type_phone_round_in_job_info() throws Throwable {
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 			Thread.sleep(2000);
 		driver.findElement(By.xpath("//label[@for='radio-3']")).click();
 		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 		Select interviewround=new Select(driver.findElement(By.id("workflowStage")));
 		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 		interviewround.selectByVisibleText("Phone Interview");
 		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 		driver.findElement(By.xpath("//input[@id='stageName']")).sendKeys("phone Round");
 		driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();  
         }
         @Then("^Recruiter schedules interview by clicking on blue arrow of job info$")
         public void recruiter_schedules_interview_by_clicking_on_blue_arrow_of_job_info() throws Throwable {
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
           driver.findElement(By.xpath("//div[@id='InterviewStage']")).click();
         }
         @Then("^recruiter clicks on add slot button$")
         public void recruiter_clicks_on_add_slot_button() throws Throwable {
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("(//button[text()='Add slot'])[1]")).click(); 
         }
         @When("^recruiter clicks on conversations section of job posted$")
         public void recruiter_clicks_on_conversations_section_of_job_posted() throws Throwable {
        	 Thread.sleep(4000);
//        	 JavascriptExecutor jq=(JavascriptExecutor)driver;
        	 ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        	 Thread.sleep(3000);
        	 driver.findElement(By.xpath("//a[text()='Conversations']")).click();
         }

         @When("^recruiter clicks on ai settings of Job$")
         public void recruiter_clicks_on_ai_settings_of_Job() throws Throwable {
        	 driver.findElement(By.xpath("//a[text()='AI Settings']")).click();
        	 driver.findElement(By.xpath("//span[@class='bx--toggle__switch']")).click();
         }

         @When("^recruiter clicks on hiring goals of job$")
         public void recruiter_clicks_on_hiring_goals_of_job() throws Throwable {
        	 Thread.sleep(3000);
        	 driver.findElement(By.xpath("//a[text()='Hiring Goals']")).click();
         }

         @When("^recruiter clicks on consulting fee of job$")
         public void recruiter_clicks_on_consulting_fee_of_job() throws Throwable {
        	 Thread.sleep(3000);
        	 driver.findElement(By.xpath("//a[text()='Consulting Fee']")).click();
         }

         @When("^recruiter clicks on meta info of job posted$")
         public void recruiter_clicks_on_meta_info_of_job_posted() throws Throwable {
        	 Thread.sleep(2000);
        	 WebElement metainfo=driver.findElement(By.xpath("//a[@id='mi']"));
        	 WebDriverWait wait=new WebDriverWait(driver,10);
 			wait.until(ExpectedConditions.elementToBeClickable(metainfo));
        	 driver.findElement(By.xpath("//a[@id='mi']")).click();
        	 driver.findElement(By.xpath("//button[text()='Add']")).click();
        	 WebElement ownermail=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        	 ownermail.sendKeys("owner email");
 			 Thread.sleep(2000);
 			 ownermail.sendKeys(Keys.ARROW_DOWN);
 			 Thread.sleep(2000);
 			 ownermail.sendKeys(Keys.ENTER);
 			 Thread.sleep(2000); 
 			 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("edward@owner.com");
   	         driver.findElement(By.xpath("//button[text()='Submit']")).click();
   	      
        	 
        	 
        	
         }

         @When("^recruiter clicks on timeline of job posted$")
         public void recruiter_clicks_on_timeline_of_job_posted() throws Throwable {
        	 WebElement timeline=driver.findElement(By.xpath("//a[@id='tl']"));
        	 WebDriverWait wait=new WebDriverWait(driver,10);
 			wait.until(ExpectedConditions.elementToBeClickable(timeline));
        	 driver.findElement(By.xpath("//a[@id='tl']")).click();
         }
         
         @When("^recruiter clicks on clone job$")
         public void recruiter_clicks_on_clone_job() throws Throwable {
        	 driver.findElement(By.xpath("//button[@id='clone-job-btn']")).click();
        	 driver.findElement(By.xpath("//button[text()='Clone']")).click();
         }
         @When("^recruiter clicks on email this job \"([^\"]*)\" and \"([^\"]*)\"$")
         public void recruiter_clicks_on_email_this_job_and(String mail, String mailcc) throws Throwable {
        	 driver.findElement(By.xpath("//button[@id='email-job-btn']")).click();  
        	 driver.findElement(By.xpath("//input[@id='emailshare']")).sendKeys(mail);
        	 driver.findElement(By.xpath("//input[@id='emailShareCC']")).sendKeys(mailcc);
        	 driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Hi");
        	 driver.findElement(By.xpath("//button[text()='Send']")).click(); 
         }

         @When("^recruiter clicks on transfer ownership of the job$")
         public void recruiter_clicks_on_transfer_ownership_of_the_job() throws Throwable {
        	 Thread.sleep(4000);
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("//button[@id='transfer-job-btn']")).click();
        	 Thread.sleep(2000);
        	 WebElement transferown=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
  		    transferown.sendKeys("Sai  Charan (saicharan@trainingqa.com)");
  		    Thread.sleep(2000);
  			transferown.sendKeys(Keys.ARROW_DOWN);
  			Thread.sleep(2000);
  			transferown.sendKeys(Keys.ENTER);
  			Thread.sleep(3000); 
  			driver.findElement(By.xpath("//button[text()='Submit']")).click();
         }
         
         
         //-------------------------------EDIT JOB---------------------------------------
         
         
         @Given("^recruiter edits office address \"([^\"]*)\"$")
         public void recruiter_edits_office_address(String address) throws Throwable {
        	 Thread.sleep(2000);
        	WebElement officeadrs=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
 			WebDriverWait wait=new WebDriverWait(driver,20);
 			wait.until(ExpectedConditions.elementToBeClickable(officeadrs));
 			Thread.sleep(2000); 
        	 WebElement OfficeAddress=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
 		    OfficeAddress.sendKeys(address);
 		    Thread.sleep(2000);
 			OfficeAddress.sendKeys(Keys.ARROW_DOWN);
 			Thread.sleep(2000);
 			OfficeAddress.sendKeys(Keys.ENTER);
 			Thread.sleep(3000);   
         }

         @Given("^recruiter edits Job Title as \"([^\"]*)\"$")
         public void recruiter_edits_Job_Title_as(String title) throws Throwable {
        	 WebElement jobtitle=driver.findElement(By.xpath("//input[@placeholder='Job Title']"));
        	 jobtitle.clear();
 			jobtitle.sendKeys(title);
// 			Thread.sleep(2000);
         }

         @Given("^recruiter edits internal code for job \"([^\"]*)\"$")
         public void recruiter_edits_internal_code_for_job(String intrnlcode) throws Throwable {
        	WebElement ic= driver.findElement(By.id("internalCode")); 
        	ic.clear();
        	ic.sendKeys(intrnlcode);
         }

         @Given("^recruiter edits Job Status as \"([^\"]*)\"$")
         public void recruiter_edits_Job_Status_as(String js) throws Throwable {
        	 WebElement jobstatus=driver.findElement(By.xpath("(//input[@type='text'])[6]"));
 			jobstatus.sendKeys(js);
 			jobstatus.sendKeys(Keys.ARROW_DOWN);
// 			Thread.sleep(2000);
 			jobstatus.sendKeys(Keys.ENTER);
// 			Thread.sleep(2000);
         }

         @Given("^recruiter edits choose candidates from other countries$")
         public void recruiter_edits_choose_candidates_from_other_countries() throws Throwable {
        	 driver.findElement(By.xpath("(//span[@class='bx--toggle__switch'])[3]")).click();   
         }

         @Given("^recruiter edits enable rank and file job$")
         public void recruiter_edits_enable_rank_and_file_job() throws Throwable {
        	 driver.findElement(By.xpath("(//span[@class='bx--toggle__switch'])[4]")).click(); 
         }

         @Given("^recruiter edits Country Location \"([^\"]*)\"$")
         public void recruiter_edits_Country_Location(String countryname) throws Throwable {
        	WebElement countryloc=driver.findElement(By.xpath("//input[@id='react-select-17-input']"));
//        	Thread.sleep(2000);
//        	driver.findElement(By.xpath("(//div[text()='India'])[2]")).click();
 			countryloc.sendKeys(countryname);
// 			Thread.sleep(2000);
 			countryloc.sendKeys(Keys.ARROW_DOWN);
// 			Thread.sleep(2000);
 			countryloc.sendKeys(Keys.ENTER);
// 			Thread.sleep(3000);
         }

         @Given("^recruiter edits City location \"([^\"]*)\"$")
         public void recruiter_edits_City_location(String citynam) throws Throwable {
//        	 Thread.sleep(5000);
        	 driver.findElement(By.id("//input[@id='react-select-18-input']")).click();
        	 WebElement citylocation=driver.findElement(By.id("//input[@id='react-select-18-input']"));
 			citylocation.sendKeys(citynam);
 			citylocation.sendKeys(Keys.ARROW_DOWN);
// 			Thread.sleep(5000);
 			citylocation.sendKeys(Keys.ENTER); 
// 			Thread.sleep(3000);
         }

         @Given("^recruiter edits skills \"([^\"]*)\" and \"([^\"]*)\"$")
         public void recruiter_edits_skills_and(String skill1, String skill2) throws Throwable {
//        	 Thread.sleep(3000);
        		WebElement skills=driver.findElement(By.id("//input[@id='react-select-19-input']"));
    			skills.sendKeys(skill1);
    			skills.sendKeys(Keys.ARROW_DOWN);
//    			Thread.sleep(2000);
    			skills.sendKeys(Keys.ENTER);
//    			Thread.sleep(2000);
    			skills.sendKeys(skill2);
    			skills.sendKeys(Keys.ARROW_DOWN);
//    			Thread.sleep(2000);
    			skills.sendKeys(Keys.ENTER);
//    			Thread.sleep(2000);  
         }

         @Given("^recruiter edits add Qualification \"([^\"]*)\"$")
         public void recruiter_edits_add_Qualification(String degree) throws Throwable {
        	 WebElement qualification=driver.findElement(By.xpath("(//input[@type='text'])[10]"));
		     qualification.sendKeys(degree);
		     qualification.sendKeys(Keys.ARROW_DOWN);
//		     Thread.sleep(2000);
		     qualification.sendKeys(Keys.ENTER);
//		     Thread.sleep(2000);
         }

         @Given("^recruiter edits job type in emp details as \"([^\"]*)\"$")
         public void recruiter_edits_job_type_in_emp_details_as(String jt) throws Throwable {
        	 WebElement jobtype=driver.findElement(By.xpath("(//input[@type='text'])[11]"));
 			jobtype.sendKeys(jt);
 		    jobtype.sendKeys(Keys.ARROW_DOWN);
// 		    Thread.sleep(2000);
 		    jobtype.sendKeys(Keys.ENTER);
// 		    Thread.sleep(2000);
         }

         @Given("^recruiter edits minimum experience as \"([^\"]*)\"$")
         public void recruiter_edits_minimum_experience_as(String minxp) throws Throwable {
        	WebElement minexp= driver.findElement(By.xpath("//input[@id='minExp']"));
        	minexp.clear();
        	minexp.sendKeys(minxp);
// 			Thread.sleep(2000);  
         }

         @Given("^recruiter edits maximum experience as \"([^\"]*)\"$")
         public void recruiter_edits_maximum_experience_as(String maxxp) throws Throwable {
        	WebElement maxexp= driver.findElement(By.id("maxExp"));
        	maxexp.clear();
        	maxexp.sendKeys(maxxp);
// 			Thread.sleep(2000); 
         }

         @Given("^recruiter edits Employment type as \"([^\"]*)\"$")
         public void recruiter_edits_Employment_type_as(String emptyp) throws Throwable {
        		WebElement emptype=driver.findElement(By.xpath("(//input[@type='text'])[12]"));
    			emptype.sendKeys(emptyp);
    			emptype.sendKeys(Keys.ARROW_DOWN);
//    			Thread.sleep(2000);
    			emptype.sendKeys(Keys.ENTER);
//    			Thread.sleep(2000);
         }

         @Given("^recruiter edits no of vacancies \"([^\"]*)\"$")
         public void recruiter_edits_no_of_vacancies(String vac) throws Throwable {
        	 WebElement vacancies=driver.findElement(By.xpath("//input[@id='noOfVacancies']"));
 			vacancies.clear();
// 			Thread.sleep(2000);
 			vacancies.sendKeys(vac);
// 			Thread.sleep(3000);
         }

         @Given("^recruiter edits close date of job \"([^\"]*)\"$")
         public void recruiter_edits_close_date_of_job(String closedate) throws Throwable {
        	 WebElement closejob=driver.findElement(By.xpath("//input[@placeholder='End Date']"));
			 closejob.sendKeys(closedate);
			 closejob.sendKeys(Keys.ENTER);
//			 Thread.sleep(3000);
         }

         @Given("^recruiter edits Job Description \"([^\"]*)\"$")
         public void recruiter_edits_Job_Description(String jd) throws Throwable {
        	 WebElement JD=driver.findElement(By.xpath("(//div[@class='ql-editor'])[1]"));
        	 JD.clear();
        	 JD.sendKeys(jd);
// 			Thread.sleep(2000);
         }

         @Given("^recruiter edits Job Requirements \"([^\"]*)\"$")
         public void recruiter_edits_Job_Requirements(String jr) throws Throwable {
        	 WebElement JR=driver.findElement(By.xpath("(//div[@class='ql-editor'])[2]"));
        	 JR.clear();
        	 JR.sendKeys(jr);
//        	 Thread.sleep(2000);
 			
         }

         @Given("^recruiter edits primary recruiter \"([^\"]*)\"$")
         public void recruiter_edits_primary_recruiter(String recname) throws Throwable {
        	    JavascriptExecutor js=(JavascriptExecutor)driver;
     			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
     			Thread.sleep(2000);
        		WebElement prrec=driver.findElement(By.xpath("/html/body/section/div[1]/div/div[3]/div/section/div/div/div[2]/div[3]/div[2]/div/div[2]/div[2]/div/div/div[29]/div[3]/div[2]/div/div/div/div/div[1]/div[2]/div/input"));
    			prrec.sendKeys(recname);
//    		    Thread.sleep(2000);
    			prrec.sendKeys(Keys.ARROW_DOWN);
//    			Thread.sleep(3000);
    			prrec.sendKeys(Keys.ENTER);
//    			Thread.sleep(4000);
         }
         @And("^click on submit after editing basic info of job$")
         public void click_on_submit_after_editing_basic_info_of_job() throws Throwable {
            driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
         }

         @When("^recruiter edits industry field \"([^\"]*)\"$")
         public void recruiter_edits_industry_field(String indus) throws Throwable {
//        	 Thread.sleep(2000);
 			WebElement industry=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
 			industry.clear();
 		    industry.sendKeys(indus);
 			industry.sendKeys(Keys.ARROW_DOWN);
// 			Thread.sleep(2000);
 			industry.sendKeys(Keys.ENTER);
// 			Thread.sleep(2000); 
         }

         @When("^recruiter edits add keywords for AI to vote CV \"([^\"]*)\"$")
         public void recruiter_edits_add_keywords_for_AI_to_vote_CV(String kwd) throws Throwable {
//        	 Thread.sleep(2000);
 			WebElement keyword =driver.findElement(By.xpath("(//input[@type='text'])[4]"));
 			keyword.clear();
 		    keyword.sendKeys(kwd);
 			keyword.sendKeys(Keys.ARROW_DOWN);
// 			Thread.sleep(2000);
 			keyword.sendKeys(Keys.ENTER);
// 			Thread.sleep(2000);     
         }

         @When("^recruiter edits Education \"([^\"]*)\"$")
         public void recruiter_edits_Education(String edu) throws Throwable {
        	 Thread.sleep(2000);
 			WebElement education=driver.findElement(By.xpath("(//input[@type='text'])[5]"));
 			education.clear();
 			education.sendKeys(edu);
 			education.sendKeys(Keys.ARROW_DOWN);
 			Thread.sleep(2000);
 			education.sendKeys(Keys.ENTER);
 			Thread.sleep(2000); 
         }

         @When("^recruiter edits Work Location \"([^\"]*)\"$")
         public void recruiter_edits_Work_Location(String wl) throws Throwable {
        	 Thread.sleep(2000);
 			WebElement wloc=driver.findElement(By.xpath("//textarea[@id='workLocation']"));
 			wloc.clear();
 			wloc.sendKeys(wl);
         }

         @When("^recruiter can edit working Hours \"([^\"]*)\"$")
         public void recruiter_can_edit_working_Hours(String hrs) throws Throwable {
//        	 Thread.sleep(2000);
 			WebElement whrs=driver.findElement(By.xpath("//textarea[@name='workHours']"));
 			whrs.clear();
 			whrs.sendKeys(hrs);
         }

         @When("^recruiter can edit minimal Annual Salary \"([^\"]*)\"$")
         public void recruiter_can_edit_minimal_Annual_Salary(String minsal) throws Throwable {
//        	 Thread.sleep(2000);
			 WebElement minisal=driver.findElement(By.xpath("//input[@id='minSalary']"));
			 minisal.clear();
			 minisal.sendKeys(minsal);
			 
         }

         @When("^recruiter can edit maximum Annual Salary \"([^\"]*)\"$")
         public void recruiter_can_edit_maximum_Annual_Salary(String maxsal) throws Throwable {
//        	 Thread.sleep(2000);
 			WebElement maxisal=driver.findElement(By.xpath("//input[@id='maxSalary']")); 
 			maxisal.clear();
 			maxisal.sendKeys(maxsal);
 			JavascriptExecutor js=(JavascriptExecutor)driver;
 			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
// 			Thread.sleep(2000);
 			driver.findElement(By.xpath("(//button[@type='button'])[18]")).click();
 			
 			
         }
         
         @When("^recruiter edits prescreening questions$")
         public void recruiter_edits_prescreening_questions() throws Throwable {
        	 driver.findElement(By.xpath("//button[@id='jc-sel-ques-btn']")).click();
        	 Thread.sleep(3000);
  			driver.findElement(By.xpath("(//label[@class='bx--checkbox-label'])[2]")).click();  
 	    	 driver.findElement(By.xpath("//button[text()='Add Selected']")).click();
 	    	 Thread.sleep(2000);
 	    	 driver.findElement(By.xpath("//input[@id='numanswer']")).sendKeys("0");
 	    	 driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();  
         }
       
         @Then("^recruiter can edit collaborators$")
         public void recruiter_can_edit_collaborators() throws Throwable {
//        	 Thread.sleep(2000);
        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        	 Thread.sleep(2000);
        	 WebElement collab=driver.findElement(By.xpath("(//button[@id='add-collab-btn'])[1]"));
 			WebDriverWait wait=new WebDriverWait(driver,20);
 			wait.until(ExpectedConditions.elementToBeClickable(collab));
// 			Thread.sleep(2000);
			  driver.findElement(By.xpath("(//button[@id='add-collab-btn'])[1]")).click(); 
			  Select collabrole=new Select(driver.findElement(By.xpath("//select[@name='selectedRoleId']"))); 
//		    	 Thread.sleep(2000);
		    	 collabrole.selectByVisibleText("Team Member");
		    	 driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
//		    	 Thread.sleep(2000);
		    	 driver.findElement(By.xpath("//div[text()='Sai  Charan (saicharan@trainingqa.com)']")).click();
//		    	 Thread.sleep(2000);
		    	 driver.findElement(By.xpath("//button[text()='Add']")).click();
//		    	 PRE SCREENING Q
//		    	 driver.findElement(By.xpath("//label[@for='showPreScreeningQuest']")).click();(need to comment this line if questions already exists)
		    	 JavascriptExecutor jt=(JavascriptExecutor)driver;
		    	 jt.executeScript("window.scrollBy(0,1000)");
		    	 Thread.sleep(2000);
//		    	 driver.findElement(By.xpath("//button[@id='sel-ques-btn']")).click();  
//		    	 Thread.sleep(2000);
//		    	 driver.findElement(By.xpath("//label[@for='data-table-18__select-row-row_570']")).click();  
//		    	 driver.findElement(By.xpath("//button[text()='Add Selected']")).click();
//		    	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        	 driver.findElement(By.xpath("//label[@for='toggleChatBotDisplay']")).click();
	        	 Thread.sleep(2000);
	        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        	 Thread.sleep(2000);
	        	 driver.findElement(By.xpath("//label[@for='disableKnockout']")).click();               
	        	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
	        	 Thread.sleep(2000);
		    	 driver.findElement(By.xpath("(//button[@id='save-points-oreder-btn'])[1]")).click();
//		    	 PASSING POINTS
		    	 JavascriptExecutor js1=(JavascriptExecutor)driver;
					js1.executeScript("window.scrollBy(0,300)");
					Thread.sleep(2000);
		    	 driver.findElement(By.xpath("(//label[@for='showPassingPoints'])[1]")).click();  
		         driver.findElement(By.xpath("(//input[@id='passingPoints'])[1]")).sendKeys("0");
		         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		         Thread.sleep(2000);
		    	 driver.findElement(By.xpath("(//button[@id='submit-passing-pts-btn'])[1]")).click();
//		    	 INTERVIEW SETUP
		    	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    	 driver.findElement(By.xpath("(//label[@for='showAssessments'])[1]")).click();
		    	 driver.findElement(By.xpath("(//button[@id='add-int-stage-btn'])[1]")).click();
		    	 driver.findElement(By.xpath("//label[@for='radio-3']")).click();
		 		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 		Select interviewround=new Select(driver.findElement(By.id("workflowStage")));
		 		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 		interviewround.selectByVisibleText("Phone Interview");
		 		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 		driver.findElement(By.xpath("//input[@id='stageName']")).sendKeys("phone Round");
		 		driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click(); 
		 		  driver.findElement(By.xpath("//div[@id='InterviewStage']")).click();
		 		 driver.findElement(By.xpath("//label[@for='directInviteSent']")).click(); 
		 		 driver.findElement(By.xpath("(//button[text()='Add slot'])[1]")).click(); 
		 		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				Thread.sleep(2000);
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,100)");
				driver.findElement(By.xpath("(//input[@placeholder='Select start date and time'])[1]")).sendKeys("18th Dec, 2022 08:00");  
				Thread.sleep(3000);
				Actions act=new Actions(driver);
				WebElement endtime=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
				act.click(endtime).perform();
				Thread.sleep(2000);
				WebElement enddate=driver.findElement(By.xpath("//li[text()='08:15']"));
				JavascriptExecutor ju=(JavascriptExecutor)driver;
			    ju.executeScript("window.scrollBy(0,200)");
		           act.moveToElement(enddate);
				enddate.click();
				driver.findElement(By.xpath("(//button[text()='Schedule Interview'])[1]")).click(); 
		    	 
         }

       
         }


	


