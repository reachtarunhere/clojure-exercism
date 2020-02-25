(ns clock)

(defn clock->string [clock] ;; <- arglist goes here
    (format "%02d:%02d" (first clock) (second clock))
)

(defn clock [hours minutes] ;; <- arglist goes here
  (let [total-mins (mod (+ (* 60 hours) minutes)  (* 60 24))
        real-hrs (quot total-mins 60)
        real-mins (mod total-mins 60)]
    (list real-hrs real-mins))
)

(defn add-time [clock-tuple time] ;; <- arglist goes here
  (clock (first clock-tuple) (+ time (second clock-tuple)))
)
