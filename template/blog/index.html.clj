; @layout  default
; @title   Evolving Ideas

[:div {:class "title-box text-center col-sm-12 col-md-12"}
  [:h1 {:class "title"} "Evolving Ideas"]
 ]

[:div#archives
 [:h3 "Recent Posts:"]
 (post-list)
 (prev-next-page-link)]
