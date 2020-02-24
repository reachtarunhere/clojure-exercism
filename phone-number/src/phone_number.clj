(ns phone-number
  (:use [clojure.string :only [join]]))  

(defn number [num-string]
  (let [num-only (re-seq #"\d" num-string)]
    (join
     (cond
       (= 10 (count num-only)) num-only
       (and (= (count num-only) 11) (= "1" (first num-only))) (take-last 10 num-only)
       :else (repeat 10 0)))))
  
(defn area-code [num-string] ;; <- arglist goes here
  (join (take 3 (number num-string)))
)

(defn pretty-print [num-string] ;; <- arglist goes here
  (let [ac (area-code num-string)
        full-no (number num-string)
        ec (subs full-no 3 6)
        sn (subs full-no 6)
        ]
    (format "(%s) %s-%s" ac ec sn))
)
