[1 2 3 4 5]


(first [1 2 3 4 5])

(second [1 2 3 4 5])



;; count a seq

#(reduce + (map (constantly 1) %))


;;reverse a seq

(fn [x]
  (reduce conj () x))
