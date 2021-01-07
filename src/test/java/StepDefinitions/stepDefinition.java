package StepDefinitions;



	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
    import cucumber.api.java.en.And;
	import cucumber.api.junit.Cucumber;
	import org.junit.runner.RunWith;

	@RunWith(Cucumber.class)
	public class stepDefinition {

	    @Given("^User is on NetBanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
	    	System.out.println("naviguated to login url");
	    }

	    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_and_password(String arg1, String arg2) throws Throwable {
	       System.out.println(arg1); 
	       System.out.println(arg2);  
	    }

	    @Then("^cards  displayed are \"([^\"]*)\"$")
	    public void cards_displayed_are(String arg1) throws Throwable {
	    	System.out.println(arg1);
	    }
	    
	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	    	System.out.println("validated home page");
	    
	    }
	    
	    @And("^cards are displayed$")
	    public void cards_are_displayed() throws Throwable {
	    	System.out.println("validated cards");
	    }

	}

