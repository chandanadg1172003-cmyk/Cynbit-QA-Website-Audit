# Bug & Issue Report -- Cynbit Website

**Candidate:** Chandana D G\
**Website:** https://www.cynbit.in/\
**Assessment:** QA Testing Intern -- Website Quality Audit\
**Browser:** Google Chrome 157.0.8103.51 (Official Build, 64-bit)\
**Operating system:** Windows 11, Version 24H2

## 1. Executive Summary

Based on the candidate's reported manual test execution, TC01--TC25 were
marked **PASS**. No specific functional bug, broken element, usability
defect, or responsiveness defect was reported during those checks.

This report therefore records **no confirmed defects identified in the
reported test scope**. It does not claim that the entire website is
defect-free.

## 2. Defect Summary

  Category                     Confirmed issues reported
  -------------------------- ---------------------------
  Functional defects                                   0
  Broken links or elements                             0
  Usability defects                                    0
  Responsiveness defects                               0
  Accessibility defects                                0
  Security defects                                     0

**Important:** The counts above mean no defects were reported from the
executed checks. They are not proof that no defects exist.

## 3. Test Coverage and Results

  -----------------------------------------------------------------------------------
  Test ID           Area checked               Candidate-reported   Issue reported
                                               result               
  ----------------- -------------------------- -------------------- -----------------
  TC01              Homepage loading           PASS                 None reported

  TC02              Main navigation links      PASS                 None reported

  TC03              Logo navigation            PASS                 None reported

  TC04--TC15        Main website pages and     PASS                 None reported
                    Contact page                                    

  TC16              Contact form validation    PASS                 None reported

  TC17              Get Started Now button     PASS                 None reported

  TC18              Footer links               PASS                 None reported

  TC19              Newsletter form validation PASS                 None reported

  TC20              Mobile responsiveness (400 PASS                 None reported
                    × 645 px)                                       

  TC21              Tablet responsiveness (768 PASS                 None reported
                    × 768 px)                                       

  TC22              Desktop responsiveness     PASS                 None reported
                    (1366 × 768 px)                                 

  TC23              Keyboard                   PASS                 None reported
                    navigation/accessibility                        

  TC24              Website performance        PASS                 No defect
                                                                    reported; numeric
                                                                    timing should be
                                                                    supported by
                                                                    captured Network
                                                                    evidence

  TC25              Basic HTTPS security       PASS                 None reported
  -----------------------------------------------------------------------------------

For the detailed individual test names and execution notes, refer to
`Test_Cases.csv`.

## 4. Defect Details

No confirmed defect details can be entered because no reproducible
failure was reported.

  Field                Value
  -------------------- -----------------------------------------------
  Bug ID               N/A
  Title                No confirmed defect reported
  Severity             N/A
  Priority             N/A
  Environment          Chrome 157.0.8103.51, Windows 11 Version 24H2
  Steps to reproduce   N/A -- no failure reported
  Expected result      N/A
  Actual result        N/A
  Status               No defect logged

## 5. Evidence

Attach genuine screenshots captured during testing. Suggested evidence
names:

-   `TC01_Homepage.png`
-   `TC20_Mobile_400x645.png`
-   `TC21_Tablet_768x768.png`
-   `TC22_Desktop_1366x768.png`
-   `TC24_Network_Performance.png` (include only if the Network timing
    screenshot was captured)

Do not create or label an estimated value as an actual measured result.
If a timing screenshot is available, transcribe the exact value shown by
the browser and identify which Network timing metric it represents.

## 6. Limitations

-   Results are based on the candidate's reported manual checks.
-   No independent retest was performed for this report.
-   No defect should be added unless it is observed and can be described
    with reproducible steps.
-   A PASS result for the tested viewport sizes does not establish
    responsiveness at every possible screen size.
