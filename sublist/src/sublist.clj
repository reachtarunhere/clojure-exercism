(ns sublist)

(defn classify [list1 list2] ;; <- arglist goes here

  (defn is-sublist-of [a b]
    (defn equal-starting-from [start] (= (take (count a) (drop start b)) a))
    (or (= a []) (some true? (map equal-starting-from (range 0 (count b))))))

    (cond
      (= list1 list2) :equal
      (is-sublist-of list1 list2) :sublist
      (is-sublist-of list2 list1)  :superlist
      :else :unequal)
)
