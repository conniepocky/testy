(ns tic-tac-toe.views
  (:require
   [re-frame.core :as re-frame]
   [tic-tac-toe.subs :as subs]
   ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1 "Hello Waffles!"]
     [:h1 "Snape is the best!"]]))
     
