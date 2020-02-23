(ns nucleotide-count)

(defn- increment-key
  ;; also just adds the key if not found to avoid failiure in case of strand with unknown character
  [map key]
  (assoc map key (inc (get map key 0))))

(defn nucleotide-counts [strand] ;; <- Arglist goes here
  (reduce increment-key {\A 0 \T 0 \C 0 \G 0} strand)
)

(defn count-of-nucleotide-in-strand [nucleotide strand] ;; <- Arglist goes here
  (if (some #{nucleotide} [\A \T \C \G])
    ((nucleotide-counts strand) nucleotide)
    (throw (Throwable. "Bad Nucleotide"))))
