(ns shinee.core
    (:require [reagent.core :as reagent :refer [atom]]))

(enable-console-print!)

(println "This text is printed from src/shinee/core.cljs. Go ahead and edit it and see reloading in action.")

;; define your app data so that it doesn't get over-written on reload


(defn hello-world []
  [:div.heading
   [:h1 "SHINEE WORLD"]
   [:hr]
   [:h3 "SHINee is a group with 5 Members 5 Visuals 5 Vocals and 5 Dancers"]
   [:img {:src "https://nerdloveshop.files.wordpress.com/2017/12/shinee.png?w=827"}]
   [:p "Left to right: Onew, Taemin, Jonghyun, Minho and Key"]])

(reagent/render-component [hello-world]
                          (. js/document (getElementById "app")))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
