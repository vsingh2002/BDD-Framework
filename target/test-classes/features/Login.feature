 Feature : Login Functionality
 
 Scenario: Login with valid credentials
 Given :User has navigated to login page 
 When :User has entered valid email address "firstlast@mailinator.com" into email field
 And : User has entered valid password "First@123" into password field
 And : User clicks on login button
 Then : User should gets successfully logged in 
 
Scenario:
Login with invalid credentials
Given : User has navigated to login page
When : User enters invalid email address in email field "firstlasst@mailinator.com"
And : User entered invalid password "First@1234" into password field
And: User clicks on login button
Then :User should gets a proper warning message about credentials mismatch

Scenario:
Login with valid email and invalid password
Given : User has navigated to login page
When : User enters valid email address in email field "firstlast@mailinator.com"
And : User entered invalid password "first1234" into password field
And : User clicks on login button
Then : User should gets a proper warning message about credentials mismatch

Scenario:
Login with invalid email and valid password
Given : User has navigated to login page
When : User enters invalid email address "first@mailinator.com" in email field
And :User entered valid password into password field
And : User clicks on login button
Then : User should gets a proper warning message about credentails mismatch

Scenario:
Login without providing any credentials
Given : User has navigated to login page
When : User does not entered a email address in the email field
And : User does not entered the password into password field
And : User clicks on login button
Then : User should gets a proper warning message to fill the details

