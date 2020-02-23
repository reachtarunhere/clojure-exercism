(ns nucleotide-count)

(defn nucleotide-counts [strand] ;; <- Arglist goes here
  (merge {\A 0 \T 0 \C 0 \G 0} (frequencies strand)))

(defn count-of-nucleotide-in-strand [nucleotide strand] ;; <- Arglist goes here
  {:pre [(#{\A \T \C \G} nucleotide)]}
  ((nucleotide-counts strand) nucleotide))

