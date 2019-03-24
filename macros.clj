(defmacro reverse-string [text]
  (clojure.string/reverse text))

(reverse-string "BTS")

(comment
  (str "jung" "hoseok"))

(defmacro square-test [x]
  (+ x x))

(defmacro squarem [x]
  '(let [x# ~x]
    (* x# x#)))

(squarem (rand-int 100))
