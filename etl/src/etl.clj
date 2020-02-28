(ns etl
  (:use [clojure.string :only [lower-case]]))

(defn transpose [[point letters]]
  (zipmap (map lower-case letters) (repeat point))

(defn transform [source] ;; <- arglist goes here
  (reduce #(into %1 (tranpose %2)) {} source)
  )
   
