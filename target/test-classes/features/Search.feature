Feature : Search functionality

Scenario: User search for valid product 
Given : User opens the application
When : User enters valid product "HP" into the search box field
When    : User clicks on search button
Then : User should gets a valid product displayed in search results

Scenario:
User search for invalid product
Given : User opens the application
When : User enters invalid product "Car" into the search box field
And : User clicks on search button
Then : User should get a message There is no product that matches the search criteria displayed in search results

Scenario:
User searches without any product
Given : User opens the application
When : User do not enter any product name into search box field
And : User clicks on Search button
Then : User should get a message about no product matching 
