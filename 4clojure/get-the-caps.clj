(filter #"[A-Z]+" %) ;;regex

;;Regex = regular expression

(reduce + [1 2 3])

(fn [pattern]
  (reduce str (re-seq #"[A-Z]+" pattern)))
