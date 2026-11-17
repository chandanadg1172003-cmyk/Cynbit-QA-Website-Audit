# Improvement Recommendations — Cynbit Website

These are recommendations to validate against implementation and user research; they are not defect claims.

## P1 — Form reliability and feedback
- Provide inline, accessible validation for required fields, email, phone and consent.
- Preserve valid user-entered values after validation errors.
- Display clear success and failure messages after submission.
- Prevent duplicate submissions while a request is processing.
- Add server-side validation and rate limiting; never rely only on client-side checks.

## P1 — Accessibility
- Ensure all form controls have programmatic labels.
- Ensure menus and dialogs work with keyboard only.
- Provide visible focus indicators and logical focus order.
- Use meaningful alt text for informative images and empty alt text for decorative images.
- Check text/background contrast against WCAG 2.2 AA targets.

## P2 — Responsive usability
- Verify no horizontal page overflow at 320–390 px widths.
- Ensure navigation collapses accessibly and can be opened/closed by keyboard.
- Stack forms and cards cleanly on mobile.
- Ensure tap targets are comfortably sized and content is not clipped.

## P2 — Navigation and content
- Use consistent CTA labels and destinations.
- Add clear active/hover/focus states to navigation links.
- Ensure footer links and social links have meaningful accessible names.
- Keep contact details and business information consistent across pages.

## P2 — Performance and reliability
- Optimize image formats and responsive image delivery.
- Lazy-load below-the-fold imagery.
- Minimize unused JavaScript and CSS.
- Monitor Core Web Vitals using Lighthouse or PageSpeed Insights.
- Add automated smoke checks to CI for key routes.

## P3 — QA process enhancements
- Maintain traceability between requirements, test cases and defects.
- Run smoke and regression suites for every release.
- Add automated accessibility scans and link checks to CI.
- Capture browser, viewport and build details in every defect report.
