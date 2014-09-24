; @layout  default
; @title   tag default title

[:div {:class "title-box text-center col-sm-12 col-md-12"}
  [:h1 {:class "title"} "\"" (:tag-name site) "\" Posts"]
 ]

[:div {:class "bottom-padding col-sm-6 col-md-6"}
 (ul #(link (str (:title %) " - " (misaki.util.date/date->string (:date %))) (:url %))
     (:posts site))]
