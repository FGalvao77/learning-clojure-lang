"Imprimindo o Hello, World!"
(println "\nHello, World!")

;;===============================
(defn numbers-add
  [a b]
  (println (+ a b)))

(println "\nAddition")
(numbers-add 5 6)
(println "==============")

;;===============================
(defn numbers-sub
  [a b]
  (println (- a b)))

(println "\nSubtraction")
(numbers-sub 5 10)
(println "==============")

;;===============================
(defn numbers-mul
  [a b]
  (println (* a b)))

(println "\nMultiplication")
(numbers-mul 5 3)
(println "==============")

;;===============================
(defn numbers-div
  [a b]
  (println (/ a b)))

(println "\nDivision")
(numbers-div 10 2)
(println "==============")

;;===============================
(defn numbers-pow
  [a b]
  (println (Math/pow a b)))

(println "\nPotentiation")
(numbers-pow 2 3)
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
  "Função para gerar um range de números:
  - initial: início
  - end: fim"
  [initial end]
  (println (map inc (range initial end))))

(println "\nNumbers range:")
(numbers-range 0 50)
(println "==============")

;;===============================
(defn can-drink?
  [age]
  (if (> age 18) "Beer" "Coke"))

(println "\nConditional 'if':")
(println (can-drink? 15))
(println "==============")

(defn can-drive?
  [age]
  (if (< age 18) "Can't drive!", "You can drive!"))

(println "\nConditional 'if':")
(println (can-drive? 17))
(println "==============")

(println "\nConditional 'if':")
(println (can-drive? 18))
(println "==============")