(ns robot-name)

(def all-robos-ever [])

(defn generate-robo-name []
  (str
   (apply str (repeatedly 2 #(rand-nth (map char (range 65 91)))))
   (rand-nth (range 100 1000))))

(defn robot [] ;; <- arglist goes here
  (do
    (def all-robos-ever (conj all-robos-ever {:name (generate-robo-name) :id (count all-robos-ever)}))
    (peek all-robos-ever)))

(defn robot-name [robot] ;; <- arglist goes here
  (:name (nth all-robos-ever (:id robot)))
)

(defn reset-name [robot] ;; <- arglist goes here
  (do
    (def all-robos-ever (assoc-in all-robos-ever [(:id robot) :name] (generate-robo-name)))
    (get all-robos-ever (:id robot)))
)
