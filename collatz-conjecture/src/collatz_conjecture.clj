(ns collatz-conjecture)

(defn- step [x] (if (even? x) (/ x 2) (+ 1 (* 3 x))))

(defn collatz [num] ;; <- arglist goes here
  (if (< num 1)
    (throw (Throwable. "num < 1 invalid."))
    (count (take-while #(> % 1) (iterate step num)))))

