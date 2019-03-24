(ns snape-bot.core
  (:require [twitter.oauth :as oauth]))

(defonce app-consumer-key (System/getenv "TWITTER_CONSUMER_KEY"))
(defonce app-consumer-secret (System/getenv "TWITTER_CONSUMER_SECRET"))
(defonce user-access-token (System/getenv "TWITTER_ACCESS_TOKEN"))
(defonce user-access-token-secret (System/getenv "TWITTER_ACCESS_TOKEN_SECRET"))

(def creds (oauth/make-oauth-creds
             app-consumer-key
             app-consumer-secret
             user-access-token
             user-access-token-secret))

(defn -main [])

  
