(ns ml-cortex.core
  (:require   
    [cortex.experiment.train :as train]  
    [cortex.nn.execute :as execute]  
    [cortex.nn.layers :as layers]  
    [cortex.nn.network :as network]  
    [tutorial :as tut] :reload))


(into [] (take 5 (tut/gen-random-seq-input)))
; [[9 0] [0 4] [2 5] [5 9] [3 9]]

(into [] (take 5 (tut/gen-random-seq)))
; [{:y [3], :x [1 3]} {:y [6], :x [3 2]} {:y [0], :x [0 2]}{:y [15], :x [3 5]} {:y [30], :x [6 5]}]


(def teach-dataset
  (into [] (take 20000 (tut/gen-random-seq))))
(def test-dataset
  (into [] (take 20000 (tut/gen-random-seq))))
