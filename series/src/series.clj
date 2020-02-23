(ns series)

(defn slices [string length] ;; <- arglist goes here
  (if (= 0 length)
    [""]
    (map clojure.string/join (partition length 1 string)))
)
