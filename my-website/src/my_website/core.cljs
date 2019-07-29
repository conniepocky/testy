(ns my-website.core
    (:require [reagent.core :as reagent :refer [atom]]))

(enable-console-print!)

(println "This text is printed from src/my-website/core.cljs. Go ahead and edit it and see reloading in action.")

;; define your app data so that it doesn't get over-written on reload

                                   
(defn website-title []
   [:div {:class "jumbotron centered-text"}
    [:h1 "Hello!"]
    [:h3 [:i "Welcome to my website :D"]]])
   
   
(defn about-cards [title text image link]
  [:div {:class "center-cards"}
    [:div {:class "card mb-4 shadow-sm"} 
        [:img {:src image :class "card-img-top"}] 
        [:div.card-body
          [:h5.card-title
            title]
          [:p.card-text
            text]
          [:a {:href link :class "btn btn-primary"}
            "Open Link!"]]]])



(defn hello-world []
  [:div
   [website-title]

   ;; Projects

   [:h1 {:class "centered-text"} "My Projects"]

   [:div {:class "row"} 
    [:div {:class "col-md-3"}
      [about-cards "K-Dash" "" " " "https://conniepocky.github.io/k-dash"]]]

   ;; Youtube/Twitch
   [:h1 {:class "centered-text"} "Where you can find me!"]
   [:div {:class "row"}

     [:div {:class "col-md-3"}
      [about-cards "My YouTube" "" "https://media.licdn.com/dms/image/C560BAQFWOfDVm7nHeg/company-logo_200_200/0?e=2159024400&v=beta&t=L7yzPfsyYeZUjkJc1Abfwbg-Nx710fAvwEYbf02LIEE" "https://www.youtube.com/channel/UCmdaAi8utcD7y951MfyhSbQ/featured?view_as=subscriber"]]
     
     [:div {:class "col-md-3"}
      [about-cards "My Codepen" "" "https://mainframe.ghost.io/content/images/2018/09/codepen.png" "https://codepen.io/waffles19/"]]

     [:div {:class "col-md-3"}
      [about-cards "My Twitch" "" "https://www-cdn.jtvnw.net/images/twitch_logo3.jpg" "https://www.twitch.tv/waffles193"]]]
   [:p {:class "centered-text"} "Made by Connie"]])

(reagent/render-component [hello-world]
                          (. js/document (getElementById "app")))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
