; @title  default title
; @format html5

(defn menu []
 (list
  [:button
   {:type "button"
    :class "navbar-toggle btn-navbar collapsed"
    :data-toggle "collapse"
    :data-target ".primary .navbar-collapse"}
   [:span.text "Menu"]
   [:span.icon-bar]
   [:span.icon-bar]
   [:span.icon-bar]]

  [:nav {:class "collapse collapsing navbar-collapse"}
   [:ul {:class "nav navbar-nav navbar-center"}
    [:li.parent
     (link "Personal" "personal/about.html")
     [:ul.sub
      [:li (link "About Me" "personal/about.html")]
      [:li (link "Burning Man" "personal/burningman.html")]
      [:li (link "Kallisti" "personal/kallisti.html")]]]

    [:li.parent
     (link "Professional" "professional/keen.html")
     [:ul.sub
      [:li (link "Keen" "professional/keen.html")]
      [:li (link "Consulting" "professional/consulting.html")]
      [:li (link "Resume" "professional/resume.html")]]]

    [:li.parent
     (link "Blog" "blog/index.html")
     [:ul.sub
      [:li (link "Tags" "blog/tags.html")]
      [:li (link "Atom Feed" "atom.xml")]]]

    [:li (link "Contact" "contact.html")]]]))

[:head

 [:title
  (if (= (:title site) "home")
    (:site-title site)
    (str (:site-title site) " - " (:title site)))]

 [:meta {:class   "viewport"
         :name    "viewport"
         :content "width=device-width, initial-scale=1.0"}]
 [:meta {:content "IE=edge" :http-equiv="X-UA-Compatible"}]
 [:meta {:charset (:charset site)}]


 [:link {:rel   "shortcut icon"
         :href  "/img/favicon.png"}]
 [:link {:href  "/atom.xml"
         :rel   "alternate"
         :title "Evolving Ideas - Kevin Litwack's Blog"
         :type  "application/atom+xml"}]

 (css ["/css/prettify.css" (:css site ()) (:extra-css site ())])
; (css {:media "only screen and (max-device-width:480px)"} (:device-css site))
 (css "/css/ie/ie.css")]
; /head

[:body.fixed-header

 [:div.page-box
  [:div.page-box-content

   [:header {:class "header header-two"}
    [:div.container
     [:div.row
      [:div {:class "col-xs-6 col-md-2 col-lg-3 logo-box"}
       [:div.logo
        [:a {:href "/"}
            [:img {:src "/img/logo2.png" :class "logo-img" :alt ""}]
        ]]]

      [:div {:class "col-xs-6 col-md-10 col-lg-9 right-box"}
       [:div.right-box-wrapper
        [:div.primary
         [:div {:class "navbar navbar-default" :role "navigation"}
          (menu)]]]]]]]

   [:section#main
    [:article.content
     [:div.container
      [:div.row contents]]]]]]

 [:footer#footer
  [:div.footer-bottom
   [:div.container
    [:div.row
     [:div {:class "copyright col-xs-12 col-sm-6 col-md-6"}
      "Copyright © Kevin Litwack, 2014"]
     [:div {:class "col-xs-12 col-sm-6 col-md-6"}
      [:a {:href "#" :class "up"}
       [:span {:class "glyphicon glyphicon-arrow-up"}]]]]]]]

;(link (str "@" (:twitter site)) (str "http://twitter.com/" (:twitter site)))

 (js ["/js/prettify.js"
      "/js/lang-clj.js"
      (:js site ())])]
; /body
