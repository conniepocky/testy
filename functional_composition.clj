;;Functional composition

(str "Nam " "Tae" "hyun")

(comment
  (prn "iuhkiufhiusjhsrdujihy"))

(comp first reverse)


;;Polymorphic responds differently depending on number of args


(def trim-uppercase 
  (comp clojure.string/upper-case
        clojure.string/trim))

(trim-uppercase " jhope ")

(clojure.string/trim " hi ") ;; trim removes whitespace and trims string


(defn uppercase [arg] (clojure.string/upper-case arg))

(comp uppercase)

(uppercase "meow")

((juxt first rest)[1 2 3])

(comp first #(drop %2 %1))
