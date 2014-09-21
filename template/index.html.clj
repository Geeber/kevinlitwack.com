;; Define template options here
; @layout  default
; @title   home

[:div {:class "title-box text-center col-sm-12 col-md-12"}
  [:h1 {:class "title"} "Welcome!"]
 ]

[:div {:class "bottom-padding col-sm-6 col-md-6"}
 (p
  "Hi! I'm Kevin. I'm a software developer. What I love about my job is that if
  I can find just the right incantation, magic happens. Maybe I should start
  calling myself a software wizard, except that sounds pretentious. I'm not
  that amazing at what I do, but I love learning and I love solving problems.")

 (p
  "If you or someone you know has a problem that you think software can help
  with, you may be interested in what I can do. I&rsquo;m always on the look-out
  for projects that will convert my hard-earned skills into value for society.
  (When possible, getting paid is always good too.) Details can be found on my "
  (link "Professional Site" "professional") ".")

 (p
  "It turns out that, in addition to working, I do other things too! (I believe
  the industry term is \"work-life balance\".) From my Burning Man
  theme camp to my 16,000-nautical-mile sailing trip, it's all on my "
  (link "Personal Site" "personal") ".")

 (p "Cheers!" [:br] "Kevin")]
