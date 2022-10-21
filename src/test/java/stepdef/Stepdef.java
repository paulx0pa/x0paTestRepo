package stepdef;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Stepdef {
	
		public static WebDriver driver;
		JavascriptExecutor js=(JavascriptExecutor)driver;
		@Given("^Launch Application using valid URL$")
		public void launch_Application_using_valid_URL() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
	        driver.manage().deleteAllCookies();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.get("http://staging.x0pa.ai/app/roboroy");
	        /*System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("headless");
			options.addArguments("disable-gpu");
			driver=new ChromeDriver(options);*/
		}
		@Then("^accept cookies and choose login type$")
		public void accept_cookies_and_choose_login_type() throws Throwable {
			driver.findElement(By.id("hs-eu-confirmation-button")).click();
	        driver.findElement(By.linkText("Candidate Login")).click(); 
		}
		@When("^enters valid credentials \"([^\"]*)\" and \"([^\"]*)\"$")
		public void enters_valid_credentials_and(String email, String password) throws Throwable {
			driver.findElement(By.name("username")).sendKeys(email);
			driver.findElement(By.name("password")).sendKeys(password); 
		}

		@Then("^verify captcha and click on Login button$")
		public void verify_captcha_and_click_on_Login_button() throws Throwable {
			driver.findElement(By.xpath("//div[@class='mb-2']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click(); 
		}

		@Given("^Click on Logout Button$")
		public void click_on_Logout_Button() throws Throwable {
			Thread.sleep(4000);
			driver.findElement(By.xpath("//button[@aria-label='Logout']")).click();
		}
		@Given("^Recruiter clicks on Jobs Menu$")
		public void recruiter_clicks_on_Jobs_Menu() throws Throwable {
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//a[@class='bx--header__menu-item'])[2]")).click();
		}

		@Then("^select create new job section$")
		public void select_create_new_job_section() throws Throwable {
			Thread.sleep(4000);
			driver.findElement(By.linkText("Create New Job")).click();
			 Thread.sleep(2000); 
		}

		@When("^click on Start button of form$")
		public void click_on_Start_button_of_form() throws Throwable {
			driver.findElement(By.xpath("//div[@class='mt-3']//child::button[contains(text(),'Start')]")).click(); 
			Thread.sleep(4000);
		}

		@When("^choose office address \"([^\"]*)\"$")
		public void choose_office_address(String address) throws Throwable {
			WebElement OfficeAddress=driver.findElement(By.xpath("//input[@id='react-select-3-input']"));
		    OfficeAddress.sendKeys(address);
		    Thread.sleep(2000);
			OfficeAddress.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			OfficeAddress.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
		}

		@When("^add Job Title as \"([^\"]*)\"$")
		public void add_Job_Title_as(String title) throws Throwable {
			WebElement jobtitle=driver.findElement(By.xpath("//input[@placeholder='Job Title']"));
			jobtitle.sendKeys(title);
			Thread.sleep(2000); 
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
			Thread.sleep(2000);
			jobstatus.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
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
			Thread.sleep(2000);
			countrylocation.sendKeys(Keys.ENTER);
			Thread.sleep(2000); 
		}

		@When("^Select City location \"([^\"]*)\"$")
		public void select_City_location(String cityname) throws Throwable {
			WebElement citylocation=driver.findElement(By.id("react-select-6-input"));
			citylocation.sendKeys(cityname);
			citylocation.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(5000);
			citylocation.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
		}

		@When("^add skills \"([^\"]*)\" and \"([^\"]*)\"$")
		public void add_skills_and(String skill1, String skill2) throws Throwable {
			WebElement skills=driver.findElement(By.id("react-select-7-input"));
			skills.sendKeys(skill1);
			skills.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			skills.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			skills.sendKeys(skill2);
			skills.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			skills.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		}

		@When("^add Qualification \"([^\"]*)\"$")
		public void add_Qualification(String degree) throws Throwable {
			WebElement qualification=driver.findElement(By.xpath("//input[@id='react-select-8-input']"));
		     qualification.sendKeys(degree);
		     qualification.sendKeys(Keys.ARROW_DOWN);
		     Thread.sleep(2000);
		     qualification.sendKeys(Keys.ENTER);
		     Thread.sleep(2000);
		}

		@When("^add job type in emp details as \"([^\"]*)\"$")
		public void add_job_type_in_emp_details_as(String jt) throws Throwable {
			WebElement jobtype=driver.findElement(By.xpath("//input[@id='react-select-9-input']"));
			jobtype.sendKeys(jt);
		    jobtype.sendKeys(Keys.ARROW_DOWN);
		    Thread.sleep(2000);
		    jobtype.sendKeys(Keys.ENTER);
		    Thread.sleep(2000);
		}

		@When("^select minimum experience as \"([^\"]*)\"$")
		public void select_minimum_experience_as(String minxp) throws Throwable {
			driver.findElement(By.xpath("//input[@id='minExp']")).sendKeys(minxp);;
			Thread.sleep(2000);
		}

		@When("^select maximum experience as \"([^\"]*)\"$")
		public void select_maximum_experience_as(String maxxp) throws Throwable {
			driver.findElement(By.id("maxExp")).sendKeys(maxxp);
			Thread.sleep(2000);
		}

		@When("^choose Employment type as \"([^\"]*)\"$")
		public void choose_Employment_type_as(String emptyp) throws Throwable {
			WebElement emptype=driver.findElement(By.xpath("//input[@id='react-select-10-input']"));
			emptype.sendKeys(emptyp);
			emptype.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			emptype.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		}

		@When("^choose no of vacancies \"([^\"]*)\"$")
		public void choose_no_of_vacancies(String vac) throws Throwable {
			WebElement vacancies=driver.findElement(By.xpath("//input[@id='noOfVacancies']"));
			vacancies.click();
			Thread.sleep(2000);
			vacancies.sendKeys(vac);
			Thread.sleep(3000);
		}

		@When("^choose close date of job \"([^\"]*)\"$")
		public void choose_close_date_of_job(String closedate) throws Throwable {
			WebElement closejob=driver.findElement(By.xpath("//input[@placeholder='End Date']"));
			 closejob.sendKeys(closedate);
			 closejob.sendKeys(Keys.ENTER);
			 Thread.sleep(3000);
		}


		@When("^add Job Description \"([^\"]*)\"$")
		public void add_Job_Description(String jd) throws Throwable {
			driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys(jd);
			Thread.sleep(2000);
		}

		@When("^add Job Requirements \"([^\"]*)\"$")
		public void add_Job_Requirements(String jr) throws Throwable {
			driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys(jr);
			Thread.sleep(2000);
		}
		@When("^choose primary recruiter \"([^\"]*)\"$")
		public void choose_primary_recruiter(String recname) throws Throwable {
			WebElement prrec=driver.findElement(By.id("react-select-12-input"));
			prrec.sendKeys(recname);
		    Thread.sleep(2000);
			prrec.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			prrec.sendKeys(Keys.ENTER);
			Thread.sleep(4000);
		}

		@When("^click on submit button of job$")
		public void click_on_submit_button_of_job() throws Throwable {
			driver.findElement(By.xpath("//div[@class='ml-2']//child::button[contains(text(),'Submit')]")).click(); 
		}
		@When("^clicks on skills and education section$")
		public void clicks_on_skills_and_education_section() throws Throwable {
			Thread.sleep(3000);
			 driver.findElement(By.xpath("(//button[@type='button'])[43]")).click();
		}

		@When("^recruiter add industry field \"([^\"]*)\"$")
		public void recruiter_add_industry_field(String indus) throws Throwable {
			Thread.sleep(2000);
			WebElement industry=driver.findElement(By.xpath("//input[@id='react-select-14-input']"));
		    industry.sendKeys(indus);
			industry.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			industry.sendKeys(Keys.ENTER);
			Thread.sleep(2000); 
		}

		@When("^add keywords for AI to vote CV \"([^\"]*)\"$")
		public void add_keywords_for_AI_to_vote_CV(String kwd) throws Throwable {
			Thread.sleep(2000);
			WebElement keyword =driver.findElement(By.xpath("//input[@id='react-select-15-input']"));
		    keyword.sendKeys(kwd);
			keyword.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			keyword.sendKeys(Keys.ENTER);
			Thread.sleep(2000);  
		}

		@When("^recruiter add Education \"([^\"]*)\"$")
		public void recruiter_add_Education(String edu) throws Throwable {
			Thread.sleep(2000);
			WebElement education=driver.findElement(By.xpath("//input[@id='react-select-16-input']"));
			education.sendKeys(edu);
			education.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			education.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		}

		@When("^recruiter clicks on Additional Information$")
		public void recruiter_clicks_on_Additional_Information() throws Throwable {
			 Thread.sleep(2000);
		    driver.findElement(By.xpath("(//button[@class='bx--btn bx--btn--secondary'])[1]")).click();   
		}

		@When("^recruiter add Work Location \"([^\"]*)\"$")
		public void recruiter_add_Work_Location(String wl) throws Throwable {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@id='workLocation']")).sendKeys(wl);
		}

		@When("^recruiter add working Hours \"([^\"]*)\"$")
		public void recruiter_add_working_Hours(String hrs) throws Throwable {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@name='workHours']")).sendKeys(hrs);
		}

		@When("^enter minimal Annual Salary \"([^\"]*)\"$")
		public void enter_minimal_Annual_Salary(String minsal) throws Throwable {
			Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@id='minSalary']")).sendKeys(minsal);
		}

		@When("^enter maximum Annual Salary \"([^\"]*)\"$")
		public void enter_maximum_Annual_Salary(String maxsal) throws Throwable {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='maxSalary']")).sendKeys(maxsal);
		}

		@Given("^recruiter clicks on pre screening questionaire$")
		public void recruiter_clicks_on_pre_screening_questionaire() throws Throwable {
			Thread.sleep(2000);
		   driver.findElement(By.xpath("(//li[@class='sui-single-option-facet__item inactive'])[3]")).click();
		}
		@When("^recruiter clicks on select questions button$")
		public void recruiter_clicks_on_select_questions_button() throws Throwable {
			Thread.sleep(2000);
		   driver.findElement(By.xpath("//button[text()='Select Questions']")).click();
		}
		@When("^recruiter clicks on Add Question button$")
		public void recruiter_clicks_on_Add_Question_button() throws Throwable {
			Thread.sleep(2000);
		   driver.findElement(By.xpath("//button[text()='Add Question']")).click();
		   
		}
		@When("^recruiter adds essay text type question$")
		public void recruiter_adds_essay_text_type_question() throws Throwable {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@name='question']")).sendKeys("done any course on java?");
			Thread.sleep(2000);
		    driver.findElement(By.xpath("(//span[@class='bx--radio-button__appearance'])[1]")).click();
			Thread.sleep(2000);
			WebElement category=driver.findElement(By.xpath("//input[@id='react-select-17-input']"));
			category.sendKeys("hr");
			Thread.sleep(3000);
			category.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			category.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Submit')])[1]")).click(); 
		}
		@When("^recruiter adds numeric type question$")
		public void recruiter_adds_numeric_type_question() throws Throwable {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Add Question']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@name='question']")).sendKeys("what is your % in graduation ?");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class='bx--radio-button__appearance'])[2]")).click();
			Thread.sleep(2000);
			WebElement category=driver.findElement(By.xpath("//input[@id='react-select-18-input']"));
			category.sendKeys("hr");
			Thread.sleep(3000);
			category.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			category.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(text(),'Submit')])[1]")).click(); 
			
		}

		@When("^recruiter adds yes or no question$")
		public void recruiter_adds_yes_or_no_question() throws Throwable {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Add Question']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@name='question']")).sendKeys("are you willing to relocate ?");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class='bx--radio-button__appearance'])[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class='bx--toggle__switch']")).click();
			Thread.sleep(2000);
			WebElement category=driver.findElement(By.xpath("//input[@id='react-select-19-input']"));
			category.sendKeys("hr");
			Thread.sleep(3000);
			category.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			category.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
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
			WebElement category=driver.findElement(By.xpath("//input[@id='react-select-17-input']"));
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
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//td[@class='bx--table-column-checkbox'])[1]")).click();
			}

		@Then("^click on Add Selected option$")
		public void click_on_Add_Selected_option() throws Throwable {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Add Selected']")).click();  
		}

		@Given("^recruiter Clicks on Attachments section$")
		public void recruiter_Clicks_on_Attachments_section() throws Throwable {
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[@type='button'])[73]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='bx--file__drop-container']")).click();
		}

		@When("^recruiter uploads Attachment file$")
		public void recruiter_uploads_Attachment_file() throws Throwable {
			Thread.sleep(2000);
			Robot rb = new Robot(); 
		    StringSelection str = new StringSelection("C:\\Users\\paul\\Downloads\\VinayResume.docx");
		    Thread.sleep(2000);
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		     rb.keyPress(KeyEvent.VK_CONTROL);
		     rb.keyPress(KeyEvent.VK_V);
		     rb.keyRelease(KeyEvent.VK_CONTROL);
		     rb.keyRelease(KeyEvent.VK_V);
		     rb.keyPress(KeyEvent.VK_ENTER);
		     rb.keyRelease(KeyEvent.VK_ENTER);

		}

		@Then("^click on submit after uploading file$")
		public void click_on_submit_after_uploading_file() throws Throwable {
			driver.findElement(By.xpath("(//button[@class='bx--btn bx--btn--primary'])[1]")).click();
			 Thread.sleep(3000);
		}
		
		
		//sign in apply
		
		
		
		@Given("^Candidate clicks on job link$")
		public void candidate_clicks_on_job_link() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().deleteAllCookies();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    driver.get("https://staging.x0pa.ai/app/roboroy/job/608259?sharing=6c12f837e6df95f22b21be");   
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
			driver.findElement(By.xpath("//span[text()='Apply']")).click();   
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

		@When("^click on checkbox to recieve whatsapp notifications$")
		public void click_on_checkbox_to_recieve_whatsapp_notifications() throws Throwable {
		driver.findElement(By.xpath("(//label[@class='bx--checkbox-label'])[1]")).click();	   
		}

		@When("^Candidate uploads his resume$")
		public void candidate_uploads_his_resume() throws Throwable {
			Thread.sleep(2000);
			driver.findElement(By.className("bx--file__drop-container")).click();
			Robot rb = new Robot();
			StringSelection str = new StringSelection("C:\\Users\\paul\\Downloads\\VinayResume.docx");
			Thread.sleep(2000);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER); 
			driver.findElement(By.xpath("//label[@class='bx--checkbox-label']")).click();
		}
	    //apply as guest
		@When("^candidate choose to apply as guest$")
		public void candidate_choose_to_apply_as_guest() throws Throwable {
		Thread.sleep(2000);
	    driver.findElement(By.xpath("(//span[@class='bx--radio-button__appearance'])[1]")).click();
		}

		@Given("^close Browser$")
		public void close_Browser() throws Throwable {
		   driver.close();
		}


	}


