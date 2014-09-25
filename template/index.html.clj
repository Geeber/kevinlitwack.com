;; Define template options here
; @layout  default
; @title   Welcome!

(p "Why are you here?")

[:div#accordian {:class "panel-group multi-collapse"}
 [:div {:class "panel panel-default"}
  [:div.panel-heading
   [:div.panel-title
    [:a {:data-toggle "collapse" :data-parent "#accordion" :href "#collapse1"}
        "I'm interested in some technology that you work on"]]]
  [:div#collapse1 {:class "panel-collapse collapse"}
   [:div.panel-body
    (p "Oh, so you're a nerd. Cool, me too! You're probably going to want to look at the
       professional side of my site.")]]]

 [:div {:class "panel panel-default"}
  [:div.panel-heading
   [:div.panel-title
    [:a {:data-toggle "collapse" :data-parent "#accordion" :href "#collapse2"}
        "I read your blog, or want to!"]]]
  [:div#collapse2 {:class "panel-collapse collapse"}
   [:div.panel-body
    (p "That's very kind of you :) Head on over to the "
       (link "blog" "/blog/")
       ".")]]]

 [:div {:class "panel panel-default"}
  [:div.panel-heading
   [:div.panel-title
    [:a {:data-toggle "collapse" :data-parent "#accordion" :href "#collapse3"}
        "I heard that you did some kind of crazy sailing trip?"]]]
  [:div#collapse3 {:class "panel-collapse collapse"}
   [:div.panel-body
    (p "That's right, you can read more about "
       (link "Kallisti's journey" "/personal/kallisti.html")
       " or "
       (link "ask me about it" "/contact.html")
       " any time - I'm always happy to tell stories.")]]]

 [:div {:class "panel panel-default"}
  [:div.panel-heading
   [:div.panel-title
    [:a {:data-toggle "collapse" :data-parent "#accordion" :href "#collapse4"}
        "I'm interested in Burning Man and/or Playasophy Camp"]]]
  [:div#collapse4 {:class "panel-collapse collapse"}
   [:div.panel-body
    (p "Burning Man's pretty great. I've got a "
       (link "page" "/personal/burningman.html")
       " about it.")]]]

 [:div {:class "panel panel-default"}
  [:div.panel-heading
   [:div.panel-title
    [:a {:data-toggle "collapse" :data-parent "#accordion" :href "#collapse5"}
        "I'm your mother/father/brother/aunt/uncle/other family member"]]]
  [:div#collapse5 {:class "panel-collapse collapse"}
   [:div.panel-body
    (p "Awww, it's so sweet of you to check in on me :) Unfortunately there's probably not much on
       here that you don't already know, but it's always good to get pageviews! Also, let me know
       if you see any particularly glaring bugs or typos.")]]]

 [:div {:class "panel panel-default"}
  [:div.panel-heading
   [:div.panel-title
    [:a {:data-toggle "collapse" :data-parent "#accordion" :href "#collapse6"}
        "I dunno man, I was just like, browsing the internet, and then suddenly I was here..."]]]
  [:div#collapse6 {:class "panel-collapse collapse"}
   [:div.panel-body
    (p "Right on, bro. Here, "
       (link "watch this" "https://www.youtube.com/watch?v=foxD6ZQlnlU")
       ".")]]]

 ]
