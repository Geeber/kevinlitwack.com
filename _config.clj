{
 ;; directory setting
 :public-dir   "public/"
 :tag-out-dir  "blog/tag/"
 :template-dir "template/"
 :post-dir     "posts/"
 :layout-dir   "layouts/"

 ;; posts and tags url setting
 ;;   default value: "/"
 ;;   ex)
 ;;     "/"    => "/YYYY-MM/POST.html"
 ;;     "/foo" => "/foo/YYYY-MM/POST.html"
 :url-base     "/"
 :blog-base    "/blog"

 ;; dev server port
 ;;   default value: 8080
 :port 8080

 ;; site language
 ;;   default value: "en"
 :lang "en"

 ;; default site data
 :site {:atom-base  "http://kevinlitwack.com"
        :charset    "utf-8"
        :site-title "Kevin Litwack"
        :twitter    "KevinLitwack"
        :css        ["http://fonts.googleapis.com/css?family=Josefin+Sans"
                     "/css/buttons/social-icons.css"
                     "/css/font-awesome.min.css"
                     "/css/bootstrap.min.css"
                     "/css/jslider.css"
                     "/css/settings.css"
                     "/css/jquery.fancybox.css"
                     "/css/animate.css"
                     "/css/video-js.min.css"
                     "/css/morris.css"
                     "/css/royalslider/royalslider.css"
                     "/css/royalslider/skins/minimal-white/rs-minimal-white.css"
                     "/css/layerslider/layerslider.css"
                     "/css/ladda.min.css"
                     "/css/style.css"
                     "/css/responsive.css"
                     "/css/customizer/pages.css"
                     "/css/customizer/home-pages-customizer.css"]
        :device-css []
        :js         ["http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"
                     "js/bootstrap.min.js"
                     "js/jquery.carouFredSel-6.2.1-packed.js"
                     "js/jquery.touchSwipe.min.js"
                     "js/jquery.elevateZoom-3.0.8.min.js"
                     "js/jquery.imagesloaded.min.js"
                     "js/jquery.appear.js"
                     "js/jquery.sparkline.min.js"
                     "js/jquery.easypiechart.min.js"
                     "js/jquery.easing.1.3.js"
                     "js/jquery.fancybox.pack.js"
                     "js/isotope.pkgd.min.js"
                     "js/jquery.knob.js"
                     "js/jquery.stellar.min.js"
                     "js/jquery.selectBox.min.js"
                     "js/jquery.royalslider.min.js"
                     "js/jquery.tubular.1.0.js"
                     "js/country.js"
                     "js/spin.min.js"
                     "js/ladda.min.js"
                     "js/masonry.pkgd.min.js"
                     "js/morris.min.js"
                     "js/raphael.min.js"
                     "js/video.js"
                     "js/pixastic.custom.js"
                     "js/livicons-1.3.min.js"
                     "js/layerslider/greensock.js"
                     "js/layerslider/layerslider.transitions.js"
                     "js/layerslider/layerslider.kreaturamedia.jquery.js"
                     "js/revolution/jquery.themepunch.plugins.min.js"
                     "js/revolution/jquery.themepunch.revolution.min.js"
                     "js/main.js"]}

 ;; post file compile hook
 :compile-with-post ["index.html.clj" "atom.xml.clj"]

 ;; tag setting
 :tag-layout "tag"

 ;; post setting
 ;;   default value: #"(\d{4})[-_](\d{1,2})[-_](\d{1,2})[-_](.+)$"
 :post-filename-regexp #"(\d{4})[-_](\d{1,2})[-_](\d{1,2})[-_](.+)$"
 :post-filename-format "$(year)-$(month)/$(filename)"

 ;; post sort type (:date :name :title :date-desc :name-desc :title-desc)
 ;;   default value: :date-desc
 :post-sort-type :date-desc

 ;; regexp to detect index template
 ;;   default value: #"^index\."
 :index-template-regexp #"^index\.html\.clj$"

 ;; post number per page
 ;;   default value: nil (disabled pagination)
 :posts-per-page 3

 ;; filename format to generate index file with pagination
 ;;   default value: "page$(page)/$(filename)"
 :page-filename-format "blog/page$(page)/$(filename)"

 ;; clojurescript compile options
 ;; src-dir base is `:template-dir`
 ;; output-dir base is `:public-dir`
 ;:cljs {:src-dir       "cljs"
 ;       :output-to     "js/main.js"
 ;       :optimizations :whitespace
 ;       :pretty-print true}

 ;; highlight setting
 :code-highlight {:CLJ "lang-clj", :CLOJURE "lang-clj"}

 ;; flag for detailed log
 ;;   default value: false
 :detailed-log true;false

 ;; flag for error notification
 ;;   default value: false
 :notify? false

 ;; notify setting(OPTIONAL)
 :notify-setting {;; title for fixing notification
                  ;;  default value: "$(filename)"
                  :fixed-title  "$(filename)"
                  ;; message for fixing notication
                  ;;   default value: "FIXED"
                  :fixed        "FIXED"
                  ;; title for failing notification
                  ;;   default value: "$(filename) : $(line)"
                  :failed-title "$(filename) : $(line)"
                  ;; message for failing notification
                  ;;   default value: $(message)
                  :failed       "$(message)"}

 ;; compiler setting
 ;;   default value: "default"
 :compiler "default"
}
