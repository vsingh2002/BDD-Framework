Feature : Register Functionality

Scenario: User creates an account with only mandatory field
Given : User navigates to Register Account page
When : User enters the details into below fields
|firstName          |Ravindra                            |
|lastName           |Jadeja                              |
|email              |ravindrajadeja@mailinator.com       |
|telephone          |748902589                           |
|password           | Jadeja@123                         |
|confirmpassword    | Jadeja@123                         |
When    : User selects privacy policy 
When   : User clicks on Continue button
Then : User account should get created successfully

Scenario: User creates an account with all fields
Given : User navigates to register account page
When : User enters the details into below fields
|firstName            |Ravindra                      |
|lastName             |Jadeja                        |
|email                |ravindrajadeja@mailinator.com |
|telephone            |8567890589                    |
|password             |Jadeja@123                    |
And   : User selects yes for Newsletter
And : User selects privacy policy
And : User clicks on continue button
Then : User account should get created successfully

Scenario: User creates a duplicate account
Given : User navigates to register account page
When : User enters the details into below fields
|firstName            |Ravindra                         |
|lastName             |Jadeja                           |
|email                |ravindrajadeja@mailinator.com    |
|telephone            |1234567890                       |
|password             |Jadeja@123                       |
And : User selects yes for Newsletter
And : User selects privacy policy
And : User clicks on continue button
Then : User should get a proper warning about duplicate email 

Scenario: User creates an account without filling any details 
Given :User navigates to register account page
When : User do not enter any details into the fields
And   :Clicks on continue button 
Then : User should get a proper warning message for every mandatory fields




