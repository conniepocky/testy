(ns fizz-buzz.core)

(defn fizzbuzz [n]
  (cond 
    (and (zero? (mod n 5))
         (zero? (mod n 3))) "Fizz Buzz"  
    (zero? (mod n 5)) "Fizz"
    (zero? (mod n 3)) "Buzz"
    :else n))

(fizzbuzz 12)
