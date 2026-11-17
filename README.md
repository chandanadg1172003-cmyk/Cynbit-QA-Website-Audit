# Cynbit Website QA Audit

Applicant: CHANDANA D G  
Target: https://www.cynbit.in/  
Role: QA Testing Intern  
Assessment: Cynbit Website Quality Audit

## Important status
This repository is an audit starter pack. The initial page review was performed through publicly accessible page content. Browser interaction, responsive layout, keyboard accessibility, form submission, performance and security tests still require execution in a real browser. Do not mark a test as PASS or report a defect as confirmed until you execute and capture evidence.

## Scope
- Home, Our Story, Team, Careers, QA Testing Intern, Services, Products, Case Studies, BitElevate, Blog, Contact, Privacy, Terms and Cookies.
- Main navigation, CTAs, application form, contact form, product demo form, newsletter.
- Desktop/tablet/mobile viewport checks.
- Basic accessibility, usability and performance observations.

## Run Selenium smoke tests
Prerequisites: JDK 17+, Maven 3.9+, Chrome browser.

```bash
mvn clean test
```

The tests use Selenium Manager to resolve the browser driver. If your environment blocks driver downloads, configure a local ChromeDriver.

## Evidence naming
Use: `BUG-001_page_short-description.png`  
For each defect record: environment, preconditions, steps, expected result, actual result, severity, priority and screenshot/video.

## Git workflow
```bash
git init
git add .
git commit -m "Initial QA audit structure"
git add docs src pom.xml README.md
git commit -m "Add QA test plan and Selenium smoke tests"
```

Create a public GitHub repository and push only after checking that no personal data, credentials or private information is included.

## Submission checklist
- [ ] Execute and update test cases with actual results
- [ ] Attach screenshots for confirmed defects
- [ ] Verify all severity/priority values
- [ ] Complete environment versions
- [ ] Run Selenium tests and record result
- [ ] Update the report with actual execution date and summary
- [ ] Push repository publicly
- [ ] Submit GitHub URL in the assessment portal
