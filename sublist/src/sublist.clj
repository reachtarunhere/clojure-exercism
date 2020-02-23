(ns sublist)

(defn classify [list1 list2] ;; <- arglist goes here

  (defn is-sublist-of [a b]
    (defn equal-starting-from [start] (= (take (count a) (drop start b)) a))
    (or (= a []) (some true? (map equal-starting-from (range 0 (count b))))))

  (let [l1-sub-l2 (is-sublist-of list1 list2) l2-sub-l1 (is-sublist-of list2 list1)]
    (cond
      (and l1-sub-l2 l2-sub-l1) :equal
      l1-sub-l2 :sublist
      l2-sub-l1 :superlist
      :else :unequal))
)
