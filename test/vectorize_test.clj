(ns vectorize-test
  (:require [midje.sweet :refer :all]
    [vectorize :refer :all]))

(fact "about vectors"
  (fact "sum two vectors with same elements number"
    (vectorize/sum (vector 1 2 3) (vector 4 5 6)) => (vector 5 7 9))

  (fact "sum more than two vectors wit same number of elements"
    (vectorize/sum (vector 1 2) (vector 3 4) (vector 5 6)) => (vector 9 12)))
