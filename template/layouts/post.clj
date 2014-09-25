; @layout  default
; @title   post default title

[:div {:class "post"} contents]

(p ( -> site :date misaki.util.date/date->string)
   " | Tags: "
   (interpose ", "
     (for [tag (:tag site)]
       (link (:name tag) (:url tag)))))

(prev-next-post-link)
