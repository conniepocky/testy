(require '[dynne.sampled-sound :refer :all])
;; Or, to use the API based on core.async
;; (require '[dynne.async-sound :refer :all])

;; Create a simple one-second, 440 Hz sine wave sound
(def s (sinusoid 1.0 440))

;; See what it looks like
(visualize s)

;; See what the first 0.01 seconds look like
(visualize (trim s 0 0.01))

;; Play it. Maybe turn down your volume a bit first. :)
(play s)

;; Define a new sound that fades `s` in over 0.5 seconds
(def s2 (fade-in s 0.5))

;; Visualize that
(visualize s2)

;; Get the double array holding the raw amplitude data of the first
;; channel of the first chunk. Note that we have to pass a sample
;; rate. File-based sounds will be converted to this rate.
(ffirst (chunks s2 16000))
;; => #<double[] [D@53b7f3b2>

;; Build up a more complicated sound
(def l (-> (sinusoid 3.0 440)
           (fade-in 1.5)))
(def r (-> (square-wave 3.0 880)
           (fade-out 1.5)))
(def s3 (-> (->stereo l r)
            (pan 0.3)))

;; And play it
(play s3)

;; And save it as a 44.1 KHz WAV
(save s3 "sample.wav" 44100)

;; Load it back in
(def s4 (read-sound "sample.wav"))

;; read-sound also works with MP3 files, but we can only save to WAV

;; Make a sound of our own design: two seconds of stereo white noise
(def s5 (fn-sound 2.0 2 (fn ^double [^long c ^double t] (- (rand 2.0) 1.0))))

;; Play it too
(play (gain s5 0.1))
