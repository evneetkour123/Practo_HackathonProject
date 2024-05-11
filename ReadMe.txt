Overview

This project aims to automate the Practo Website using Selenium WebDriver. The automation process involves navigating through the Practo page, selecting the location Bangalore, selecting the doctor in search, applying the filters and extracting the details of the doctors. Clicking on Medicines and Extracting the details of Popular Products. Clicking on the Corporates, Selecting Health and Wellness Plans, Filling the form, Clicking on the Schedule a demo and extracting the result.


Libraries and Dependencies
	Maven Repository: Maven 4.0.0
	TestNG: 7.10.1
	Selenium WebDriver: 4.19.1
Automation Flow
	Navigate to Practo Website.
	Select the location Bangalore.
	Select Doctor in search bar.
	Select 10+ Patient Stories for Patient Stories.
	Select 15+ Years of experience for Experience.
	Click on All Filters.
	Click on Above Rs1000 for Fees.
	Click on Available in next 7 days for Availability.
	Extract the Details of Doctors.
	Click on Medicines.
	Extract the details of Popular Products.
	Click on For Corporates.
	Select Health and Wellness.
	Fill the Form.
	Click on Schedule a demo.
	Extract the details of result.


Libraries Explanation
	Maven Repository: Used for project management and dependency resolution.
	TestNG: Facilitates test case organization and execution.
	Selenium WebDriver: Automates browser interactions.
Screenshots
	Screenshots are captured at relevant steps for documentation and analysis.

How to Run
	Open Eclipse IDE:

		Launch Eclipse IDE on your machine.
	Import Project:

		Select File -> Import from the menu.
		Choose Existing Maven Projects and click Next.
		Browse to the directory where you cloned the repository and select the project.
	Update Maven Project:

		Right-click on the project in the Project Explorer.
		Choose Maven -> Update Project.
		Click OK to update dependencies.

	Run Test Suite:

		Locate the test suite file (testng.xml)
		Right-click on the file and choose Run As -> TestNG Suite.
	View Reports:

		After execution, open the test-output folder.
		Find the TestNG file (index.html) for detailed test case reports.
Reporting
	Locate Test Reports:

		After the execution, navigate to the test-output folder in the project directory.
	Open Test Report:

		Inside the test-output folder, find the Extent Report HTML file named index.html.
	View Test Reports:

		Open the index.html file using any web browser. This report provides a detailed overview of test executions, including passed and failed tests, test duration, and any exceptions encountered.
	Screenshots:

		screenshots captured during test execution for relevant test cases.
	Analyze Results:

		Utilize the visual representation in the TestNG Report to quickly identify test status and any issues encountered during the test run.

		
Team Members:
	Suryakant Bhumarkar
	Kusen Subba
	Evneet Kour
	Megha Napit
	Dudekula Nasreen