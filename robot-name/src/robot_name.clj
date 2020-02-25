(ns robot-name)
 
(def all-robo-list (atom []))

(defn generate-name-candidate []
  (str
   (apply str (repeatedly 2 #(rand-nth (map char (range 65 91)))))
   (rand-nth (range 100 1000))))

(defn unique-name []
  (first (drop-while (fn [cand] (#{cand} @all-robo-list)) (repeatedly generate-name-candidate))))

(defn robot [] ;; <- arglist goes here
  (do
    (swap! all-robo-list #(conj % (unique-name)))
    (dec (count @all-robo-list))))
     
(defn robot-name [robot] ;; <- arglist goes here
  (nth @all-robo-list robot)
)

(defn reset-name [robot] ;; <- arglist goes here
    (swap! all-robo-list #(assoc % robot (unique-name)))
)
