(ns recursion)

(defn product [coll]
  (if (empty? coll)
    1
    (* (first coll)
       (product (rest coll)))))

; (product [1 2 4])
; (product (cons 1 (cons 2 (cons 4 '()))))
; (* 1 (product (cons 2 (cons 4 '()))))
; (* 1 (* 2 (product (cons 4 '()))))
; (* 1 (* 2 (* 4 (product '()))))
; (* 1 (* 2 (* 4 1)))
; (* 1 (* 2 4))
; (* 1 6)
; 6

(defn singleton? [coll]
  (and (not (empty? coll))
       (empty? (rest coll))))

(defn my-last [coll]
  (cond (empty? coll) nil
        (singleton? coll) (first coll)
        :else (my-last (rest coll))))

; Helper for max-element and longest-sequence.
(defn best-element [comp a-seq]
  (cond (empty? a-seq) nil
        (singleton? a-seq) (first a-seq)
        :else (let [a (first a-seq)
                    b (first (rest a-seq))
                    rem (rest (rest a-seq))]
                (best-element comp (cons (comp a b) rem)))))

(defn max-element [a-seq]
  (best-element max a-seq))

(defn seq-max [seq-1 seq-2]
  (let [count-1 (count seq-1)
        count-2 (count seq-2)]
    (if (> count-1 count-2) seq-1 seq-2)))

(defn longest-sequence [a-seq]
  (best-element seq-max a-seq))

(defn my-filter [pred? a-seq]
  (if (empty? a-seq)
    a-seq
    (if (pred? (first a-seq))
      (cons (first a-seq) (my-filter pred? (rest a-seq)))
      (my-filter pred? (rest a-seq)))))

(defn sequence-contains? [elem a-seq]
  (cond (empty? a-seq) false
        (= elem (first a-seq)) true
        :else (sequence-contains? elem (rest a-seq))))

(defn my-take-while [pred? a-seq]
  (cond (empty? a-seq) '()
        (not (pred? (first a-seq))) '()
        :else (cons (first a-seq)
                    (my-take-while pred? (rest a-seq)))))

(defn my-drop-while [pred? a-seq]
  (cond (empty? a-seq) '()
        (not (pred? (first a-seq))) a-seq
        :else (my-drop-while pred? (rest a-seq))))

(defn seq= [a-seq b-seq]
  (cond (and (empty? a-seq) (empty? b-seq)) true
        (or (empty? a-seq) (empty? b-seq)) false
        (not (= (first a-seq) (first b-seq))) false
        :else (seq= (rest a-seq) (rest b-seq))))

(defn my-map [f seq-1 seq-2]
  (if (or (empty? seq-1) (empty? seq-2))
    '()
    (cons (f (first seq-1) (first seq-2))
          (my-map f (rest seq-1) (rest seq-2)))))

(defn power [n k]
  (if (zero? k)
    1
    (* n (power n (- k 1)))))

(defn fib [n]
  (cond
    (zero? n) 0
    (= 1 n) 1
    :else (+ (fib (- n 1)) (fib (- n 2)))))

(defn my-repeat [how-many-times what-to-repeat]
  (if (> 1 how-many-times)
    '()
    (cons what-to-repeat
          (my-repeat (- how-many-times 1) what-to-repeat))))

(defn my-range [up-to]
  (if (> 1 up-to)
    '()
    (cons (- up-to 1)
          (my-range (- up-to 1)))))

(defn tails [a-seq]
  (if (empty? a-seq)
    [[]]
    (cons a-seq (tails (rest a-seq)))))

(defn inits [a-seq]
  (if (empty? a-seq)
    [[]]
    (cons a-seq
          (inits (reverse (rest (reverse a-seq)))))))

(defn rotations [a-seq]
  [:-])

(defn my-frequencies-helper [freqs a-seq]
  [:-])

(defn my-frequencies [a-seq]
  [:-])

(defn un-frequencies [a-map]
  [:-])

(defn my-take [n coll]
  [:-])

(defn my-drop [n coll]
  [:-])

(defn halve [a-seq]
  [:-])

(defn seq-merge [a-seq b-seq]
  [:-])

(defn merge-sort [a-seq]
  [:-])

(defn split-into-monotonics [a-seq]
  [:-])

(defn permutations [a-set]
  [:-])

(defn powerset [a-set]
  [:-])

