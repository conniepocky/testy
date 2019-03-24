(println "Welcome to Fortnite Battle Royale!")

(println "Wear do you want to go?")

(println "You can go to Tilted Towers or Pleasant Park :)")

(def location (read-line))
(def tilted_map  "
0XX0000000
0XX000X000
0000000000
00000XX000
00000XX000
0000000000
  ")
(def pleasant_map "
0XX000XX00
0000000000
0000000000
XX0000XX00
0000000000
XX0000XX00
0000000000
  ")

(if (.contains location "tilted")
  (def m tilted_map)
  (def m pleasant_map)
)

(println m)

(def m (to-array m))

(def q (read-line)

(println (str (aget m q)))
