(ns game.core
  (:require [play-clj.core :refer :all]
            [play-clj.ui :refer :all]
            [play-clj.g2d :refer :all]))
(defn move
  [entity direction]
  (case direction
    :down (update entity :y dec)
    :up (update entity :y inc)
    :left (update entity :x dec)
    :right (update entity :x inc)
    nil))

(defscreen main-screen
  :on-show
  (fn [screen entities]

    (update! screen :renderer (stage))
    (assoc (label "meow" (color :blue))
           :id :fps
           :x 50
           :y 50)

    (assoc (texture "snape.jpeg")
         :x 150 :y 150 :width 150 :height 150))


  :on-render
  (fn [screen entities]
    (clear!)
    (render! screen entities))

  :on-key-down
  (fn [screen entities]
    (cond
      (= (:key screen) (key-code :dpad-up))
      (println "up")
      (= (:key screen) (key-code :dpad-down))
      (println "down")
      (= (:key screen) (key-code :dpad-right))
      (println "right")
      (= (:key screen) (key-code :dpad-left))
      (println "left"))))

(defgame game-game
  :on-create
  (fn [this]
    (set-screen! this main-screen)))
