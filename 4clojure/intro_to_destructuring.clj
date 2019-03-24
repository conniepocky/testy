(def my-line [[5 10] [10 20]])

(let [p1 (first my-line)
      p2 (second my-line)
      x1 (first p1)
      y1 (second p1)
      x2 (first p2)
      y2 (second p2)]
  (str "Line from (" x1 "," y1 ") to (" x2 ", " y2 ")"))


(let [[p1 p2] my-line
      [x1 y1] p1
      [x2 y2] p2]
  (str x1 y2 x2 y2))

(def first-name "Connie")

('first-name)

(first-name)

;;Answer


(= [2 4] (let [[a b c d e] [0 1 2 3 4]] [c e]))


;;Destructuring 2

y z

;;or

(func coll)

func coll
