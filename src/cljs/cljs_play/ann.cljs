(ns cljs-play.ann
  (:require-macros [cljs.core.typed :refer [ann check-ns]]))

(ann foo number)
(def foo 1)
