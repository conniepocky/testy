(defn answer-correct?
  [op n1 n2 user-answer]
  (if (= user-answer (str (op n1 n2)))
      (println "Correct! :)")
      (println "Incorrect! :(") 
))


(def operators [+ - *])
(def op->string {+ "plus" 
                 - "minus" 
                 * "times"})

(dotimes [n 3]

  (let [n1 (rand-int 12)
        n2 (rand-int 12)
        op (rand-nth operators)
        _ (println "Question" (inc n) ":" n1 (op->string op) n2)
        user-answer (read-line)]

    (answer-correct? op n1 n2 user-answer)))

(newline)
