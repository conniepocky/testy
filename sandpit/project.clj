(defproject sandpit "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-firmata "2.1.1"]])


(require 'cemerick.pomegranate.aether)
(cemerick.pomegranate.aether/register-wagon-factory!
     "http" #(org.apache.maven.wagon.providers.http.HttpWagon.))

