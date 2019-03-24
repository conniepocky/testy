(ns cats.core
    (:require [reagent.core :as reagent :refer [atom]]))

(enable-console-print!)

(println "This text is printed from src/cats/core.cljs. Go ahead and edit it and see reloading in action.")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Hello Waffles!!"
                          :cat-page? true}))

(defonce cats (atom {:text 0}))


(defn hello-world []
  [:div
   [:h1 (:text @app-state)]
   [:h3 "Snape is the best!!!!!!!!!"]
   [:h3 "And so are cats!"]
   [:h3 "Snape has meowed " (:text @cats) " times!"]
   [:img {
  }]]:on-click (fn alert_meo ] 
    ])(js/alert "MEOW)
                (swap! app-state assoc :text "MEOWWWWWWW!")
                (swap! cats update :text inc
  )):src "snape.jpe)]
  

(defn card []
  [:div.page
   [:div
    [:p "hi!!!!!!!!!!!"]]])

(defn index []
  [:div 
   [:button {:on-click #(swap! app-state update :cat-page? not)} "click me"]
   (if (:cat-page? @app-state) [hello-world] [card])]) 

(reagent/render-component [index]
                          (. js/document (getElementById "app")))

(defn on-js-reload [])
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
