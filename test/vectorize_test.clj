(ns vectorize-test
  (:require [midje.sweet :refer :all]
    [vectorize :refer :all]))

(facts "about vectors"
  (fact "sum two vectors with same elements number"
    (vectorize/sum (vector 1 2 3) (vector 4 5 6)) => (vector 5 7 9))

  (fact "sum more than two vectors with same number of elements"
    (vectorize/sum (vector 1 2) (vector 3 4) (vector 5 6)) => (vector 9 12))

  (fact "subtract two vectors"
    (vectorize/subtract (vector 1 2 3) (vector 4 5 6)) => (vector -3 -3 -3))

  (fact "subtract multiple vectors")
    (vectorize/subtract (vector 10 9) (vector 0 2) (vector 6 1)) => (vector 4 6)

  (fact "verify vector equality"
    (vectorize/equals? (vector 1 2) (vector 1 2)) => true)

  (fact "vectors are not equals"
    (vectorize/equals? (vector 1 2) (vector 4 9)) => false)

  (fact "calculates length"
    (vectorize/length (vector 3 4)) => 5.0))
