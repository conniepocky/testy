(ns todo-list.core
  (:gen-class)
  (:require [clojure.string :as string]
            [ring.adapter.jetty :as jetty]))

(defn welcome
  [request]
  {:status 200
   :body "<h1>hello</h1> 
          <h1>happy birthday mummy! :)</h1> 
          <style>
           body {
             font-family: sans-serif;
           }
          </style>"
   :headers {}})

(defn -main
  [port-number]
  (jetty/run-jetty
    welcome
    {:port (Integer. port-number)}))

