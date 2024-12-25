Feature: Conduit CRUD Functions

Scenario: Login into App
Given User is on Login page
When User provide the "annu@gmail.com" and "Conduit@2024"
Then user should be on home page

Scenario: Create new article
Given User should be on New Article Page
When User enters Article details
|title|Desc|Content|tag|
Then Article must be created

#Scenario: View Article
#Given User should be on Global Feed Page 
#When User select an article "Article title"
#Then article detail page must be displayed

#Scenario: Update an Article
#Given Article detail page must be displayed 
#When User update article detail
#Then article detail must be updated



