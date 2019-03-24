(ns bts.core
    (:require [reagent.core :as reagent :refer [atom]]))

(enable-console-print!)

(println "This text is printed from src/bts/core.cljs. Go ahead and edit it and see reloading in action.")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Ultimate BTS Guide Online!"}))



(defn hello-world []
  [:div
   [:div.jumbotron.text-center  
    [:h1 (:text @app-state)]]

   [:h3 "The Basics"]
   [:li "You got no Jams means you got no fun. RM said it."]
   [:li "Jin is the oldest member"]
   [:li "Jungkook is the maknae (youngest)"]
   [:li "J-Hope, RM and Suga are the rappers of the group. But just because they are rappers doesn't mean they can't sing!!! I got bias wrecked by J-Hope's singing btw"]
   [:li "Jimin, V and Jungkook are in the maknae line which is all of the youngest members"]
   [:li "Jin, Suga, J-Hope and RM are in the hyung line (oldest members)"]
   [:li "A.R.M.Y is the fangroup for BTS"]
   [:h3 "The fanchant"]
   [:p "The beginning of every BTS fanchant starts with the A.R.M.Y chanting their full names"]
   [:hr]
   [:p "Kim Namjoon, Kim Seokjin, Min Yoongi, Jung Hoseok, Park Jimin, Kim Taehyung, Jeon Jungkook BTS!"]
   [:h3 "Jin (Kim Seokjin)"]
   [:li "Worldwide handsome"]
   [:li "Scared easily"]
   [:li "Oldest member"]])

(reagent/render-component [hello-world]
                          (. js/document (getElementById "app")))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
