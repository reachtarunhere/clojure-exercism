(ns phone-number)

(defn- only-numeric-chars [num-str]
  (filter #{\0 \1 \2 \3 \4 \5 \6 \7 \8 \9} num-str))

(defn number [num-string]
  (let [num-only-str (only-numeric-chars num-string)] 
    (clojure.string/join
     (cond
       (= 10 (count num-only-str)) num-only-str
       (and (= (count num-only-str) 11) (= \1 (first num-only-str))) (take-last 10 num-only-str)
       :else (repeat 10 0)))))
  
(defn area-code [num-string] ;; <- arglist goes here
  (clojure.string/join (take 3 (number num-string)))
)

(defn pretty-print [num-string] ;; <- arglist goes here
  (let [ac (area-code num-string)
        full-no (number num-string)
        ec (clojure.string/join (take 3 (drop 3 full-no)))
        sn (clojure.string/join (take-last 4 full-no))
        ]
    (str "(", ac, ") ", ec, "-", sn))
)
