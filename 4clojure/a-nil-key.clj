(fn [k m]
  (if (contains? m k)
    (= (m k) nil)
    false))
