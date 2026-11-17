# QA Audit Report — Cynbit Website

**Applicant:** CHANDANA D G  
**Website:** https://www.cynbit.in/  
**Assessment:** QA Testing Intern — Website Quality Audit  
**Report status:** Initial review / execution pending

## 1. Objective
Evaluate the website from a real user's perspective and identify defects affecting functionality, navigation, usability, responsiveness, accessibility, compatibility, performance and security.

## 2. Scope
In scope:
- Home page and global navigation
- Our Story, Our Team and Careers
- QA Testing Intern role page and application form
- Services and Product Suite pages
- Case Studies and BitElevate
- Blog and Contact page
- Privacy Policy, Terms and Cookie Policy
- Contact, demo, newsletter and application form workflows

Out of scope unless explicitly authorized:
- Authenticated/private intern portal
- Production API penetration testing
- Destructive actions, load testing or submission of real personal data
- Third-party systems not owned by the website

## 3. Methodology
1. Requirement and page inventory review.
2. Smoke testing of page loads and navigation.
3. Functional testing of links, forms and CTAs.
4. Positive, negative and boundary-value testing.
5. Responsive checks at desktop, tablet and mobile sizes.
6. Keyboard and basic accessibility checks.
7. Cross-browser checks.
8. Evidence collection and defect triage.
9. Regression testing after fixes.

## 4. Initial page inventory
The publicly accessible website exposes the following main areas:
- Home: https://www.cynbit.in/
- Our Story: https://www.cynbit.in/story
- Team: https://www.cynbit.in/team
- Careers: https://www.cynbit.in/careers
- QA Testing Intern: https://www.cynbit.in/careers/qa-testing-intern
- Services: https://www.cynbit.in/services
- Products: https://www.cynbit.in/products
- Case Studies: https://www.cynbit.in/case-studies
- BitElevate: https://www.cynbit.in/bitelevate
- Blog: https://www.cynbit.in/blog
- Contact: https://www.cynbit.in/contact
- Privacy: https://www.cynbit.in/privacy
- Terms: https://www.cynbit.in/terms
- Cookies: https://www.cynbit.in/cookies

## 5. Test environment matrix
Fill with the actual values used during execution.

| Parameter | Planned coverage | Actual execution value |
|---|---|---|
| OS | Windows 10/11 | PENDING |
| Desktop browser | Chrome, Edge, Firefox | PENDING |
| Mobile browser | Chrome Android / device emulation | PENDING |
| Desktop viewport | 1920×1080, 1366×768 | PENDING |
| Tablet viewport | 768×1024 | PENDING |
| Mobile viewport | 375×812, 390×844 | PENDING |
| Automation | Java, Selenium, TestNG | PENDING |
| Network | Normal / throttled if available | PENDING |
| Test date | Actual date/time | PENDING |

## 6. Entry and exit criteria
**Entry:** Website is reachable; test browser is available; scope and test data are prepared.

**Exit:** All planned tests have an execution status; all critical/high defects are documented with reproducible evidence; blocked/not-run tests are explained; summary and limitations are recorded.

## 7. Initial review notes
- The Careers page lists a QA Testing Intern role and provides an application detail page.
- The QA role page contains a multi-section application form with personal, academic, location/profile and application-statement fields.
- The Contact page contains an inquiry form and contact details.
- The Products page contains a product demo request form.
- The BitElevate page describes a QA & Test Automation Lab among its tracks.

These are page-content observations only. They do not prove that form submission, validation, navigation interactions or responsive behavior work correctly.

## 8. Execution summary
| Metric | Count |
|---|---:|
| Planned test cases | 25 |
| Passed | PENDING |
| Failed | PENDING |
| Blocked | PENDING |
| Not run | PENDING |
| Confirmed defects | PENDING |

## 9. Limitations
The initial inspection used publicly accessible page content. It did not establish actual browser rendering, DOM accessibility behavior, form backend behavior, network timing, security posture or mobile layout. Complete those checks manually before submitting a final audit.

## 10. Conclusion
This is an initial audit framework, not a completed execution report. Final conclusions must be based on reproducible browser test results and attached evidence.
