(println "Hello, World!")

;;===============================
(defn add 
  [a b]
  (println (+ a b)))

(println "\nAddition")
(add 5 6)
(println "==============")

;;===============================
(defn sub 
  [a b]
  (println (- a b)))

(println "\nSubtraction")
(sub 5 10)
(println "==============")

;;===============================
(defn mul 
  [a b] 
  (println (* a b)))

(println "\nMultiplication")
(mul 5 3)
(println "==============")

;;===============================
(defn div
  [a b] 
  (println (/ a b)))

(println "\nDivision")
(div 10 2)
(println "==============")

;;===============================
(defn pow 
  [a b]
  (println (Math/pow a b)))

(println "\nPotentiation")
(pow 2 3)
(println "==============")

;;===============================
(defn square-root 
  [a]
  (println (Math/sqrt a)))

(println "\nSquare root")
(square-root 16)
(println "==============")

;;===============================
(defn numbers-range 
  [initial end] 
  (println (map inc (range initial end))))

(println "\nNumbers range:")
(numbers-range 0 50)
(println "==============") 

