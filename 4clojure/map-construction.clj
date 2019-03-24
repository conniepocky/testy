(= (#(apply [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3}))

;;Github answer

#(apply hash-map (interleave %1 %2))
