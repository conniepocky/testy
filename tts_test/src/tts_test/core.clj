(use '[clojure.java.shell :only [sh]])


(sh "aws polly synthesize-speech ")
