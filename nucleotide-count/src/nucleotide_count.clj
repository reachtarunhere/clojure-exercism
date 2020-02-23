(ns nucleotide-count)

(defn count-of-nucleotide-in-strand [nucleotide strand] ;; <- Arglist goes here
  (if (some #{nucleotide} [\A \T \C \G])
    (apply + (map #(if (= nucleotide %) 1 0) strand))
    (throw (Throwable. "Bad Nucleotide"))))

(defn- increment-key
  ;; also just adds the key if not found to avoid failiure in case of strand with unknown character
  [map key]
  (assoc map key (inc (get map key 0))))

(defn nucleotide-counts [strand] ;; <- Arglist goes here
  (reduce increment-key {\A 0 \T 0 \C 0 \G 0} strand)
)
