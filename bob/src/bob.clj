(ns bob
  (:use [clojure.string :only [upper-case blank? trim]]))

(defn- shouting? [s] (and (= (upper-case s) s) (some? (re-seq #"[A-Za-z]" s))))
(defn- qn? [s] (= \? (last (trim s))))

(defn response-for [s]
  (cond
    (blank? s) "Fine. Be that way!"
    (and (qn? s) (shouting? s)) "Calm down, I know what I'm doing!"
    (qn? s) "Sure."
    (shouting? s) "Whoa, chill out!"    
    :else "Whatever."))
