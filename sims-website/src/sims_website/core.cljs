(ns sims-website.core
    (:require [reagent.core :as reagent :refer [atom]]))

(enable-console-print!)

(println "This text is printed from src/sims-website/core.cljs. Go ahead and edit it and see reloading in action.")

;; define your app data so that it doesn't get over-written on reload




(defn hello-world []
  [:div
   [:h1 "All about my Sims!"]
   [:img {:src "http://sims-online.com/wp-content/uploads/2015/02/the-sims-4-base-game-official-logo.png" :width "250px"}]
   [:h3 "Generation 1"]
   [:li "Connie Snape"]
   [:li "Severus Snape"]
   [:h3 "Generation 2"]
   [:li "Ashe (born 1st September 1969) and Jay(Japanese and born on 9th October 1970)"]
   [:li "Meghan (born 20th of January 1970) and Wilson (born 31st October 1977)"]
   [:li "Wade (born 31st October 1977) and Hazel (born 7th May 1977) (previously Wade and Logan or Wade and Cassandra"]
   [:li "Logan (born 1st November 1977 died 31st October 2006)"]
   [:li "Cassandra (born January 30th 1980)"]
   [:li "Lukas (married to Rose and born on April 17th 1979)"]
   [:li "Rose (born on April 20th 1982)"]
   [:li "Violet (born on April 20th 1982) and Dwayne (Indian and born on June 8th 1982)"]
   [:h3 "Generation 3"]
   [:li "Pheonix (Japanese and Ashe and Jay daughter born on 10th November 1994) and Preston (German and born on 11th November 1995"]
   [:li "Lucy (born on December 25th 1995 Wade and Logan adopted daughter)"]
   [:li "River (born April 1st 1998 Rose and Max teen pregnancy child)"]
   [:li "Json (born 12th July 2000 Wilson and Meghan son)"]
   [:li "Alice (born 24th February 2006 Wade and Logan's daughter)"]
   [:li "Milo (born 1st May 2004 Violet and Dwayne's son)"]
   [:li "Linux (born on 3rd May 2004 Ashe and Jay's son)"]
   [:h3 "Generation 4"]
   [:li "Kiera (born 18th Febuary 2004 River's daughter)"]])

(reagent/render-component [hello-world]
                          (. js/document (getElementById "app")))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
