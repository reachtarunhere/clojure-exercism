(ns clock)

(defn clock->string [clock] ;; <- arglist goes here
    (format "%02d:%02d" (quot clock 60) (mod clock 60))
)

(defn clock [hours minutes] ;; <- arglist goes here
  (let [total-mins (+ (* 60 hours) minutes) mins-in-day (* 60 24)]
  (mod total-mins mins-in-day))
)

(defn add-time [input-clock time] ;; <- arglist goes here
  (clock 0 (+ input-clock time))
)
