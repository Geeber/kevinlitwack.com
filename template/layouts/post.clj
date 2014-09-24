; @layout  default
; @title   post default title

[:div {:class "title-box text-center col-sm-12 col-md-12"}
  [:h1 {:class "title"} (str (:title site) " - " (-> site :date misaki.util.date/date->string))]
 ]

[:div {:class "bottom-padding col-sm-9 col-md-9"}
 [:div {:class "post"} contents]
 (p "Tags:")
 (post-tags)
 (prev-next-post-link)]
