;; Define template options here
; @layout  default
; @title   Resume
; @extra-css css/resume.css

; NOTE: This page was originally generated from a Word doc using Word's export to HTML feature.
; It has been cleaned up a fair amount since then, but it's still a bit clunky in places.

; TODO LIST:
; * Add a "print" version which:
; ** Omits the header/nav bar
; ** Removes link formatting, adds URL (for Kallisti map)

[:div#experience.resume-section
 [:h2.resume-header "Full-Time Experience"]

 [:div.project-summary
  [:span.date-range "Jul 2014 – present"]
  [:span.project "Keen IO (San Francisco, CA)"]]

 (p {:style "margin-bottom:4.3pt"}
    [:b "Software Engineer, Platform Team"])

 [:ul {:style "margin-top:0in" :type "disc"}
  [:li "Designing and building platform features"]
  [:li "Improving development/test/operational infrastructure; participating in on-call rotation"]
  [:li "Owner of the Keen IO Java/Android SDK"]]

 [:div.project-summary
  [:span.date-range "Apr 2012 – Jul 2013"]
  [:span.project "Amazon.com (Seattle, WA)"]]

 (p {:style "margin-bottom:4.3pt"}
    [:b "Software Development Engineer II, Internal Machine Learning Platform, Seller Services"])

 [:ul {:style "margin-top:0in" :type "disc"}
  [:li "Designed and implemented features across entire product, from CLI to back end"]
  [:li "Worked with a variety of machine learning methodologies, algorithms, and applications"]
  [:li "Led efforts to re-factor core components while continuously delivering high-impact features"]
  [:li "Annual review: \"primary voice\" for code quality and \"strongest advocate of customer focus\""]]

 [:div.project-summary
  [:span.date-range "Nov 2006 - Aug 2009"]
  [:span.project "Microsoft (Redmond, WA)"]]

 (p {:style "margin-bottom:4.3pt"}
    [:b "Software Development Engineer I-II, System Integrity team, Windows Security"])

 [:ul {:style "margin-top:0in" :type "disc"}
  [:li "Developed Windows 7 features from initial architecture through implementation and shipping"]
  [:li "Owned: BitLocker Drive Encryption boot code, CLI, user-mode API"]
  [:li "Regarded as excellent security designer, low-level debugger and systems programmer"]]

 [:div.project-summary
  [:span.date-range "Jul 2005 - Oct 2006"]
  [:span.project "Microsoft (Redmond, WA)"]]

 (p {:style "margin-bottom:4.3pt"}
    [:b "Penetration Test/Security Engineer, System Integrity team, Windows Security"])

 [:ul {:style "margin-top:0in" :type "disc"}
  [:li "Performed threat modeling, pen-testing, fuzzing, and code/architecture audits of BitLocker"]
  [:li "Worked with engineering team to prioritize investment areas for additional security analysis"]]]

[:div#freelance.resume-section
 [:h2.resume-header "Freelance Experience"]

 [:div.project-summary
  [:span.date-range "Oct 2013 – May 2014"]
  [:span.project "RentHop.com (New York, NY)"]]

 [:ul {:style "margin-top:0in" :type "disc"}
  [:li "Ported existing iOS \"RentHop\" and \"RentHop Manager\" apps to Android"]]

 [:div.project-summary
  [:span.date-range "Jan – May 2014"]
  [:span.project "Keen IO (San Francisco, CA)"]]

 [:ul {:style "margin-top:0in" :type "disc"}
  [:li "Refactored Java and Android SDKs to share a common code base; added functionality"]]]

[:div#non-occupational.resume-section
 [:h2.resume-header "Non-Occupational Activities"]

 [:div.project-summary
  [:span.date-range "Sep 2009 - Jun 2011"]
  [:span.project "Seattle to Singapore via Japan, Thailand, Sri Lanka..."]]

 (p {:style "margin-bottom:4.3pt"}
    (link "Traveling by Sailboat" "/personal/kallisti"))

 [:ul {:style "margin-top:0in" :type "disc"}
  [:li "With one crew-mate and no prior experience: planned and sailed 16,000+ nautical miles"]
  [:li "Ultimately abandoned attempt to reach Boston due to Somali pirate activity"]]]

[:div#education.resume-section
 [:h2.resume-header "Education"]

 [:div.project-summary
  [:span.date-range "Aug 2001 - May 2005"]
  [:span.project "Carnegie Mellon University (Pittsburgh, PA)"]]

 (p {:style "margin-bottom:4.3pt"}
    [:b "B.S. in Computer Science &amp; Discrete Math, School of Computer Science, 3.97 GPA"])

[:div#skills-interests.resume-section
 [:h2.resume-header "Skills & Interests"]

 [:ul {:style "margin-top:0in" :type "disc"}
  [:li "Primary Technologies: C/C++, C#, Java, Ruby, Rails (familiarity with others, and I learn
       fast)"]
  [:li "Languages: Japanese (conversational written/spoken)"]
  [:li "Interests: Neuroscience, Evolution, Philosophy, Cosmology, Sociology... basically anything
       about the Universe and humanity's place in it"]]]]
