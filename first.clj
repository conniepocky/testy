
(def my_favourite_thingys (str "waffle " "icecream " "snape " "bobbin " "linux " "coding "))

(clojure.string/includes? my_favourite_thingys "waffle")

(def bad_spellings "linux si beeteer than windowooows")

(def good_spellings (clojure.string/replace bad_spellings "beeteer" "better"))

(def good_spellings2 (clojure.string/replace good_spellings "windowooows" "windows"))

(clojure.string/replace good_spellings2 "si" "is")