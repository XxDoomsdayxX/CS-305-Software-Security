# CS-305-Software-Security
Briefly summarize your client, Artemis Financial, and its software requirements. Who was the client? What issue did the company want you to address?

My client was Artemis Financial, a consulting company that creates personalized financial plans for their customers. They handle sensitive data such as savings, retirement, investments, and insurance details.
Artemis Financial wanted to modernize their software and enhance the security of their public web interface. Specifically, they needed a file verification step with a checksum to ensure secure communication during data transfers. They also required me to identify and fix any security vulnerabilities in their existing codebase.

What did you do well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall well-being?

I was thorough in scanning the code for vulnerabilities and applied industry-standard secure coding practices, such as encrypting communication with HTTPS and using SHA-256 hashing for data verification. I also ran OWASP Dependency-Check to ensure third-party libraries were free of known security vulnerabilities.
Writing secure code helps protect sensitive information from being exposed to hackers. It ensures that client data remains safe, which is crucial for maintaining trust and avoiding legal and financial consequences. Secure coding helps reduce the risk of data breaches and keeps the system resilient against attacks.
Software security improves a company’s reputation, keeps clients’ data safe, and ensures compliance with regulations. It also minimizes downtime and costly fixes by preventing vulnerabilities from being exploited.

Which part of the vulnerability assessment was challenging or helpful to you?

One of the more challenging parts was setting up the TLS/HTTPS configuration correctly and ensuring that all components communicated securely. However, using OWASP Dependency-Check was helpful in quickly identifying vulnerable third-party libraries.


How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?

I added layers of security by enabling HTTPS, integrating SHA-256 checksum verification, and using input validation to block attacks like SQL injection and XSS. I also scanned for vulnerabilities in third-party dependencies to reduce risks from external libraries.
I would continue using tools like OWASP Dependency-Check, as well as incorporate static code analysis tools and manual code reviews to assess vulnerabilities. Deciding on mitigation techniques will depend on the severity of the risk, prioritizing fixes for the most critical vulnerabilities.

How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

After refactoring, I ran thorough unit and integration tests to make sure the application worked as expected. I also performed manual code reviews to verify that security measures were properly implemented and that no new vulnerabilities were introduced.
I used the OWASP Dependency-Check tool and manual testing to ensure that no new vulnerabilities were introduced during the refactoring process. This helped confirm that the security updates did not break existing functionality or create new risks.

What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?

Tools like OWASP Dependency-Check and Spring Boot security configuration were incredibly useful. Following secure coding guidelines, such as proper input validation and error handling, will be valuable in any future project where security is important.

Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?

I could show my work on setting up secure HTTPS communication, implementing SHA-256 checksum verification, and integrating OWASP Dependency-Check. These examples demonstrate my ability to identify and fix security vulnerabilities while ensuring the application remains functional. They also highlight my knowledge of industry-standard security practices.
