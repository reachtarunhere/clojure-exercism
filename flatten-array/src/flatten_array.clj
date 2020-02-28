(ns flatten-array)

(defn flatten [arr] ;; <- arglist goes here
  (filter number? (tree-seq coll? identity arr))
)
