(ns grade-school)

(defn grade [school grade]  ;; <- arglist goes here
  (vec (school grade))
)

(defn add [school name grade]  ;; <- arglist goes here
  (merge-with concat school {grade [name]})
)

(defn sorted [school]  ;; <- arglist goes here  
  (into (sorted-map)
        (zipmap (keys school) (map sort (vals school))))
)
