(ns collatz-conjecture)

(defn collatz [num] ;; <- arglist goes here
  (if (< num 1)
    (throw (Throwable. "num < 1 invalid."))
    (let [collatz-tail (fn [num ans]
                         (if (= num 1)
                           ans
                           (recur (if (odd? num) (+ 1 (* 3 num)) (/ num 2)) (+ 1 ans))))]
      (collatz-tail num 0))))
