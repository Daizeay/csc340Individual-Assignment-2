# Dog API Prototype

## Overview

This Spring Boot application is a simple API that connects to the Dog CEO API to fetch random dog images. It provides a single endpoint to retrieve a random dog image URL along with the status of the request.

## Setup and Running the Project
Step One: Create a new Java SpringBoot project from Spring Initializr, following the prompts from this guide. Open the project folder in IntelliJ.

Please select the correct project folder, not the parent folder. Otherwise IntelliJ will refuse to run your project!

Select the folder that has a tiny black box on it.

Step Two: Create a new Java object prototype based on the data you get from the API response. In the example demo above at /brew, we created a Brewery object with 3 attributes that we could read from the OpenBrewery API response. The OpenBrewery API responds with a JSON array so we have to loop through it to get a list of breweries.

In the second example, /fruit, we use the response from the FruityVice API to build a single Fruit object. The FruityVice API responds with a SINGLE JSON object so there is no need to loop through anything.

Be sure to create an object with attributes that are always available in the response, i.e., if an attribute value is usually null in the 3rd party API response, it's best not to include it the custom Java class that you define.

Step Three: Create a new Controller class with at least one Get Mapping. Be sure to annotate it properly. Use the GET mapping to call your chosen 3rd party API. Parse the response to build an instance of the object you defined in Step Two. Your GET mapping method should then return this object. It may return either a single instance, or a list of objects. The choice is yours. The demo has several examples of this.

Step Four: Test your API prototype by running the main class to start your server, then using POSTMAN to test the GET endpoint that you made at localhost. Make sure the response is as expected.

Step Five: Turn your project into a git repository.

You can do this in

IntelliJ: VCS-->Create Git Repository.
Git Bash (Make sure your present working directory is the parent folder of your project. Check using the command pwd, and cd accordingly): git init.
 

Step Six: Create a new PUBLIC GitHub repository that you will use to host this project. Leave the repository empty and do not add even a ReadMe file. You will add one later. 

Step Seven: Add the GitHub repository as the remote for your project. 

You can do this in

IntelliJ: Git-->Manage Remotes-->+
Git Bash (Double check you are in a git repository. You should see the branch name in blue). git remote add origin <url-to github-repo>
Step Eight: Check git status. Go through the steps to get your work published to GitHub. (add, commit, push)

Step Nine: Verify that your project files were pushed to GitHub. The target folder should NOT be in there. Add a ReadMe.md file directly in the GitHub repository. Add documentation for your API prototype as shown in our demo.

### Prerequisites

- JDK 21 (or a compatible version)
- Maven

### Instructions
Clone the project (or download zip) and open it in IntelliJ.
Make sure jdk versions match.
Run the main method.
On POSTMAN:
http://localhost:8080/dog (GET)

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Daizeay/csc340Individual-Assignment-2/tree/master
