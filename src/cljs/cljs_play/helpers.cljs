(ns cljs.core.typed.test.dnolen.utils.helpers)

(defn ^{:ann '[(Seqable Any) Any -> Any]}
  index-of [xs x]
  (let [len (count xs)]
    (loop [i 0]
      (if (< i len)
        (if (= (nth xs i) x)
          i
          (recur (inc i)))
        -1))))

