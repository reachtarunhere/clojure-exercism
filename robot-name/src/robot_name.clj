(ns robot-name)
 
(def all-robo-list [])

(defn generate-robo-name []
  (str
   (apply str (repeatedly 2 #(rand-nth (map char (range 65 91)))))
   (rand-nth (range 100 1000))))


(defn robot [] ;; <- arglist goes here
  (do
    (def all-robo-list (conj all-robo-list (generate-robo-name)))
    (dec (count all-robo-list))))
     
(defn robot-name [robot] ;; <- arglist goes here
  (nth all-robo-list robot)
)

(defn reset-name [robot] ;; <- arglist goes here
    (def all-robo-list (assoc all-robo-list robot (generate-robo-name)))
)
