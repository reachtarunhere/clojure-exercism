(ns etl
  (:use [clojure.string :only [lower-case]]))

(defn transform [source] ;; <- arglist goes here
  (reduce (fn [out [point letters]] (into out (zipmap (map lower-case letters) (repeat (count letters) point))))
          {}
          source)
  )
   
