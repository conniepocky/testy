(partition 2 1"waaaaaaaaaaaaaffle")

((fn [waffle]
   (flatten
     (filter
      (not= (first waffle) (second waffle)))))
 [1 1])

(fn [a]
  (map first (partition-by identity a)))
