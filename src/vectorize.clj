(ns vectorize)

(def sum (partial map +))

(def subtract (partial map -))

(defn equals? [vector1 vector2]
  (every? true? (map == vector1 vector2)))

(defn pow [number]
  (* number number))

(defn length [vector]
  (Math/sqrt (reduce + (map pow vector))))
