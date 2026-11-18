# Cynbit Website Quality Audit

**Candidate:** Chandana D G\
**Target website:** https://www.cynbit.in/\
**Assessment:** QA Testing Intern -- Website Quality Audit\
**Repository:**
https://github.com/chandanadg1172003-cmyk/Cynbit-QA-Website-Audit

## Project Overview

This repository contains the manual QA audit deliverables for the Cynbit
website. The audit covers navigation, page content, forms, responsive
layouts, basic keyboard accessibility, website performance observations,
and HTTPS access.

## Test Environment

  Item               Environment
  ------------------ ------------------------------------------------------
  Operating system   Windows 11, Version 24H2
  Browser            Google Chrome 157.0.8103.51 (Official Build, 64-bit)
  Mobile viewport    400 × 645 px
  Tablet viewport    768 × 768 px
  Desktop viewport   1366 × 768 px

## Testing Summary

The candidate reported the following manual test case results:

-   **TC01--TC25:** PASS, based on the candidate's execution and
    observations.
-   **TC24 -- Website performance:** PASS was reported. The numeric
    page-load duration is not included because a measured timing value
    was not captured.
-   **TC20 -- Mobile responsiveness:** PASS; mobile viewport evidence
    was captured.
-   **TC21 -- Tablet responsiveness:** PASS; tablet viewport evidence
    was captured.
-   **TC22 -- Desktop responsiveness:** PASS; desktop viewport evidence
    was captured.

"PASS" reflects the candidate's reported manual result. It should not be
interpreted as an independent verification of every browser, device, or
network condition.

## Test Coverage

The test cases cover:

1.  Homepage loading and primary navigation
2.  Logo navigation and key website pages
3.  Contact page and contact form validation
4.  Primary call-to-action navigation
5.  Footer links and newsletter form validation
6.  Mobile, tablet, and desktop responsiveness
7.  Keyboard navigation and basic accessibility observations
8.  Website performance observation
9.  Basic HTTPS access

Refer to `docs/Test_Cases.csv` for the test case list and recorded
outcomes.

## Repository Contents

-   `docs/QA_Audit_Report.md` -- audit scope, methodology, and
    environment
-   `docs/Bug_Issue_Report.md` -- issue tracking template and reported
    findings
-   `docs/Improvement_Recommendations.md` -- prioritized improvement
    suggestions
-   `docs/Test_Cases.csv` -- manual test case inventory
-   `src/test/java/com/cynbit/qa/HomePageSmokeTest.java` -- Selenium
    smoke-test starter
-   `pom.xml` -- Maven project configuration
-   `testng.xml` -- TestNG suite configuration

## Automation Starter

The repository includes a Java, Selenium WebDriver, TestNG, and Maven
starter test. The automated test has to be executed in the candidate's
local environment before reporting an automation execution result.

To run it from the project root (the folder containing `pom.xml`):

``` bash
mvn clean test
```

Record the actual command output and resolve any setup or test failures
before describing the automation run as successful.

## Evidence

Add genuine browser screenshots to an `evidence/` folder and reference
them in the audit report. Suggested filenames:

-   `TC01_Homepage.png`
-   `TC20_Mobile_400x645.png`
-   `TC21_Tablet_768x768.png`
-   `TC22_Desktop_1366x768.png`

Only include screenshots that were actually captured during the
assessment.

## Notes

This README summarizes the candidate-reported manual results and the
project structure. It does not claim that the Maven automation suite has
passed, nor does it provide an unmeasured numeric page-load time.
