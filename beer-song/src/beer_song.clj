(ns beer-song)

(defn verse
  "Returns the nth verse of the song."
  [num]
  (defn n-bottles [n] (if (= n 1) "1 bottle" (str n " bottles")))
  (case num
    0 (str "No more bottles of beer on the wall, no more bottles of beer.\n"
           "Go to the store and buy some more, 99 bottles of beer on the wall.\n")
    1 (str "1 bottle of beer on the wall, 1 bottle of beer.\n"
           "Take it down and pass it around, no more bottles of beer on the wall.\n")
    (str (n-bottles num), " of beer on the wall, " (n-bottles num), " of beer.\n"
       "Take one down and pass it around, "(n-bottles (- num 1)), " of beer on the wall.\n")))
    

    


  
  ;; (case num
  ;;   0 (str "No more bottles of beer on the wall, no more bottles of beer.\n"
  ;;          "Go to the store and buy some more, 99 bottles of beer on the wall.\n")
  ;;   1 (str "1 bottle of beer on the wall, 1 bottle of beer.\n"
  ;;          "Take it down and pass it around, no more bottles of beer on the wall.\n")
  ;;   (str num, " bottles of beer on the wall, ", num, " bottles of beer.\n"
  ;;      "Take one down and pass it around, ", (- num 1), " bottles of beer on the wall.\n")))
  

(defn sing
  "Given a start and an optional end, returns all verses in this interval. If
  end is not given, the whole song from start is sung."
  ([start] (sing start 0))
  ([start end]
   (if (= start end)
     (verse start)
     (str (verse start) "\n" (sing (- start 1) end))))
  )
