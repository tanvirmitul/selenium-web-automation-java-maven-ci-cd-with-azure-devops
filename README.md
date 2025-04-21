# selenium-web-automation-java-maven-ci-cd-with-azure-devops
Automated web testing using **Selenium WebDriver (Java)** with **Maven**, integrated into **Azure DevOps CI/CD**.

📖 **Related Article**: [How to Set Up Selenium CI/CD Pipeline in Azure DevOps]([https://your-article-link-here/](https://www.linkedin.com/pulse/integrating-java-selenium-automation-azure-devops-ci-pipeline-mitul-nof2c/?trackingId=E93qmakapc34FVN83nYoAQ%3D%3D))

* * *

## **Quick Start**

### **Prerequisites**

* *   Java JDK 11+ | Maven 3.8+ | Chrome/Firefox
*     

### **Run Tests Locally**

bash

Copy

Download

 ```
 git clone <repo-url\>  
cd <project-folder\>  
mvn clean test
 ```
### **Test Reports**

* *   **Surefire**: `target/surefire-reports/`
*     

## **Azure DevOps CI Pipeline**

✅ **Automated Build & Test** on every `main` push  
✅ **Publishes Results** in Azure DevOps

🔧 **Pipeline File**: `azure-pipelines.yml`
