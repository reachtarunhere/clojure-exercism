(ns nucleotide-count)

(defn count-of-nucleotide-in-strand [nucleotide strand] ;; <- Arglist goes here
  (if (some #{nucleotide} [\A \T \C \G])
    (apply + (map #(if (= nucleotide %) 1 0) strand))
    (throw (Throwable. "Bad Nucleotide"))))


(defn nucleotide-counts [strand] ;; <- Arglist goes here
  (reduce #(assoc %1 %2 (inc (%1 %2))) {\A 0 \T 0 \C 0 \G 0} strand)
)
