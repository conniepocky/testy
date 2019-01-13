(fn [size-of-series]
  (map first (reductions 
              (fn [[primary secondary] _] [secondary (+ primary secondary)]
                [1 1]
                (range 1 size-of-series)))))
