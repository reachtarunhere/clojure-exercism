(ns flatten-array)

(defn flatten-tco [arr output]
  (if (empty? arr)
    output
    (let [hd (first arr) tl (rest arr)]
      (if (coll? hd)
        (recur (concat hd tl) output)
        (recur tl (concat output [hd])))))
  
)




(defn flatten [arr] ;; <- arglist goes here
  (filter some? (flatten-tco arr '()))
)
