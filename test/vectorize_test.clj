(ns vectorize-test
  (:require [midje.sweet :refer :all]
    [vectorize :refer :all]))

(fact "about vectors"
  (fact "sum two vectors with same elements number"
    (vectorize/sum (vector 1 2 3) (vector 4 5 6)) => (vector 5 7 9)))
