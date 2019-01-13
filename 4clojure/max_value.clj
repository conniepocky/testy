
(defn apply_args_to_list [f & args] (apply f (list args)))
(last (sort (to-array (list 1 8 3 4))))

(last (sort (apply_args_to_list  to-array 1 8 3 4)))

