; @layout  default
; @title   Tagged Posts

(p "Posts with tag \"" (:tag-name site) "\":")

(ul #(link (str (:title %) " - " (misaki.util.date/date->string (:date %))) (:url %))
    (:posts site))
